package com.org.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class MemberPartnershipDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "pay_date")
	private Date payDate;

	// @Column(name = "partnership_value")
	// private Double partnershipValue;

	@Column(name = "expected_monthly_paid_value")
	private Double expectedMonthlyPaidValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Double getExpectedMonthlyPaidValue() {
		return expectedMonthlyPaidValue;
	}

	public void setExpectedMonthlyPaidValue(Double expectedMonthlyPaidValue) {
		this.expectedMonthlyPaidValue = expectedMonthlyPaidValue;
	}

	// *********************** Relationships ******************************

	@ManyToOne
	private IoMember io_member;

	
	
	public IoMember getIo_member() {
		return io_member;
	}

	public void setIo_member(IoMember io_member) {
		this.io_member = io_member;
	}

	/*
	 * 
	 *  
	 *  
	 *  
	 *  
	 *  */

}