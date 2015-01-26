package br.com.apiclient.service;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.apiclient.controller.ClientController;
import br.com.apiclient.model.Client;


@Path("/client")
public class ClientService {
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Client> create(String a){
		return new ClientController().findAll();
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Client findById(@PathParam("id") Integer id){
		return new ClientController().findById(id);
	}
	
	
	@POST
	@Consumes("application/json")
	public void create(Client c){
		new ClientController().create(c);
	}
}
