package com.org.service;

import java.util.List;

import com.org.model.SecondaryIncome;

public interface SecondaryIncomeService {

	public void AddSecondaryIncome(SecondaryIncome secondaryIncome);

	public void updateSecondaryIncome(SecondaryIncome secondaryIncome);

	public List<SecondaryIncome> getAllSecondaryIncome();

	public void deleteSecondaryIncome(int id);
	
	public SecondaryIncome getSecondaryIncomeById(int Id);

}
