package com.org.dao;

import java.util.Date;
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
		bankAccount.setBankaccountdate(new Date());
		sessionFactory.getCurrentSession().save(bankAccount);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		sessionFactory.getCurrentSession().saveOrUpdate(bankAccount);
	}

	@Override
	public List<BankAccount> getAllBankAccount() {
		Query q = sessionFactory.getCurrentSession().createQuery("from BankAccount");
		List<BankAccount> allBankAccount = (List<BankAccount>) q.list();
		return allBankAccount;
	}

	@Override
	public void deleteBankAccount(int id) {
		BankAccount bankAccount = (BankAccount) sessionFactory.getCurrentSession().load(BankAccount.class, id);
		if (null != bankAccount) {
			this.sessionFactory.getCurrentSession().delete(bankAccount);
			this.sessionFactory.getCurrentSession().flush();
		}
	}

	@Override
	public BankAccount getBankAccountById(int Id) {

		return (BankAccount) sessionFactory.getCurrentSession().get(BankAccount.class, Id);
	}

}