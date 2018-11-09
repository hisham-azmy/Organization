package com.org.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.BankAccount;
import com.org.model.IoMember;
import com.org.model.IoSettings;
import com.org.model.SecondaryIncome;

@Repository
@Transactional
public class SecondryIncomesDaoImpl implements SecondaryIncomeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddSecondaryIncome(SecondaryIncome secondaryIncome) {
		secondaryIncome.setCreationDate(new Date());
		sessionFactory.getCurrentSession().save(secondaryIncome);

	}

	@Override
	public void updateSecondaryIncome(SecondaryIncome secondaryIncome) {
		sessionFactory.getCurrentSession().saveOrUpdate(secondaryIncome);

	}

	@Override
	public List<SecondaryIncome> getAllSecondaryIncome() {
		Query q = sessionFactory.getCurrentSession().createQuery("from SecondaryIncome");
		List<SecondaryIncome> allSecondaryIncome = (List<SecondaryIncome>) q.list();
		return allSecondaryIncome;
	}

	@Override
	public void deleteSecondaryIncome(int id) {
		SecondaryIncome income = (SecondaryIncome) sessionFactory.getCurrentSession().load(SecondaryIncome.class, id);
		if (null != income) {
			this.sessionFactory.getCurrentSession().delete(income);
			this.sessionFactory.getCurrentSession().flush();
		}
	}

	@Override
	public SecondaryIncome getSecondaryIncomeById(int Id) {
		return (SecondaryIncome) sessionFactory.getCurrentSession().get(SecondaryIncome.class, Id);
	}

}