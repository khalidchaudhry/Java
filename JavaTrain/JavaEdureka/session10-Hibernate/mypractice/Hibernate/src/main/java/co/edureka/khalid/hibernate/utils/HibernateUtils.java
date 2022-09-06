package co.edureka.khalid.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration config=new Configuration();
		config.configure("co/edureka/khalid/hibernate/configs/hibernate.cfg.xml"); //XML parsing
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		return sessionFactory;
	}

}
