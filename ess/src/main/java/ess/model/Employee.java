package ess.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Employee")
@SequenceGenerator(name="EMPLOYEE_SEQ", sequenceName="EMPLOYEE_SEQ", allocationSize=1)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Employee.class)
public class Employee implements Serializable {

	private Log log = LogFactory.getLog(this.getClass());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1816360620786306754L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="EMPLOYEE_SEQ")
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	
	private String thFirstName;
	
	private String thLastName;
	
	private String enFirstName;
	
	private String enLastName;
	
	
	public void setId(Long id) {
		this.id = id;
	}

	private Long id;

	public String getThFirstName() {
		return thFirstName;
	}

	public void setThFirstName(String thFirstName) {
		this.thFirstName = thFirstName;
	}

	public String getThLastName() {
		return thLastName;
	}

	public void setThLastName(String thLastName) {
		this.thLastName = thLastName;
	}

	public String getEnFirstName() {
		return enFirstName;
	}

	public void setEnFirstName(String enFirstName) {
		this.enFirstName = enFirstName;
	}

	public String getEnLastName() {
		return enLastName;
	}

	public void setEnLastName(String enLastName) {
		this.enLastName = enLastName;
	}
	
	
	

	
}
