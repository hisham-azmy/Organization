package com.org.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class IoMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 50, message = "Name must more than 8")
	@Column(name = "full_name")
	private String fullName;

	@Column(name = "email")
	private String email;

	@Column(name = "telephone1")
	private String telephone1;

	@Column(name = "telephone2")
	private String telephone2;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "job")
	private String job;

	@DateTimeFormat(pattern = "mm/dd/yyyy")
	@Column(name = "join_date")
	private Date joinDate;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "monthly_paid_value")
	private Date monthlyPaidValue;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "day_of_month")
	private Date dayOfMonth;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getMonthlyPaidValue() {
		return monthlyPaidValue;
	}

	public void setMonthlyPaidValue(Date monthlyPaidValue) {
		this.monthlyPaidValue = monthlyPaidValue;
	}

	public Date getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(Date dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	// ****************** Relatinos ***************************
	@ManyToOne
	private IoGroup ioGroup;

	@OneToMany(mappedBy = "io_member", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<MemberPartnershipDetails> memberPartnershipDetails;

	public IoGroup getIoGroup() {
		return ioGroup;
	}

	public void setIoGroup(IoGroup ioGroup) {
		this.ioGroup = ioGroup;
	}

	public List<MemberPartnershipDetails> getMemberPartnershipDetails() {
		return memberPartnershipDetails;
	}

	public void setMemberPartnershipDetails(List<MemberPartnershipDetails> memberPartnershipDetails) {
		this.memberPartnershipDetails = memberPartnershipDetails;
	}

	// end of IOMember
	/**
	 * 
	 * 
	 * 
	 * 
	 * */
}
