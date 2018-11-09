package com.org.service;

import java.util.List;

import com.org.model.SecondaryExpenses;

public interface SecondaryExpensesService {

	public void AddSecondaryExpensesDao(SecondaryExpenses secondaryExpenses);

	public void updateSecondaryExpenses(SecondaryExpenses secondaryExpenses);

	public List<SecondaryExpenses> getAllSecondaryExpenses();
	
	public void deleteSecondaryExpenses(int id);

	public SecondaryExpenses getSecondaryExpensesById(int Id);

}
