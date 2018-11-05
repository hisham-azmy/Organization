package com.org.dao;

import java.util.List;

import org.hibernate.Query;

import com.jwt.model.Client;
import com.jwt.model.Product;
import com.org.model.IoGroup;
import com.org.model.IoMember;

public interface GroupDao {

	public void AddGroup(IoGroup ioGroup);

	public void updateGroup(IoGroup  ioGroup);

	public void deleteGroup(int id);

	public List<IoGroup> getAllGroups();
	
	public List<String> allNameByGroup(String name);


}
