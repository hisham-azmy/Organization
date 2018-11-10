package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.dao.SecondaryExpensesDao;
import com.org.model.SecondaryExpenses;

@Repository
@Transactional

public class SecondaryExpensesServiceImpl implements SecondaryExpensesService {

	@Autowired
	private SecondaryExpensesDao secondaryExpensesDao;

	@Override
	public void AddSecondaryExpensesDao(SecondaryExpenses secondaryExpenses) {
		secondaryExpensesDao.AddSecondaryExpensesDao(secondaryExpenses);
	}

	@Override
	public void updateSecondaryExpenses(SecondaryExpenses secondaryExpenses) {
		secondaryExpensesDao.updateSecondaryExpenses(secondaryExpenses);
	}

	@Override
	public List<SecondaryExpenses> getAllSecondaryExpenses() {
		return secondaryExpensesDao.getAllSecondaryExpenses();
	}

	@Override
	public void deleteSecondaryExpenses(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SecondaryExpenses getSecondaryExpensesById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
