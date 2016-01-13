package ess.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Address.class)
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6092256497992756467L;
	
	
	private Long id;
	private String name;
	private String code;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameTh() {
		return name;
	}
	public void setNameTh(String nameTh) {
		this.name = nameTh;
	}
	public String getNameEn() {
		return code;
	}
	public void setNameEn(String nameEn) {
		this.code = nameEn;
	}
	
	
}
