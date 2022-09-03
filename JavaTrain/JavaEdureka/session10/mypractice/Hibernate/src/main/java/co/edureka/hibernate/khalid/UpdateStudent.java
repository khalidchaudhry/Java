package co.edureka.hibernate.khalid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		

		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		 Student st=session.get(Student.class, 104);
		//Student st=new Student(104,"Nadeem Khan","nadeem@edureka.co");
		
		//		session.update(st);
		//		tx.commit();
		
		st.setStudentName("Nadeem");
		
		tx.commit();
		
		System.out.println(st);
		
		System.out.println("--------------------------------------------------");
		
		session.close();
		sessionFactory.close();	

	}

}
