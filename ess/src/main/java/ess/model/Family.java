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

import progress.hrStaffGeneral.wsdl.ListEmployeeInfoGeneralDetail;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Family")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Family.class)
public class Family implements Serializable {


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6737619119004724538L;

	private static Log log = LogFactory.getLog(Family.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;

	@Basic
	@Column(name="spouseFirstName")
	private String spouseFirstName;
	
	@Basic
	@Column(name="spouseLastName")
	private String spouseLastName;
	
	
	@Basic
	@Column(name="totalChildren")
	private Integer totalChildren;
	
	@Basic
	@Column(name="totalChildrenInEdu")
	private Integer totalChidrenInEdu;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Family() {
		super();
	}

	public Family(ListEmployeeInfoGeneralDetail detail) {
		this.spouseFirstName = detail.getSpouseTHFirstName();
		this.spouseLastName = detail.getSpouseTHLastName();
		this.totalChildren = detail.getChildren();
		this.totalChidrenInEdu = detail.getChildrenStudy();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getSpouseFirstName() {
		return spouseFirstName;
	}

	public void setSpouseFirstName(String spouseFirstName) {
		this.spouseFirstName = spouseFirstName;
	}

	public String getSpouseLastName() {
		return spouseLastName;
	}

	public void setSpouseLastName(String spouseLastName) {
		this.spouseLastName = spouseLastName;
	}

	public Integer getTotalChildren() {
		return totalChildren;
	}

	public void setTotalChildren(Integer totalChildren) {
		this.totalChildren = totalChildren;
	}

	public Integer getTotalChidrenInEdu() {
		return totalChidrenInEdu;
	}

	public void setTotalChidrenInEdu(Integer totalChidrenInEdu) {
		this.totalChidrenInEdu = totalChidrenInEdu;
	}



	
}
