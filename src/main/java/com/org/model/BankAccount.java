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
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "bank_account_date")
	private Date bankaccountdate;

	@Column(name = "balance")
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBankaccountdate() {
		return bankaccountdate;
	}

	public void setBankaccountdate(Date bankaccountdate) {
		this.bankaccountdate = bankaccountdate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	
	/*
	 * 
	 * 
	 * end of BankAccount
	 * 
	 * 
	 */
}
