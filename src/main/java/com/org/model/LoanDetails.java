package com.org.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "loan_details")
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "date_pay")
	private Date payDate;

	@Column(name = "paid_value")
	private double paidValue;

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

	public double getPaidValue() {
		return paidValue;
	}

	public void setPaidValue(double paidValue) {
		this.paidValue = paidValue;
	}

	// ************** Relationship **************************

	@ManyToOne(fetch = FetchType.EAGER)
	private Loan loanId;

	public Loan getLoanId() {
		return loanId;
	}

	public void setLoanId(Loan loanId) {
		this.loanId = loanId;
	}

}