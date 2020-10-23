package com.PJavaHibernateConnectivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.PJavaHibernateConnectivity.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       
       Session session = factory.openSession();
       
       session.beginTransaction();
       
       Student student = new Student();
       student.setName("aaaaa");
       
       session.save(student);
       
       session.getTransaction().commit();
       session.close();
    }
}
