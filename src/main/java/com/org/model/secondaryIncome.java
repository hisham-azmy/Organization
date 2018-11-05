package com.org.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secondary_income")
public class secondaryIncome {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "creation_date")
	private Date creationDate;

	private Double fund;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Double getFund() {
		return fund;
	}

	public void setFund(Double fund) {
		this.fund = fund;
	}

	
	
	/*
	 * 
	 * 
	 * end of secondaryIncome
	 * 
	 * 
	 */
}
