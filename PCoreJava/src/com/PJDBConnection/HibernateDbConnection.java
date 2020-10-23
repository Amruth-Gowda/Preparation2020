package com.PJDBConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class HibernateDbConnection {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Student student = new Student();
		student.setName("AmruuuuutL");
		session.save(student);
		session.getTransaction().commit();
		session.close();
		
		System.out.println(student);
		
	}

}
