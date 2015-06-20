package ess.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import progress.hrEmployeeInfo.wsdl.ListEmployeeEducationInfo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Education")
//@SequenceGenerator(name="EDUCATION_SEQ", sequenceName="EDUCATION_SEQ", allocationSize=1)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Education.class)
public class Education implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3401240244777111623L;

	private static Log log = LogFactory.getLog(Education.class);
	
	/**
	 * 
	 */

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="EDUCATION_SEQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Basic
	@Column(name="yearBegin")
	private Integer yearBegin;
	
	@Basic
	@Column(name="yearEnd")
	private Integer yearEnd;
	
	@Basic
	@Column(name="instituteName")
	private String instituteName;
	
	@Basic
	@Column(name="degree")
	private String degree;
	
	@Basic
	@Column(name="faculty")
	private String faculty;
	
	@Basic
	@Column(name="major")
	private String major;
	
	@Basic
	@Column(name="gpa", columnDefinition="decimal", precision=4, scale=3)
	private BigDecimal gpa;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;
	
	public Education() {
		super();
	}
	
	public Education(ListEmployeeEducationInfo eduInfo) {
		this.degree = eduInfo.getDegreeName();
		this.faculty = eduInfo.getFaculty();
		this.gpa = eduInfo.getGPA();
		this.instituteName = eduInfo.getInstituteNameTH();
		this.major = eduInfo.getMajor();
		this.yearEnd = eduInfo.getGraduatedYear();
		this.yearBegin = eduInfo.getEntryYear();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Integer getYearBegin() {
		return yearBegin;
	}
	public void setYearBegin(Integer yearBegin) {
		this.yearBegin = yearBegin;
	}
	public Integer getYearEnd() {
		return yearEnd;
	}
	public void setYearEnd(Integer yearEnd) {
		this.yearEnd = yearEnd;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public BigDecimal getGpa() {
		return gpa;
	}
	public void setGpa(BigDecimal gpa) {
		this.gpa = gpa;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
			
}
