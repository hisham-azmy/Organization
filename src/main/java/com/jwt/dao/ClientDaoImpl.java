package com.jwt.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Client;
import com.jwt.model.Product;

@Repository
@Transactional
public class ClientDaoImpl implements ClientDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddClient(Client client) {
		sessionFactory.getCurrentSession().save(client);

	}

	@Override
	public void updateClient(Client client) {
		sessionFactory.getCurrentSession().update(client);

	}

	@Override
	public void deleteClient(int id) {
		Client product = (Client) sessionFactory.getCurrentSession().load(Client.class, id);
		if (null != product) {
			this.sessionFactory.getCurrentSession().delete(product);
			this.sessionFactory.getCurrentSession().flush();
		}
	}

	@Override
	public List<Client> getAllClients() {

		Query q = sessionFactory.getCurrentSession().createQuery("from Client");
		List<Client> allProducts = (List<Client>) q.list();
		return allProducts;

	}

	@Override
	public List<Client> filterClientByTelephone(String telephone) {

		Query q = sessionFactory.getCurrentSession().createQuery("from Client where telephone LIKE :telephone");
		q.setParameter("name", "%" + telephone + "%");
		List<Client> allClients = (List<Client>) q.list();
		return allClients;
	}

	@Override
	public List<Client> filterClientsByName(String name) {
		Query q = sessionFactory.getCurrentSession().createQuery("from Client where name LIKE :name");
		q.setParameter("name", "%" + name + "%");
		List<Client> allProducts = (List<Client>) q.list();
		return allProducts;

	}

	@Override
	public List<Client> filterClientByCode(int id) {
		return null;
	}

	@Override
	public Client getClientById(int clientId) {
		return (Client) sessionFactory.getCurrentSession().get(Client.class, clientId);
	}

	@Override
	public List<String> allNameByClient(String name) {
		Query q = sessionFactory.getCurrentSession().createQuery("select name from Client where name LIKE :name");
		q.setParameter("name", "%" + name + "%");
		List<String> allNames = (List<String>) q.list();
		return allNames;

	}

	@Override
	public List<Product> filterProducts(String name, float min, float max) {
		// TODO Auto-generated method stub
		return null;
	}

}
