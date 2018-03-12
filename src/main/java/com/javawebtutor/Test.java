package com.javawebtutor;

import java.util.Date;

import org.hibernate.Session;

public class Test {
	public void testonDB (){
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();

		
		user.setUsername("lokesh");
		user.setCreatedBy("Google");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();

	}

}
