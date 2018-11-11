package com.org.dao;

import com.jwt.dao.RoleDao;
import com.jwt.model.Cart;
import com.org.model.Users;
import com.org.model.Role;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private RoleDao roleDao;

	@Override
	public void AddUsers(Users cust) {
		cust.setEnabled(true);
		Cart cart = new Cart();
		// Role roleAdmin = roleDao.get(1);
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_USER");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		cust.setRoles(roles);
		cust.setCart(cart);
		cart.setCustomer(cust);
		sessionFactory.getCurrentSession().save(cust);
		roleAdmin.setId(cust.getId());
		sessionFactory.getCurrentSession().save(roleAdmin);
	}

	@Override
	public void updateUsers(Users cust) {
		sessionFactory.getCurrentSession().update(cust);

	}

	@Override
	public void deleteUsers(int id) {
		Users users = (Users) sessionFactory.getCurrentSession().load(Users.class, id);

		if (null != users) {
			this.sessionFactory.getCurrentSession().delete(users);
		}
	}

	@Override
	public List<Users> getAllUsers() {

		return sessionFactory.getCurrentSession().createQuery("from Users").list();
	}

	@Override
	public Users getUsersById(int custId) {
		Users users = (Users) sessionFactory.getCurrentSession().get(Users.class, custId);
		return users;
	}

	@Override
	public Users getUsersByName(String custName) {

		Query query = sessionFactory.getCurrentSession().createQuery("from Users where name=:name");
		query.setParameter("name", custName);
		Users users = (Users) query.uniqueResult();
		return users;
	}
}