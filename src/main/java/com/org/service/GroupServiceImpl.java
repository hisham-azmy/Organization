package com.org.service;

import com.jwt.dao.ClientDao;
import com.jwt.model.Client;
import com.org.dao.GroupDao;
import com.org.model.IoGroup;
import com.org.model.IoMember;
import com.org.model.MemberPartnershipDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GroupServiceImpl implements GroupServcie {

	@Autowired
	private GroupDao groupDao;

	@Override
	public void AddGroup(IoGroup ioGroup) {
		groupDao.AddGroup(ioGroup);
	}

	@Override
	public void updateGroup(IoGroup ioGroup) {
		groupDao.updateGroup(ioGroup);
	}

	@Override
	public void deleteGroup(int id) {
		groupDao.deleteGroup(id);
	}

	@Override
	public List<IoGroup> getAllGroups() {
		// TODO Auto-generated method stub
		return groupDao.getAllGroups();
	}

	@Override
	public List<String> allNameByGroup(String name) {
		return groupDao.allNameByGroup(name);
	}

}
