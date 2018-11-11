package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.dao.GroupDao;
import com.org.model.IoGroup;

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

	@Override
	public IoGroup getLoanById(int groupId) {
		return groupDao.getLoanById(groupId);
	}

}
