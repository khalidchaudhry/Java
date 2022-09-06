package co.edureka.hibernate.khalid;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class FirstLevelCacheTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Student st=session.get(Student.class, 101);
		if(st!=null) {
		System.out.println(st);
		}else {
			
			System.out.println("No matching student found!!");
		}
		
		System.out.println("--------------------------------------------------");
		
		Student st2=session.get(Student.class, 101);
		if(st2!=null) {
		System.out.println(st);
		}else {
			
			System.out.println("No matching student found!!");
		}
		
		session.close();
		sessionFactory.close();	

	}

}
