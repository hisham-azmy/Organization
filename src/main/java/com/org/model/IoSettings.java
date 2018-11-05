package com.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "io_settings")
public class IoSettings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "organization_name")
	private String organizationName;

	@Column(name = "max_loan_percentage")
	private String maxLoanPercentage;

	@Column(name = "address")
	private String address;

	@Column(name = "bank_balance_value")
	private Double bankBalanceValue;

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getMaxLoanPercentage() {
		return maxLoanPercentage;
	}

	public void setMaxLoanPercentage(String maxLoanPercentage) {
		this.maxLoanPercentage = maxLoanPercentage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getBankBalanceValue() {
		return bankBalanceValue;
	}

	public void setBankBalanceValue(Double bankBalanceValue) {
		this.bankBalanceValue = bankBalanceValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
