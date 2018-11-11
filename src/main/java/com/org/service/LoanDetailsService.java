package com.org.service;

import java.util.List;

import com.org.model.LoanDetails;

public interface LoanDetailsService {

	public void AddLoanDetails(LoanDetails loanDetail, int LoadId);

	public void AddLoanDetails(LoanDetails loanDetail);

	public void updateLoanDetails(LoanDetails loanDetail, int LoadId);

	public List<LoanDetails> getAllLoanDetails();

	public List<LoanDetails> getAllLoanDetails(int loanId);

	public void deleteLoanDetails(int id);

	public List<LoanDetails> getLoanDetailsByName(String name);

	public List<LoanDetails> filterLoanDetailsByCode(int id);

	public LoanDetails getLoanDetailsById(int partnershipId);

	public List<LoanDetails> getAllNamePerLoanDetails(String name);

	public List<LoanDetails> filterLoanDetails(String name, float min, float max);

	public List<LoanDetails> searchLoanDetails(String name);

}
