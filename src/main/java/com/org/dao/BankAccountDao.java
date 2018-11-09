package com.org.dao;

import java.util.List;

import com.org.model.BankAccount;

public interface BankAccountDao {

	public void AddBankAccount(BankAccount bankAccount);

	public void updateBankAccount(BankAccount bankAccount);

	public List<BankAccount> getAllBankAccount();

	public void deleteBankAccount(int id);

	public BankAccount getBankAccountById(int Id);

}
