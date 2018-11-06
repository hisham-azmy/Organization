package com.org.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "follower_member_name")
	private String followerMemberName;

	@Column(name = "loan_date")
	private Date loanDate;

	@Column(name = "expected_pay_date")
	private Date expectedPayDate;

	@Column(name = "loan_value")
	private double loanvalue;

	@Column(name = "no_of_payments")
	private int paymentTimesCount;

	@Column(name = "expected_monthly_paid_value")
	private double expectedMonthlyPaidValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFollowerMemberName() {
		return followerMemberName;
	}

	public void setFollowerMemberName(String followerMemberName) {
		this.followerMemberName = followerMemberName;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getExpectedPayDate() {
		return expectedPayDate;
	}

	public void setExpectedPayDate(Date expectedPayDate) {
		this.expectedPayDate = expectedPayDate;
	}

	public double getLoanvalue() {
		return loanvalue;
	}

	public void setLoanvalue(double loanvalue) {
		this.loanvalue = loanvalue;
	}

	public int getPaymentTimesCount() {
		return paymentTimesCount;
	}

	public void setPaymentTimesCount(int paymentTimesCount) {
		this.paymentTimesCount = paymentTimesCount;
	}

	public double getExpectedMonthlyPaidValue() {
		return expectedMonthlyPaidValue;
	}

	public void setExpectedMonthlyPaidValue(double expectedMonthlyPaidValue) {
		this.expectedMonthlyPaidValue = expectedMonthlyPaidValue;
	}

	// *********************** Relationships ******************************
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private IoMember io_member;

	@OneToMany(mappedBy = "loanId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<LoanDetails> loanDetails;

	public IoMember getIo_member() {
		return io_member;
	}

	public void setIo_member(IoMember io_member) {
		this.io_member = io_member;
	}

	public List<LoanDetails> getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(List<LoanDetails> loanDetails) {
		this.loanDetails = loanDetails;
	}

	/*
	 * 
	 *  
	 *  
	 *  
	 *  
	 *  */

}