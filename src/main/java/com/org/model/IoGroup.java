package com.org.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class IoGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min = 3, max = 20, message = "Name must more than 8")
	// @Column(name = "full_name")
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
	@OneToMany(mappedBy = "ioGroup", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
