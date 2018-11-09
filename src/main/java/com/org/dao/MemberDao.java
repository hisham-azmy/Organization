package com.org.dao;

import java.util.List;

import com.org.model.IoMember;

public interface MemberDao {

	public void AddMember(IoMember IoMember);

	public void updateMember(IoMember IoMember);

	public void deleteMember(int id);

	public List<IoMember> getAllMembers();

	public List<IoMember> filterMemberByTelephone(String telephone);

	public List<IoMember> filterMembersByName(String name);

	public List<IoMember> filterMemberByCode(int id);

	public IoMember getMemberById(int clientId);

	public List<String> getAllNamePerMembers(String name);

	public List<IoMember> filterMember(String name, float min, float max);

	public List<IoMember> searchMember(String name);

}
