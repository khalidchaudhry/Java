package co.edureka.hibernate.khalid;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		

		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		Scanner sc=new Scanner(System.in);
		session.beginTransaction();
		
		Student st=session.get(Student.class, 104);
	     if(st!=null) {
	    		
	 		System.out.println(st);
	 	
	    	System.out.println("Do you want to delete the student?(Y/N)");
	    	 
	    	String req=sc.next();
	    	if(req.equalsIgnoreCase("Y")) {
	    		
	    		session.delete(st); 
	    	} 
	    	
	     }
	     else {
	    	 System.out.println("No matching student found");
	     }
		
		
		
		System.out.println("--------------------------------------------------");
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();	

	}

}
