package br.com.apiclient.dao.impl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.apiclient.dao.ClientDao;
import br.com.apiclient.model.Client;

public class ClientDaoImpl implements ClientDao {

	private EntityManager em;
	
	public ClientDaoImpl(){
		em = new ConnectionFactoryImpl().getConnection("apiclient");
	}
	
	public void create(Client c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Client c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		em.close();

	}

	public Client findById(Integer id) {
		em.getTransaction().begin();
		Client c = em.find(Client.class, id);
		em.getTransaction().commit();
		em.close();
		return c;
	}

	public ArrayList<Client> findAlll() {
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT c FROM Client c");
		ArrayList<Client> arrayClient = (ArrayList<Client>) query.getResultList();
		em.getTransaction().commit();
		em.close();
		return arrayClient;
	}

}
