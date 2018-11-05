package com.jwt.service;

import com.jwt.dao.ClientDao;
import com.jwt.model.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements ClientServcie {

	@Autowired
	private ClientDao clientDao;

	@Override
	public void AddClient(Client client) {
		clientDao.AddClient(client);
	}

	@Override
	public void updateClient(Client client) {
		clientDao.updateClient(client);
	}

	@Override
	public void deleteClient(int id) {

		clientDao.deleteClient(id);
	}

	@Override
	public List<Client> getAllClients() {

		return clientDao.getAllClients();
	}

	@Override
	public List<Client> filterClientByTelephone(String telephone) {

		return clientDao.filterClientByTelephone(telephone);
	}

	@Override
	public List<Client> filterClientsByName(String name) {
		return clientDao.filterClientsByName(name);
	}

	@Override
	public List<Client> filterClientByCode(int id) {
		return clientDao.filterClientByCode(id);
	}

	@Override
	public Client getClientById(int clientId) {
		return clientDao.getClientById(clientId);
	}

	@Override
	public List<String> allNameByClient(String name) {
		// TODO Auto-generated method stub
		return clientDao.allNameByClient(name);
	}

}
