package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteMethodInhibernet {
	public static void main(String[] args) {
		

		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student st=s.get(Student.class, 1023);
		s.delete(st);//delete the entire row
		tx.commit();
		
	}
}