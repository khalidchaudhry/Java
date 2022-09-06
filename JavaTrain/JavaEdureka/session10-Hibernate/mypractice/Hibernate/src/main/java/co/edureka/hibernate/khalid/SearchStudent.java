package co.edureka.hibernate.khalid;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class SearchStudent {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Student st=session.get(Student.class, session);
		
		System.out.println(st);
		
		try {
			session.load(st, 1015);
			
		}catch(Exception ex) {
			
			System.out.println(ex);	
		}
		
		System.out.println(st);
		
		System.out.println("--------------------------------------------------");
		
		session.close();
		sessionFactory.close();	

	}

}
