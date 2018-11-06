package com.org.service;

import com.jwt.dao.ClientDao;
import com.jwt.model.Client;
import com.org.dao.LoanDao;
import com.org.dao.MemberDao;
import com.org.model.IoMember;
import com.org.model.Loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoanServiceImpl implements LoanServcie {

	@Autowired
	private LoanDao LoanDao;

	@Override
	public void AddLoan(Loan loan) {
		LoanDao.AddLoan(loan);
	}

	@Override
	public void updateLoan(Loan loan) {
		LoanDao.updateLoan(loan);
	}

	@Override
	public void deleteLoan(int id) {
		LoanDao.deleteLoan(id);
	}

	@Override
	public List<Loan> getAllLoan() {
		return LoanDao.getAllLoan();
	}

	@Override
	public List<Loan> filterLoanByTelephone(String telephone) {
		return LoanDao.filterLoanByTelephone(telephone);
	}

	@Override
	public List<Loan> filterLoanByName(String name) {
		return LoanDao.filterLoanByName(name);
	}

	@Override
	public List<Loan> filterLoanByCode(int id) {
		return LoanDao.filterLoanByCode(id);
	}

	@Override
	public Loan getLoanById(int clientId) {
		return LoanDao.getLoanById(clientId);
	}

	@Override
	public List<String> getAllNamePerLoans(String name) {
		return LoanDao.getAllNamePerLoans(name);
	}

	@Override
	public List<Loan> filterLoan(String name, float min, float max) {
		return LoanDao.filterLoan(name, min, max);
	}

	@Override
	public List<Loan> searchLoan(String name) {
		return LoanDao.searchLoan(name);
	}

}
