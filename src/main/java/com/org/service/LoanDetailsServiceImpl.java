package com.org.service;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.Loan;
import com.org.model.LoanDetails;

@Repository
@Transactional

public class LoanDetailsServiceImpl implements LoanDetailsService {



	@Autowired
	private com.org.dao.LoanDao LoanDao;
	@Autowired
	private com.org.dao.LoanDetailsDao LoanDetailsDao;

	@Override
	public void AddLoanDetails(LoanDetails loanDetail, int LoadId) {
		Loan loanObj = LoanDao.getLoanById(LoadId);
		loanDetail.setLoanId(loanObj);
		loanObj.setLoanvalue(loanObj.getLoanvalue() - loanDetail.getPaidValue());
		loanObj.setPaymentTimesCount(loanObj.getPaymentTimesCount() - 1);

		loanDetail.setPayDate(new Date());

		LoanDao.updateLoan(loanObj);
		LoanDetailsDao.AddLoanDetails(loanDetail);
	}

	@Override
	public void updateLoanDetails(LoanDetails loanDetail, int LoadId) {

	}

	@Override
	public List<LoanDetails> getAllLoanDetails(int loanId) {
		return LoanDetailsDao.getAllLoanDetails(loanId);
	}
}
