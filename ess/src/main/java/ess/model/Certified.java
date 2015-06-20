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

import progress.hrEmployeeInfo.wsdl.ListEmployeeCertificationInfo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="certified")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Certified.class)
public class Certified implements Serializable {


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6737619119004724538L;

	private static Log log = LogFactory.getLog(Certified.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="certifiedExpired")
	private Date certifiedExpired;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="certifiedDate")
	private Date certifiedDate;
	
	@Basic
	@Column(name="instituteName")
	private String instituteName;
	
	@Basic
	@Column(name="certificateName")
	private String certificateName;
	
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Certified() {
		super();
	}
	
	public Certified(ListEmployeeCertificationInfo certInfo) {
		this.certificateName = certInfo.getCertificationName();
		this.certifiedDate = certInfo.getObtainedDate().toGregorianCalendar().getTime();
		this.instituteName = certInfo.getInstituteName();
		this.id = certInfo.getCertificationID().longValue();
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

	public Date getCertifiedExpired() {
		return certifiedExpired;
	}

	public void setCertifiedExpired(Date certifiedExpired) {
		this.certifiedExpired = certifiedExpired;
	}

	public Date getCertifiedDate() {
		return certifiedDate;
	}

	public void setCertifiedDate(Date certifiedDate) {
		this.certifiedDate = certifiedDate;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	

	
}
