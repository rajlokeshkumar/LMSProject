package com.LMS.jpaconnectivity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeJpadaoimpl extends BaseJpadao{

public Employee selectemp() {
	Employee result=null;
	try {
		
		   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "LMSProject" );
		      
		      EntityManager entitymanager = emfactory.createEntityManager( );
		      entitymanager.getTransaction( ).begin( );
		      Employee employee = entitymanager.find( Employee.class, 1 );
		      entitymanager.close();
		      emfactory.close();
/*		Query a=this.getEntityManager().createQuery("select * from Employee ");
		
		 result=(Employee) a.getResultList();*/
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	
	return result;
}
	
}
