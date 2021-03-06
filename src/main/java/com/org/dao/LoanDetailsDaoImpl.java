package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.IoMember;
import com.org.model.Loan;
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

	@Override
	public void deleteLoanDetails(int id) {
		LoanDetails loan = (LoanDetails) sessionFactory.getCurrentSession().load(LoanDetails.class, id);
		if (null != loan) {
			this.sessionFactory.getCurrentSession().delete(loan);
			this.sessionFactory.getCurrentSession().flush();
		}

	}

	@Override
	public List<LoanDetails> getLoanDetailsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanDetails> filterLoanDetailsByCode(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanDetails getLoanDetailsById(int partnershipId) {
		return (LoanDetails) sessionFactory.getCurrentSession().get(LoanDetails.class, partnershipId);

	}

	@Override
	public List<LoanDetails> getAllNamePerLoanDetails(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanDetails> filterLoanDetails(String name, float min, float max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanDetails> searchLoanDetails(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanDetails> getAllLoanDetails() {

		Query q = sessionFactory.getCurrentSession().createQuery("from LoanDetails");
		List<LoanDetails> allLoanDetails = (List<LoanDetails>) q.list();
		return allLoanDetails;

	}

}
