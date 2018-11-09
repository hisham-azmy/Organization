package com.org.dao;

import java.util.List;

import com.org.model.LoanDetails;

public interface LoanDetailsDao {

	public void AddLoanDetails(LoanDetails loanDetail);

	public void updateLoanDetails(LoanDetails loanDetail);

	public List<LoanDetails> getAllLoanDetails( int loanId);

}
