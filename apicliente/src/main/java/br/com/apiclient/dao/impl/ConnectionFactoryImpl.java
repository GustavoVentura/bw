package br.com.apiclient.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.apiclient.dao.ConnectionFactory;

public class ConnectionFactoryImpl implements ConnectionFactory {

	public EntityManager getConnection(String persistenceUnit) {

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory(persistenceUnit);
		EntityManager em = emfactory.createEntityManager();

		return em;
	}

}
