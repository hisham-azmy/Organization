package com.org.service;

import java.util.List;

import com.org.model.BankAccount;

public interface BankAccountService {

	public void AddBankAccount(BankAccount bankAccount);

	public void updateBankAccount(BankAccount bankAccount);

	public List<BankAccount> getAllBankAccount();
	
	public void deleteBankAccount(int id);

	public BankAccount getBankAccountById(int Id);

}
