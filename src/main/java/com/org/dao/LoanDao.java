package com.org.dao;

import java.util.List;

import com.jwt.model.Client;
import com.jwt.model.Product;
import com.org.model.IoMember;
import com.org.model.Loan;

public interface LoanDao {

	public void AddLoan(Loan loan);

	public void updateLoan(Loan loan);

	public void deleteLoan(int id);

	public List<Loan> getAllLoan();

	public List<Loan> filterLoanByTelephone(String telephone);

	public List<Loan> filterLoanByName(String name);

	public List<Loan> filterLoanByCode(int id);

	public Loan getLoanById(int clientId);

	public List<String> getAllNamePerLoans(String name);

	public List<Loan> filterLoan(String name, float min, float max);

	public List<Loan> searchLoan(String name);

}
