package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Product;
import com.org.model.IoMember;

@Repository
@Transactional
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddMember(IoMember member) {
		sessionFactory.getCurrentSession().save(member);
	}

	@Override
	public void updateMember(IoMember member) {
		sessionFactory.getCurrentSession().update(member);
	}

	@Override
	public void deleteMember(int id) {
		IoMember member = (IoMember) sessionFactory.getCurrentSession().load(IoMember.class, id);
		if (null != member) {
			this.sessionFactory.getCurrentSession().delete(member);
			this.sessionFactory.getCurrentSession().flush();
		}

	}

	@Override
	public List<IoMember> getAllMembers() {

		Query q = sessionFactory.getCurrentSession().createQuery("from IoMember");
		List<IoMember> allMembers = (List<IoMember>) q.list();
		return allMembers;
	}

	@Override
	public List<IoMember> filterMemberByTelephone(String telephone) {

		Query q = sessionFactory.getCurrentSession().createQuery("from IoMember where telephone LIKE :telephone");
		q.setParameter("name", "%" + telephone + "%");
		List<IoMember> allMembers = (List<IoMember>) q.list();
		return allMembers;
	}

	@Override
	public List<IoMember> filterMembersByName(String name) {
		Query q = sessionFactory.getCurrentSession().createQuery("from IoMember where fullName LIKE :fullName");
		q.setParameter("fullName", "%" + name + "%");
		List<IoMember> allMembers = (List<IoMember>) q.list();
		return allMembers;
	}

	@Override
	public List<IoMember> filterMemberByCode(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllNamePerMembers(String name) {

		Query q = sessionFactory.getCurrentSession().createQuery("select name from IoMember where fullName LIKE :fullName");
		q.setParameter("fullName", "%" + name + "%");
		List<String> allNames = (List<String>) q.list();
		return allNames;

	}

	@Override
	public IoMember getMemberById(int Memberid) {

		return (IoMember) sessionFactory.getCurrentSession().get(IoMember.class, Memberid);
	}

	@Override
	public List<IoMember> filterMember(String name, float min, float max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IoMember> searchMember(String name) {
		return null;
	}

}
