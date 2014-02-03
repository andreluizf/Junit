package br.com.testJunithibernate.projeto.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry registry;

	static {
		try {
			Configuration configuration = new Configuration().configure().setProperty("hibernate.cfg.xml", "false");
			registry=  new ServiceRegistryBuilder().applySettings(
	                configuration.getProperties()).buildServiceRegistry();
			 sessionFactory = configuration.buildSessionFactory(registry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
