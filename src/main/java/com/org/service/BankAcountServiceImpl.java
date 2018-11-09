package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.dao.BankAccountDao;
import com.org.model.BankAccount;

@Repository
@Transactional

public class BankAcountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountDao bankAccountDao;

	@Override
	public void AddBankAccount(BankAccount bankAccount) {
		bankAccountDao.AddBankAccount(bankAccount);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		bankAccountDao.updateBankAccount(bankAccount);
	}

	@Override
	public List<BankAccount> getAllBankAccount() {
		return bankAccountDao.getAllBankAccount();
	}

	@Override
	public void deleteBankAccount(int id) {
		bankAccountDao.deleteBankAccount(id);
		
	}

	@Override
	public BankAccount getBankAccountById(int Id) {
		// TODO Auto-generated method stub
		return bankAccountDao.getBankAccountById(Id);
	}
}
