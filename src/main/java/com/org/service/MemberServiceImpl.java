package com.org.service;

import com.jwt.dao.ClientDao;
import com.jwt.model.Client;
import com.org.model.IoMember;
import com.org.model.MemberPartnershipDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements PartnershipServcie {

	@Autowired
	private PartnershipServcie partnershipServcie;

	@Override
	public void AddPartnership(MemberPartnershipDetails partnership) {
		partnershipServcie.AddPartnership(partnership);
	}

	@Override
	public void updatePartnership(MemberPartnershipDetails IoMember) {
		partnershipServcie.updatePartnership(IoMember);
	}

	@Override
	public void deletePartnership(int id) {
		partnershipServcie.deletePartnership(id);
	}

	@Override
	public List<MemberPartnershipDetails> getAllPartnerships() {
		return partnershipServcie.getAllPartnerships();
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnershipByTelephone(String telephone) {
		return partnershipServcie.filterPartnershipByTelephone(telephone);
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnershipByName(String name) {
		return partnershipServcie.filterPartnershipByName(name);
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnershipByCode(int id) {
		return partnershipServcie.filterPartnershipByCode(id);
	}

	@Override
	public MemberPartnershipDetails getPartnershipById(int partnershipId) {
		return partnershipServcie.getPartnershipById(partnershipId);
	}

	@Override
	public List<MemberPartnershipDetails> getAllNamePerPartnerships(String name) {
		return partnershipServcie.getAllNamePerPartnerships(name);
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnership(String name, float min, float max) {
		return partnershipServcie.filterPartnership(name, min, max);
	}

	@Override
	public List<MemberPartnershipDetails> searchPartnership(String name) {
		return partnershipServcie.searchPartnership(name);
	}

}
