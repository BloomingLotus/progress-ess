package ess.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="ChangeRequest")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=ChangeRequest.class)
public class ChangeRequest  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1962798618402159952L;

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="domain")
	private String domain;
	
	@Lob
	@Column(name="newChangeSet")
	private String newChangeSet;
	
	@Lob
	@Column(name="oldChangeSet")
	private String oldChangeSet;
	
	@Column(name="lastRemark")
	private String lastRemark;
	
	@Enumerated(EnumType.STRING)
	@Column(name="currentState")
	private ChangeState currentState;
	
	@ManyToOne
	@JoinColumn(name="CreatedBy_Employee_ID")
	private Employee createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdTime")
	private Date createdTime;
	
	@ManyToOne
	@JoinColumn(name="LastUpdateddBy_Employee_ID")
	private Employee lastUpdatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastUpdatedTime")
	private Date lastUpdatedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getNewChangeSet() {
		return newChangeSet;
	}

	public void setNewChangeSet(String newChangeSet) {
		this.newChangeSet = newChangeSet;
	}

	public ChangeState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ChangeState currentState) {
		this.currentState = currentState;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Employee getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Employee lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getOldChangeSet() {
		return oldChangeSet;
	}

	public void setOldChangeSet(String oldChangeSet) {
		this.oldChangeSet = oldChangeSet;
	}

	public String getLastRemark() {
		return lastRemark;
	}

	public void setLastRemark(String lastRemark) {
		this.lastRemark = lastRemark;
	}

	public Boolean getIsFinalState() {
		if(this.currentState == ChangeState.APPROVED || this.currentState == ChangeState.REJECTED) 
			return true;
		
		return false;
 	}

	@Override
	public String toString() {
		return "ChangeRequest [id=" + id + ", domain=" + domain + ", newChangeSet=" + newChangeSet + ", oldChangeSet="
				+ oldChangeSet + ", lastRemark=" + lastRemark + ", currentState=" + currentState + ", createdBy="
				+ createdBy + ", createdTime=" + createdTime + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedTime="
				+ lastUpdatedTime + "]";
	}
	
	
	

	
}
