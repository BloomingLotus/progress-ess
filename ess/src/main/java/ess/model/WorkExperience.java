package ess.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="WorkExp")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=WorkExperience.class)
public class WorkExperience implements Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4849116478602874976L;

	private static Log log = LogFactory.getLog(WorkExperience.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="beginDate")
	private Date beginDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="endDate")
	private Date endDate;
	
	@Basic
	@Column(name="workplaceName")
	private String workplaceName;
	
	@Basic
	@Column(name="length")
	private String length;
	
	@Basic
	@Column(name="title")
	private String title;
	
	
	@Basic
	@Column(name="detail")
	private String detail;
	
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
