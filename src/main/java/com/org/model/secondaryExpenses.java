package com.org.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secondary_expenses ")
public class secondaryExpenses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String fund;

	@Column(name = "expenses_date")
	private Date expensesDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public Date getExpensesDate() {
		return expensesDate;
	}

	public void setExpensesDate(Date expensesDate) {
		this.expensesDate = expensesDate;
	}

	
	
	
}
