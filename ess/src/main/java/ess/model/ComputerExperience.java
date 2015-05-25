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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="ComputerExp")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=ComputerExperience.class)
public class ComputerExperience implements Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 591047752734250566L;

	private static Log log = LogFactory.getLog(ComputerExperience.class);
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Basic
	@Column(name="programlang")
	private String programmingLanguage;
	
	@Basic
	@Column(name="certificate")
	private String certificate;
	
	@Basic
	@Column(name="certificateName")
	private String certificateName;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgramingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
