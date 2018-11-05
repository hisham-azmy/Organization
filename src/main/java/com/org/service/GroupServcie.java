package com.org.service;

import java.util.List;

import com.jwt.model.Client;
import com.org.model.IoGroup;
import com.org.model.IoMember;

public interface GroupServcie {

	public void AddGroup(IoGroup ioGroup);

	public void updateGroup(IoGroup ioGroup);

	public void deleteGroup(int id);

	public List<IoGroup> getAllGroups();

	public List<String> allNameByGroup(String name);

}
