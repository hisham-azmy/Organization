package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.SecondaryExpenses;

@Repository
@Transactional
public class SecondaryExpensesDaoImpl implements SecondaryExpensesDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddSecondaryExpensesDao(SecondaryExpenses secondaryExpenses) {
		sessionFactory.getCurrentSession().save(secondaryExpenses);

	}

	@Override
	public void updateSecondaryExpenses(SecondaryExpenses secondaryExpenses) {
		sessionFactory.getCurrentSession().update(secondaryExpenses);

	}

	@Override
	public List<SecondaryExpenses> getAllSecondaryExpenses() {
		Query q = sessionFactory.getCurrentSession().createQuery("from SecondaryExpenses");
		List<SecondaryExpenses> allSecondaryExpenses = (List<SecondaryExpenses>) q.list();
		return allSecondaryExpenses;
	}

	@Override
	public void deleteSecondaryExpenses(int id) {
		SecondaryExpenses secondaryExpenses = (SecondaryExpenses) sessionFactory.getCurrentSession()
				.load(SecondaryExpenses.class, id);
		if (null != secondaryExpenses) {
			this.sessionFactory.getCurrentSession().delete(secondaryExpenses);
			this.sessionFactory.getCurrentSession().flush();
		}

	}

	@Override
	public SecondaryExpenses getSecondaryExpensesById(int Id) {
		// TODO Auto-generated method stub
		return (SecondaryExpenses) sessionFactory.getCurrentSession().get(SecondaryExpenses.class, Id);
	}

}