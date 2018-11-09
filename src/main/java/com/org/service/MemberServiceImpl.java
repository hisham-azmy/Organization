package com.org.service;

import com.jwt.dao.ClientDao;
import com.jwt.model.Client;
import com.org.dao.MemberDao;
import com.org.model.IoMember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class MemberServiceImpl implements MemberServcie {

	@Autowired
	private MemberDao memberDao;

	@Override
	@Transactional
	public void AddMember(IoMember ioMember) {
		memberDao.AddMember(ioMember);
	}

	@Override
	@Transactional
	public void updateMember(IoMember IoMember) {
		memberDao.updateMember(IoMember);
	}

	@Override
	@Transactional
	public void deleteMember(int id) {
		memberDao.deleteMember(id);
	}

	@Override
	@Transactional
	public List<IoMember> getAllMembers() {

		return memberDao.getAllMembers();
	}

	@Override
	@Transactional
	public List<IoMember> filterMemberByTelephone(String telephone) {
		// TODO Auto-generated method stub
		return memberDao.filterMemberByTelephone(telephone);
	}

	@Override
	@Transactional
	public List<IoMember> filterMembersByName(String name) {
		return memberDao.filterMembersByName(name);
	}

	@Override
	@Transactional
	public List<IoMember> filterMemberByCode(int id) {
		return memberDao.filterMemberByCode(id);
	}

	@Override
	@Transactional
	public IoMember getMemberById(int clientId) {
		return memberDao.getMemberById(clientId);
	}

	@Override
	@Transactional
	public List<String> getAllNamePerMembers(String name) {
		return memberDao.getAllNamePerMembers(name);
	}

	@Override
	@Transactional
	public List<IoMember> filterMember(String name, float min, float max) {
		return memberDao.filterMember(name, min, max);
	}

	@Override
	@Transactional
	public List<IoMember> searchMember(String name) {
		// TODO Auto-generated method stub
		return memberDao.searchMember(name);
	}

}
