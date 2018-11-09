package com.org.service;

import java.util.List;

import com.org.model.LoanDetails;

public interface LoanDetailsService {

	
	public void AddLoanDetails(LoanDetails loanDetail, int LoadId);

	public void updateLoanDetails(LoanDetails loanDetail, int LoadId);

	public List<LoanDetails> getAllLoanDetails(int loanId);
}
