package com.org.service;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
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
}