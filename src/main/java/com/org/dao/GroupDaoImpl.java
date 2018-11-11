package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.IoGroup;

@Repository
@Transactional
public class GroupDaoImpl implements GroupDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddGroup(IoGroup ioGroup) {
		sessionFactory.getCurrentSession().save(ioGroup);

	}

	@Override
	public void updateGroup(IoGroup ioGroup) {
		sessionFactory.getCurrentSession().saveOrUpdate(ioGroup);

	}

	@Override
	public void deleteGroup(int id) {
		IoGroup group = (IoGroup) sessionFactory.getCurrentSession().load(IoGroup.class, id);
		if (null != group) {
			this.sessionFactory.getCurrentSession().delete(group);
			this.sessionFactory.getCurrentSession().flush();
		}

	}

	@Override
	public List<IoGroup> getAllGroups() {
		Query q = sessionFactory.getCurrentSession().createQuery("from IoGroup");
		List<IoGroup> allGroups = (List<IoGroup>) q.list();
		return allGroups;
	}

	@Override
	public List<String> allNameByGroup(String name) {
		Query q = sessionFactory.getCurrentSession()
				.createQuery("select fullName from IoGroup where fullName LIKE :fullName");
		q.setParameter("fullName", "%" + name + "%");
		List<String> allNames = (List<String>) q.list();
		return allNames;

	}

	@Override
	public IoGroup getLoanById(int groupId) {
		// TODO Auto-generated method stub
		return (IoGroup) sessionFactory.getCurrentSession().get(IoGroup.class, groupId);

	}

}
