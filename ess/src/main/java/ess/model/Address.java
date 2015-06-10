package ess.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Address")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Address.class)
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8317828475654173345L;


	private static Log log = LogFactory.getLog(Address.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Basic
	@Column(name="addressNo")
	private String addressNo;
	
	@Basic
	@Column(name="moo")
	private String moo;
	
	@Basic
	@Column(name="villageName")
	private String villageName;
	
	@Basic
	@Column(name="buildingName")
	private String buildingName;
	
	@Basic
	@Column(name="roomNo")
	private String roomNo;
	
	@Basic
	@Column(name="floor")
	private String floor;
	
	@Basic
	@Column(name="soiName")
	private String soiName;
	
	@Basic
	@Column(name="roadName")
	private String roadName;
	
	@Basic
	@Column(name="tambon")
	private String tambon;
	
	@Basic
	@Column(name="amphur")
	private String amphur;
	
	@Basic
	@Column(name="province")
	private String province;
	
	@Basic
	@Column(name="postCode")
	private String postCode;
	
	@Basic
	@Column(name="country")
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressNo() {
		return addressNo;
	}

	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}

	public String getMoo() {
		return moo;
	}

	public void setMoo(String moo) {
		this.moo = moo;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getSoiName() {
		return soiName;
	}

	public void setSoiName(String soiName) {
		this.soiName = soiName;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getTambon() {
		return tambon;
	}

	public void setTambon(String tambon) {
		this.tambon = tambon;
	}

	public String getAmphur() {
		return amphur;
	}

	public void setAmphur(String amphur) {
		this.amphur = amphur;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	
	
	
}
