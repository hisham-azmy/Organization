package com.org.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class IoGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty(message = "يجب ادخال الاسم ")
	private String fullName;

	@Column(name = "description")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// ************* Relations ***********************
	@Valid
	@OneToMany(mappedBy = "ioGroup", targetEntity = IoMember.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<IoMember> ioMember;

	public List<IoMember> getIoMember() {
		return ioMember;
	}

	public void setIoMember(List<IoMember> ioMember) {
		this.ioMember = ioMember;
	}

	// end of IOMember
	/**
	 * 
	 * 
	 * 
	 * 
	 * */
}
