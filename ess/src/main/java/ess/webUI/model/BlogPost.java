package ess.webUI.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import ess.model.Employee;

@Entity
@Table(name="WEB_BLOGPOST")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=BlogPost.class)
public class BlogPost implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4166290086615158577L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CREATEDBY_EMP_ID")
	private Employee createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATEDTIME")
	private Date createdTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LASTUPDATEDTIME")
	private Date lastUpdatedTime;
	
	@ManyToOne
	@JoinColumn(name="LASTUPDATEDBY_EMP_ID")
	private Employee lastUpdatedBy;
	
	@Lob
	@Column(name="TEXT")
	private String text;
	
	@Column(name="TAG")
	private String tag;
	
	
	@Column(name="TITLE")
	private String title;

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public Employee getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Employee lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
