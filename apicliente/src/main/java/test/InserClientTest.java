package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.apiclient.dao.ClientDao;
import br.com.apiclient.dao.impl.ClientDaoImpl;
import br.com.apiclient.model.Client;

public class InserClientTest {

	public static void main(String[] args) {	
		
		Client c = new Client();
		c.setId(1);
		c.setName("Ventura");
		c.setCpf("01486262627");
		c.setEmail("gustavolv.85@gmail.com");
		
		new ClientDaoImpl().create(c);
	}

}
