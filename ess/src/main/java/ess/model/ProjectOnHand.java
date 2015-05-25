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
@Table(name="projectOnHand")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=ProjectOnHand.class)
public class ProjectOnHand implements Serializable {


	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 151252308903903759L;



	private static Log log = LogFactory.getLog(ProjectOnHand.class);
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Basic
	@Column(name="projectName")
	private String projectName;
	
	@Basic
	@Column(name="projectDetail")
	private String projectDetail;
	
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDetail() {
		return projectDetail;
	}

	public void setProjectDetail(String projectDetail) {
		this.projectDetail = projectDetail;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
