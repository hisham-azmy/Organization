package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.org.model.IoGroup;
import com.org.model.IoMember;
import com.org.model.IoSettings;
import com.org.model.Loan;

@Repository
@Transactional
public class SettingsDaoImpl implements SettingsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddSettings(IoSettings ioSettings) {
		sessionFactory.getCurrentSession().save(ioSettings);
	}

	@Override
	public void updateSettings(IoSettings ioSettings) {
		sessionFactory.getCurrentSession().update(ioSettings);
	}

	@Override
	public void deleteSettings(int id) {
		IoSettings settings = (IoSettings) sessionFactory.getCurrentSession().load(IoSettings.class, id);
		if (null != settings) {
			this.sessionFactory.getCurrentSession().delete(settings);
			this.sessionFactory.getCurrentSession().flush();
		}
	}

	@Override
	public List<IoSettings> getAllSettings() {
		Query q = sessionFactory.getCurrentSession().createQuery("from IoSettings");
		List<IoSettings> allSettings = (List<IoSettings>) q.list();
		return allSettings;
	}

	@Override
	public List<String> allNameBySettings(String name) {
		Query q = sessionFactory.getCurrentSession()
				.createQuery("select fullName from IoSettings where fullName LIKE :fullName");
		q.setParameter("fullName", "%" + name + "%");
		List<String> allIoSettings = (List<String>) q.list();
		return allIoSettings;

	}

	@Override
	public IoSettings getSettings() {
		return (IoSettings) sessionFactory.getCurrentSession().get(IoSettings.class, 1);
	}

}
