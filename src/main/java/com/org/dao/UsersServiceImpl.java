package com.org.dao;

import com.jwt.dao.EmployeeDAO;
import com.jwt.model.Employee;
import com.org.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao customerDaoDAO;

	@Override
	public void AddUsers(Users user) {
		customerDaoDAO.AddUsers(user);
	}

	@Override
	public void updateUsers(Users user) {
		customerDaoDAO.updateUsers(user);
	}

	@Override
	public void deleteUsers(int id) {
		customerDaoDAO.deleteUsers(id);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return customerDaoDAO.getAllUsers();
	}

	@Override
	public Users getUsersById(int userId) {
		// TODO Auto-generated method stub
		return customerDaoDAO.getUsersById(userId);
	}

	@Override
	public Users getUsersByName(String userName) {
		// TODO Auto-generated method stub
		return customerDaoDAO.getUsersByName(userName);
	}
}
