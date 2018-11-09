package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.dao.SecondaryIncomeDao;
import com.org.model.SecondaryIncome;

@Repository
@Transactional

public class SecondaryIncomesServiceImpl implements SecondaryIncomeService {

	@Autowired
	private SecondaryIncomeDao secondaryIncomeDao;

	@Override
	public void AddSecondaryIncome(SecondaryIncome secondaryIncome) {
		secondaryIncomeDao.AddSecondaryIncome(secondaryIncome);
	}

	@Override
	public void updateSecondaryIncome(SecondaryIncome secondaryIncome) {
		secondaryIncomeDao.updateSecondaryIncome(secondaryIncome);
	}

	@Override
	public List<SecondaryIncome> getAllSecondaryIncome() {
		return secondaryIncomeDao.getAllSecondaryIncome();
	}

	@Override
	public void deleteSecondaryIncome(int id) {
		secondaryIncomeDao.deleteSecondaryIncome(id);

	}

	@Override
	public SecondaryIncome getSecondaryIncomeById(int Id) {
		// TODO Auto-generated method stub
		return secondaryIncomeDao.getSecondaryIncomeById(Id);
	}

}
