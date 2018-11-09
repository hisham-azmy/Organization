package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.LoanDetails;

@Repository
@Transactional
public class LoanDetailsDaoImpl implements LoanDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddLoanDetails(LoanDetails loanDetail) {
		
		sessionFactory.getCurrentSession().save(loanDetail);
	}

	@Override
	public void updateLoanDetails(LoanDetails loanDetail) {
		sessionFactory.getCurrentSession().saveOrUpdate(loanDetail);
	}

	@Override
	public List<LoanDetails> getAllLoanDetails(int loanId) {
		// loanId = 3;
		// Loan loan1 = getLoanById(loanId);
		Query q = sessionFactory.getCurrentSession().createQuery("from LoanDetails  where loanId.id =:loan1");
		q.setParameter("loan1", loanId);
		List<LoanDetails> allLoanDetials = (List<LoanDetails>) q.list();
		return allLoanDetials;
	}
	
	
}
