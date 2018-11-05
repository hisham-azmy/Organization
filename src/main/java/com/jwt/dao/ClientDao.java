package com.jwt.dao;

import java.util.List;

import com.jwt.model.Client;
import com.jwt.model.Product;

public interface ClientDao {

	public void AddClient(Client client);

	public void updateClient(Client client);

	public void deleteClient(int id);

	public List<Client> getAllClients();

	public List<Client> filterClientByTelephone(String telephone);

	public List<Client> filterClientsByName(String name);

	public List<Client> filterClientByCode(int id);

	public Client getClientById(int clientId);

	public List<String> allNameByClient(String name);

	public List<Product> filterProducts(String name, float min, float max);

}
