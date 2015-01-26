package br.com.apiclient.dao;

import java.util.ArrayList;

import br.com.apiclient.model.Client;

public interface ClientDao {
	
	public void create(Client c);
	
	public void delete(Client c);
	
	public Client findById(Integer id);
	
	public ArrayList<Client> findAlll();

}
