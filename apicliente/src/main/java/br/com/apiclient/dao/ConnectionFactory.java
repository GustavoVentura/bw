package br.com.apiclient.dao;

import javax.persistence.EntityManager;

public interface ConnectionFactory {
	
	public EntityManager getConnection(String persistenceUnit);

}
