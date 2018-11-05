package com.jwt.service;

import java.util.List;

import com.jwt.model.Client;

public interface ClientServcie {
	public void AddClient(Client client);

	public void updateClient(Client client);

	public void deleteClient(int id);

	public List<Client> getAllClients();

	public List<Client> filterClientByTelephone(String telephone);

	public List<Client> filterClientsByName(String name);

	public List<Client> filterClientByCode(int id);

	public List<String> allNameByClient(String name);
	
	public Client getClientById(int clientId);

}
