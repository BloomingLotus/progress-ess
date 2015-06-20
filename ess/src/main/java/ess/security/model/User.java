package ess.security.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import ess.model.Employee;


/**
 * @author dbuaklee
 *
 */
@Entity
@Table(name="SEC_USER")
//@SequenceGenerator(name="SEC_USER_SEQ", sequenceName="SEC_USER_SEQ", allocationSize=1)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope = User.class)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8516557587173147799L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEC_USER_SEQ")
	private Long id;
	
	@Basic
	@Column(name="login")
	private String username;
	
	@Basic
	private String password;

	@OneToOne
	@JoinColumn(name="EMP_ID")
	private Employee employee;
	
	@Transient
	private Integer empId;
	
	@Transient
	private String ticketId;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setTicketId(String ticketId) {
		// TODO Auto-generated method stub
		this.ticketId = ticketId;
	}
	
	public String getTicketId() {
		return ticketId;
	}

	
	
}
