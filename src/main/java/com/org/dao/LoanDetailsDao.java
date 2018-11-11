package com.org.dao;

import java.util.List;

import com.org.model.LoanDetails;

public interface LoanDetailsDao {

	public void AddLoanDetails(LoanDetails loanDetail);

	public void updateLoanDetails(LoanDetails loanDetail);

	public List<LoanDetails> getAllLoanDetails(int loanId);
	
	public List<LoanDetails> getAllLoanDetails();

	public void deleteLoanDetails(int id);

	public List<LoanDetails> getLoanDetailsByName(String name);

	public List<LoanDetails> filterLoanDetailsByCode(int id);

	public LoanDetails getLoanDetailsById(int partnershipId);

	public List<LoanDetails> getAllNamePerLoanDetails(String name);

	public List<LoanDetails> filterLoanDetails(String name, float min, float max);

	public List<LoanDetails> searchLoanDetails(String name);

}
