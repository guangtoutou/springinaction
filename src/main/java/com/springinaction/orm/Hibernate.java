package com.springinaction.orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Hibernate {
	private EntityManagerFactory entityManagerFactory;

	@Before
	public void setUp() throws Exception {
		// like discussed with regards to SessionFactory, an
		// EntityManagerFactory is set up once for an application
		// IMPORTANT: notice how the name here matches the name we gave the
		// persistence-unit in persistence.xml!
		entityManagerFactory = Persistence.createEntityManagerFactory("com.springinaction.orm.spitter");
	}

	@After
	public void tearDown() throws Exception {
		entityManagerFactory.close();

	}

	@Test
	public void testHibernate() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// now lets pull events from the database and list them
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Spitter> result = entityManager.createQuery("from Spitter", Spitter.class).getResultList();
		for (Spitter spitter : (List<Spitter>) result) {
			System.out.println("Event (" + spitter.getFullName() + ") : " + spitter.getEmail());
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
