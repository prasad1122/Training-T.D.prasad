package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetlogicMethodhibernet {
	public static void main(String[] args) {
		

	Configuration cf=new Configuration();
	cf.configure("configuration.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session s=sf.openSession();
	Transaction ts=s.beginTransaction();
	Student st=s.get(Student.class, 1024);
	System.out.println(st.getId()+"  "+st.getName()+"  "+st.getMarks());
	st=(Student)s.get("com.motivity.Student", 1025);
	System.out.println(st.getId()+"  "+st.getName()+"  "+st.getMarks());
	s.save(st);
	}
}