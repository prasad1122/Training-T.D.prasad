package com.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conf {
	
		public static Session config() {
			Configuration cf=new Configuration();
			cf.configure("configuration.xml");
			SessionFactory sf=cf.buildSessionFactory();
			Session se=sf.openSession();
			return se;
	}
}