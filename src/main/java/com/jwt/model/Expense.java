package com.jwt.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Float Amount;

	private Float gross_incom;

	private Date Expense_Date;
	
	private Date payment_type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Float getAmount() {
		return Amount;
	}

	public void setAmount(Float amount) {
		Amount = amount;
	}

	public Float getGross_incom() {
		return gross_incom;
	}

	public void setGross_incom(Float gross_incom) {
		this.gross_incom = gross_incom;
	}

	public Date getExpense_Date() {
		return Expense_Date;
	}

	public void setExpense_Date(Date expense_Date) {
		Expense_Date = expense_Date;
	}

	public Date getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(Date payment_type) {
		this.payment_type = payment_type;
	}
	
	
	
	

}
