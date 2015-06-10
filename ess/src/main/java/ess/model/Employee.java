package ess.model;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Employee")
//@SequenceGenerator(name="EMPLOYEE_SEQ", sequenceName="EMPLOYEE_SEQ", allocationSize=1)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Employee.class)
public class Employee implements Serializable {

	private static Log log = LogFactory.getLog(Employee.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1816360620786306754L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="EMPLOYEE_SEQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	
	@Basic
	@Column(name="thtitle")
	private String thTitle;
	
	@Basic
	@Column(name="entitle")
	private String enTitle;
	
	
	@Basic
	@Column(name="thfirstname")
	private String thFirstName;
	
	@Basic
	@Column(name="thlastname")
	private String thLastName;
	
	@Basic
	@Column(name="enfirstname")
	private String enFirstName;
	
	@Basic
	@Column(name="enlastname")
	private String enLastName;
	
	@Basic
	@Column(name="thnickname")
	private String thNickName;
	
	@Basic
	@Column(name="ennickname")
	private String enNickName;
	
	@Basic
	@Column(name="status")
	private String status;
	
	@Basic
	@Column(name="homephoneno")
	private String homePhoneNo;
	
	@Basic
	@Column(name="mobilephone")
	private String mobilePhone;
	
	@Basic
	@Column(name="email")
	private String email;

	@Basic
	@Column(name="religious")
	private String religious;
	
	@Basic
	@Column(name="nationalityname")
	private String nationalityName;
	
	@Basic
	@Column(name="bankaccount")
	private String bankAccount;
	

	private Address registeredAddress;
	
	

	private Address currentAddress;
	
	
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

	public String getThNickName() {
		return thNickName;
	}

	public void setThNickName(String thNickName) {
		this.thNickName = thNickName;
	}

	public String getEnNickName() {
		return enNickName;
	}

	public void setEnNickName(String enNickName) {
		this.enNickName = enNickName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHomePhoneNo() {
		return homePhoneNo;
	}

	public void setHomePhoneNo(String homePhoneNo) {
		this.homePhoneNo = homePhoneNo;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReligious() {
		return religious;
	}

	public void setReligious(String religious) {
		this.religious = religious;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getThTitle() {
		return thTitle;
	}

	public void setThTitle(String thTitle) {
		this.thTitle = thTitle;
	}

	public String getEnTitle() {
		return enTitle;
	}

	public void setEnTitle(String enTitle) {
		this.enTitle = enTitle;
	}

	@ManyToOne
	@JoinColumn(name="registered_address_id")
	public Address getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(Address registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	@ManyToOne
	@JoinColumn(name="current_address_id")
	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

}
