package co.edureka.hibernate.khalid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.khalid.hibernate.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("co/edureka/khalid/hibernate/configs/hibernate.cfg.xml"); //XML parsing
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student st=new Student();
		st.setStudentId(101);
		st.setStudentName("Khalid Chaudhry");
		st.setStudentEmail("khalidchaudhry2@hotmail.com");
		
		session.save(st);
		System.out.println("------------------------");
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		

	}

}
