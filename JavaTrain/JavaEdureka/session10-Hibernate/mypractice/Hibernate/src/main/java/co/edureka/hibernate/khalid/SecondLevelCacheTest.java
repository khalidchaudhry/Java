package co.edureka.hibernate.khalid;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class SecondLevelCacheTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session=sessionFactory.openSession();

		Session session2=sessionFactory.openSession();
		
		Student st=session.get(Student.class, 101);
		if(st!=null) {
		System.out.println(st);
		}else {
			
			System.out.println("No matching student found!!");
		}
		
		System.out.println("--------------------------------------------------");
		
		Student st2=session2.get(Student.class, 101);
		if(st2!=null) {
		System.out.println(st);
		}else {
			
			System.out.println("No matching student found!!");
		}
		
		session.close();
		session2.close();
		sessionFactory.close();	

	}

}
