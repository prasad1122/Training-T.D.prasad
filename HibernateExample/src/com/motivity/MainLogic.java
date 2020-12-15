package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	public static void main(String args[])
	{
Configuration cf=new Configuration();
cf.configure("configuration.xml");
SessionFactory sf=cf.buildSessionFactory();
Session se=sf.openSession();
Student prasad=new Student();
prasad.setId(1025);
prasad.setMarks(571);
prasad.setName("Ravi");
Transaction tx=se.beginTransaction();
se.save(prasad);
tx.commit();
se.close();
sf.close();
	}
}
