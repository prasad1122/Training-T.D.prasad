package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorupdateMethodhibernet {
public static void main(String[] args) {
	Configuration cg=new Configuration();
	cg.configure("configuration.xml");
	SessionFactory sf=cg.buildSessionFactory();
	Session s=sf.openSession();
			Student ravi=new Student();
			ravi.setId(1021);
			ravi.setName("pravallika");
			ravi.setMarks(656);
			
			Transaction ts=s.beginTransaction(); 
				s.saveOrUpdate(ravi);
				ts.commit();
				s.close();
				sf.close();
}
}