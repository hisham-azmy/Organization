package com.org.dao;

import java.util.List;

import com.org.model.Users;

public interface UsersService {

	public void AddUsers(Users user);

	public void updateUsers(Users user);

	public void deleteUsers(int id);

	public List<Users> getAllUsers();

	public Users getUsersById(int userId);

	public Users getUsersByName(String userName);
}
