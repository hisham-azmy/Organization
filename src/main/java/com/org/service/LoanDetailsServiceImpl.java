package com.org.service;

import java.util.Date;
import java.util.List;

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
		LoanDetailsDao.updateLoanDetails(loanDetail);

	}

	@Override
	public List<LoanDetails> getAllLoanDetails(int loanId) {
		return LoanDetailsDao.getAllLoanDetails(loanId);
	}

	@Override
	public void deleteLoanDetails(int id) {
		LoanDetailsDao.deleteLoanDetails(id);
	}

	@Override
	public List<LoanDetails> getLoanDetailsByName(String name) {
		return LoanDetailsDao.getLoanDetailsByName(name);
	}

	@Override
	public List<LoanDetails> filterLoanDetailsByCode(int id) {
		return LoanDetailsDao.filterLoanDetailsByCode(id);
	}

	@Override
	public LoanDetails getLoanDetailsById(int partnershipId) {
		return LoanDetailsDao.getLoanDetailsById(partnershipId);
	}

	@Override
	public List<LoanDetails> getAllNamePerLoanDetails(String name) {
		return LoanDetailsDao.getAllNamePerLoanDetails(name);
	}

	@Override
	public List<LoanDetails> filterLoanDetails(String name, float min, float max) {
		return LoanDetailsDao.filterLoanDetails(name, min, max);
	}

	@Override
	public List<LoanDetails> searchLoanDetails(String name) {
		return LoanDetailsDao.searchLoanDetails(name);
	}

	@Override
	public void AddLoanDetails(LoanDetails loanDetail) {
		LoanDetailsDao.AddLoanDetails(loanDetail);
	}

	@Override
	public List<LoanDetails> getAllLoanDetails() {
		return LoanDetailsDao.getAllLoanDetails();
	}

}