package com.org.dao;

import java.util.List;

import com.org.model.BankAccount;
import com.org.model.SecondaryExpenses;

public interface SecondaryExpensesDao {

	public void AddSecondaryExpensesDao(SecondaryExpenses secondaryExpenses);

	public void updateSecondaryExpenses(SecondaryExpenses secondaryExpenses);

	public List<SecondaryExpenses> getAllSecondaryExpenses();
	
	public void deleteSecondaryExpenses(int id);

	public SecondaryExpenses getSecondaryExpensesById(int Id);

}
