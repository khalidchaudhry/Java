package co.edureka.hibernate.khalid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.khalid.hibernate.entity.Employee;
import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class SaveEmployee {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEmployeeId(123);
		emp.setEmployeeName("Khalid");
		emp.setEmployeeSalary(200000);
		
		session.save(emp);
		System.out.println("------------------------");
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		

	}

}
