package br.com.apiclient.controller;

import java.util.ArrayList;

import br.com.apiclient.dao.impl.ClientDaoImpl;
import br.com.apiclient.model.Client;

public class ClientController {

	
	public Client findById(Integer id){
		return new ClientDaoImpl().findById(id);		
	}
	
	public ArrayList<Client> findAll(){
		return new ClientDaoImpl().findAlll();
	}
	
	public void create(Client c){
		new ClientDaoImpl().create(c);
	}
}
