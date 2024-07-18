package com.hibernate;


import java.util.Properties; 

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;



public class HibernateUtil {

	 static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Properties settings=new Properties();
			settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hiberdb");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			settings.put(Environment.SHOW_SQL, "true");

			
			Configuration cfg = new Configuration();
			
			// Add annotated classes
			cfg.addAnnotatedClass(Employe12.class);
			
			cfg.setProperties(settings);

			
			// Add other annotated classes 

			// Build ServiceRegistry
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			    .applySettings(cfg.getProperties())
			    .build();

			// Build SessionFactory
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);

					}
		return sessionFactory;
		
	}
	
}