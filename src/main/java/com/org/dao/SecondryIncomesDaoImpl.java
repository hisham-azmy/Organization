package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.BankAccount;
import com.org.model.SecondaryIncome;

@Repository
@Transactional
public class SecondryIncomesDaoImpl implements SecondaryIncomeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddSecondaryIncome(SecondaryIncome secondaryIncome) {
		sessionFactory.getCurrentSession().save(secondaryIncome);

	}

	@Override
	public void updateSecondaryIncome(SecondaryIncome secondaryIncome) {
		sessionFactory.getCurrentSession().update(secondaryIncome);

	}

	@Override
	public List<SecondaryIncome> getAllSecondaryIncome(int secondaryIncomeId) {
		Query q = sessionFactory.getCurrentSession().createQuery("from SecondaryIncome");
		List<SecondaryIncome> allSecondaryIncome = (List<SecondaryIncome>) q.list();
		return allSecondaryIncome;
	}
	
}