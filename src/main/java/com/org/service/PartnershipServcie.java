package com.org.service;

import java.util.List;

import com.jwt.model.Client;
import com.org.model.IoMember;
import com.org.model.MemberPartnershipDetails;

public interface PartnershipServcie {

	public void AddPartnership(MemberPartnershipDetails partnership);

	public void updatePartnership(MemberPartnershipDetails IoMember);

	public void deletePartnership(int id);

	public List<MemberPartnershipDetails> getAllPartnerships();

	public List<MemberPartnershipDetails> filterPartnershipByTelephone(String telephone);

	public List<MemberPartnershipDetails> filterPartnershipByName(String name);

	public List<MemberPartnershipDetails> filterPartnershipByCode(int id);

	public MemberPartnershipDetails getPartnershipById(int partnershipId);

	public List<MemberPartnershipDetails> getAllNamePerPartnerships(String name);

	public List<MemberPartnershipDetails> filterPartnership(String name, float min, float max);

	public List<MemberPartnershipDetails> searchPartnership(String name);

}
