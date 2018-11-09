package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.BankAccount;

@Repository
@Transactional
public class BankAccountDaoImpl implements BankAccountDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddBankAccount(BankAccount bankAccount) {
		sessionFactory.getCurrentSession().save(bankAccount);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		sessionFactory.getCurrentSession().update(bankAccount);
	}

	@Override
	public List<BankAccount> getAllBankAccount() {
		Query q = sessionFactory.getCurrentSession().createQuery("from BankAccount");
		List<BankAccount> allBankAccount = (List<BankAccount>) q.list();
		return allBankAccount;
	}
}