package com.ltts.demo.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory facto = cfg.buildSessionFactory();
    	Session session = facto.openSession();
    	Transaction t = session.beginTransaction();
    	Employee e = new Employee();
    	e.setEmpId(101);
    	e.setEmpName("Somyajeet");
    	e.setEmpAdd("WB");
    	t.commit();
    	session.save(e);
    	facto.close();
    	session.close();
    }
}
