package co.edureka.hibernate.khalid;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class SearchStudent2 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Student st=session.get(Student.class, 1015);
		System.out.println(st);
		
		System.out.println("--------------------------------------------------");
		
		session.close();
		sessionFactory.close();	

	}

}
