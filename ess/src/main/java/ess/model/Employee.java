package ess.model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.Years;

import progress.hrStaffGeneral.wsdl.ListEmployeeInfoGeneralDetail;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

	public Employee() {
		super();
	}

	public Employee(ListEmployeeInfoGeneralDetail empDetail) {
		this.id = Long.valueOf(empDetail.getEmployeeID());
		
		this.thFirstName = empDetail.getTHFirstName();
		this.thLastName = empDetail.getTHLastName();
		this.thTitle = empDetail.getTHTitleName();
		this.titleId = empDetail.getTitleID();
		
		this.enFirstName = empDetail.getENFirstName();
		this.enLastName = empDetail.getENLastName();
		this.enTitle = empDetail.getENTitleName();
		
		this.enNickName = empDetail.getNickName();
		this.thNickName = empDetail.getNickName();
		
		this.status = empDetail.getMaritalStatusName();
		this.statusId = empDetail.getMaritalStatusID();
		this.mobilePhone = empDetail.getMobilePhoneNo();
		this.homePhoneNo = empDetail.getHomePhoneNo();
		this.email = empDetail.getOfficeEmail1();
		this.picture = empDetail.getAttachmentSource();
		
		this.position = empDetail.getPositionName();
		this.positionLevel = empDetail.getPositionLevelName();
		this.positionGroup = empDetail.getPositionGroupName();
		this.division = empDetail.getDivisionName();
		this.majorRoles = empDetail.getMajorRoleName();
	}


	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="EMPLOYEE_SEQ")
	@Column(name="ID")
	public Long getId() {
		return id;
	}


	private Sex sex;
	
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
	@Column(name="statusId")
	private Integer statusId;
	
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
	@Column(name="religionName")
	private String religionName;
	
	@Basic
	@Column(name="religionId")
	private Integer religionId;
	
	@Basic
	@Column(name="nationalityName")
	private String nationalityName;
	
	@Basic
	@Column(name="nationalityId")
	private Integer nationalityId;
	
	@Basic
	@Column(name="bankaccount")
	private String bankAccount;
	
	@Basic
	@Column(name="userName")
	private String userName;
	
	
	@Basic
	@Column(name="roles")
	private String roles;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="startWorkingDate")
	private Date startWorkingDate;

	@Basic
	@Column(name="POSITION")
	private String position;
	
	@Basic
	@Column(name="Divsion")
	private String division;
	
	private String positionLevel;
	
	private Date birthDate;
	
	@JsonIgnore
	private byte[] picture;
	
	private Address registeredAddress;

	private Address currentAddress;
	
	private String majorRoles;
	
	private String positionGroup;
	
	

	private Integer titleId;
	
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

	@Transient
	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Transient
	public Integer getTitleId() {
		return titleId;
	}

	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public Date getStartWorkingDate() {
		return startWorkingDate;
	}

	public void setStartWorkingDate(Date startWorkingDate) {
		this.startWorkingDate = startWorkingDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	

	public String getReligionName() {
		return religionName;
	}

	public void setReligionName(String religionName) {
		this.religionName = religionName;
	}

	public Integer getReligionId() {
		return religionId;
	}

	public void setReligionId(Integer religionId) {
		this.religionId = religionId;
	}

	
	
	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	
	public Integer getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Integer nationalityId) {
		this.nationalityId = nationalityId;
	}

	@Enumerated(EnumType.STRING)
	@Column(name="sex")
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Transient
	public String getPositionLevel() {
		return positionLevel;
	}

	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}
	
	@Transient
	public String getPositionGroup() {
		return positionGroup;
	}

	public void setPositionGroup(String positionGroup) {
		this.positionGroup = positionGroup;
	}

	@Transient
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Transient
	public String getMajorRoles() {
		return majorRoles;
	}

	public void setMajorRoles(String majorRoles) {
		this.majorRoles = majorRoles;
	}

	@Transient
	public Integer getAge() {
		if(this.birthDate != null) {
			log.debug("birthdate is not null : " + this.birthDate);
			LocalDate bday = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			Period p = Period.between(bday, LocalDate.now());
			
			return p.getYears();
		} else {
			return null;
		}
	}
	
	@Transient
	public Integer getWorkingAge() {
		if(this.startWorkingDate != null) {
			log.debug("startWorkingDate is not null : " + this.startWorkingDate);
			LocalDate bday = startWorkingDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			Period p = Period.between(bday, LocalDate.now());
			
			return p.getYears();
		} else {
			return null;
		}
	}
	
	
	

	
}
