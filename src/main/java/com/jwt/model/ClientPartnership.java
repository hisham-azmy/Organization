package com.jwt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ClientPartnership {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientPartnershipId;
	private float clientPartnershipValue;
	private float clientPartnershipPaidValue;
	private Date clientPartnershipDate;

	public int getClientPartnershipId() {
		return clientPartnershipId;
	}

	public void setClientPartnershipId(int clientPartnershipId) {
		this.clientPartnershipId = clientPartnershipId;
	}

	public float getClientPartnershipValue() {
		return clientPartnershipValue;
	}

	public void setClientPartnershipValue(float clientPartnershipValue) {
		this.clientPartnershipValue = clientPartnershipValue;
	}

	public float getClientPartnershipPaidValue() {
		return clientPartnershipPaidValue;
	}

	public void setClientPartnershipPaidValue(float clientPartnershipPaidValue) {
		this.clientPartnershipPaidValue = clientPartnershipPaidValue;
	}

	public Date getClientPartnershipDate() {
		return clientPartnershipDate;
	}

	public void setClientPartnershipDate(Date clientPartnershipDate) {
		this.clientPartnershipDate = clientPartnershipDate;
	}
	// /********************* Relationships **************************************

	@OneToOne
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	

}

