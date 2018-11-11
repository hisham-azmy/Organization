package com.org.dao;

import java.util.List;

import com.org.model.IoGroup;

public interface GroupDao {

	public void AddGroup(IoGroup ioGroup);

	public void updateGroup(IoGroup ioGroup);

	public void deleteGroup(int id);

	public List<IoGroup> getAllGroups();

	public List<String> allNameByGroup(String name);

	public IoGroup getLoanById(int groupId);

}
