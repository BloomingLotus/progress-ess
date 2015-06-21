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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="ChangeRequestLog")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=ChangeRequestLog.class)
public class ChangeRequestLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5196203388547594140L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ChangeRequest_ID")
	private ChangeRequest changeRequest;
	
	@ManyToOne
	@JoinColumn(name="Employee_ID")
	private Employee actor;
	
	@Enumerated(EnumType.STRING)
	@Column(name="toState")
	private ChangeState toState;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="timestamp")
	private Date timestamp;
	
	@Column(name="Remark")
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public ChangeRequest getChangeRequest() {
		return changeRequest;
	}

	public void setChangeRequest(ChangeRequest changeRequest) {
		this.changeRequest = changeRequest;
	}


	public Employee getActor() {
		return actor;
	}

	public void setActor(Employee actor) {
		this.actor = actor;
	}

	public ChangeState getToState() {
		return toState;
	}

	public void setToState(ChangeState toState) {
		this.toState = toState;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
