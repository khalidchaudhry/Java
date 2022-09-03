package co.edureka.hibernate.khalid;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class DisplayStudents {

	public static void main(String[] args) throws Exception {
		SessionFactory sFactory=HibernateUtils.getSessionFactory();
		
		Session session=sFactory.openSession();
		String hql="from co.edureka.khalid.hibernate.entity.Student";
	    Query<Student> query=session.createQuery(hql,Student.class);
		List<Student> students=query.getResultList();
		for(Student st :students) {
			System.out.println(st);
			Thread.sleep(1000);
			}									
		session.close();
		sFactory.close();
	}

}
