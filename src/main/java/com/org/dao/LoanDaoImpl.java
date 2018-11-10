package com.org.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.IoMember;
import com.org.model.Loan;

@Repository
@Transactional
public class LoanDaoImpl implements LoanDao {

	@Autowired
	private SessionFactory sessionFactory;

	// **********************************
	@Override
	public void AddLoan(Loan loan) {
		loan.setLoanDate(new Date());
		sessionFactory.getCurrentSession().save(loan);

	}

	@Override
	public void updateLoan(Loan loan) {
		sessionFactory.getCurrentSession().update(loan);

	}

	@Override
	public void deleteLoan(int id) {
		Loan loan = (Loan) sessionFactory.getCurrentSession().load(Loan.class, id);
		if (null != loan) {
			this.sessionFactory.getCurrentSession().delete(loan);
			this.sessionFactory.getCurrentSession().flush();
		}

	}

	@Override
	public List<Loan> getAllLoan() {

		Query q = sessionFactory.getCurrentSession().createQuery("from Loan");
		List<Loan> allLoans = (List<Loan>) q.list();
		return allLoans;
	}

	@Override
	public List<Loan> filterLoanByTelephone(String telephone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> filterLoanByName(String name) {
		Query q = sessionFactory.getCurrentSession().createQuery("from Loan where fullName LIKE :fullName");
		q.setParameter("fullName", "%" + name + "%");
		List<IoMember> allMembers = (List<IoMember>) q.list();
		return null;
	}

	@Override
	public List<Loan> filterLoanByCode(int id) {
		return null;
	}

	@Override
	public Loan getLoanById(int clientId) {
		return (Loan) sessionFactory.getCurrentSession().get(Loan.class, clientId);

	}

	@Override
	public List<String> getAllNamePerLoans(String name) {

		Query q = sessionFactory.getCurrentSession()
				.createQuery("select fullName from IoMember where fullName LIKE :fullName");
		q.setParameter("fullName", "%" + name + "%");
		List<String> allNames = (List<String>) q.list();
		return allNames;
	}

	@Override
	public List<Loan> filterLoan(String name, float min, float max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> searchLoan(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
