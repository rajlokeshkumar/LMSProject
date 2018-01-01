package com.LMS.jpaconnectivity;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

public class BaseJpadao {

@PersistenceContext(unitName="LMSProject")	
public EntityManagerFactory entityManagerFactory;

public EntityManager getEntityManager() {
	return entityManagerFactory.createEntityManager();
}
	
}

