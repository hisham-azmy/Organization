package com.org.dao;

import java.util.List;

import com.org.model.SecondaryIncome;

public interface SecondaryIncomeDao {

	public void AddSecondaryIncome(SecondaryIncome secondaryIncome);

	public void updateSecondaryIncome(SecondaryIncome secondaryIncome);

	public List<SecondaryIncome> getAllSecondaryIncome();

}
