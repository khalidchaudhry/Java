package co.edureka.hibernate.khalid;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) throws Exception {
		SessionFactory sFactory=HibernateUtils.getSessionFactory();
		
		Session session=sFactory.openSession();
		//String hql="from co.edureka.khalid.hibernate.entity.Student where studentName='Ahmed'";
		//String hql="from co.edureka.khalid.hibernate.entity.Student where studentName like 'A%'";
		
		//Query<Student> query=session.createQuery(hql,Student.class);
		
		//String hql="from co.edureka.khalid.hibernate.entity.Student where studentId between ?0 and ?1";//positional parameter
		

		//String hql="from co.edureka.khalid.hibernate.entity.Student where studentId between :minsid and :maxsid";//named parameter
		
//		Query<Student> query=session.createQuery(hql,Student.class);
//		query.setParameter("minsid", 100);
//		query.setParameter("maxsid", 200);
//		
//		
//		List<Student> students=query.getResultList();
//		for(Student st :students) {
//			System.out.println(st);
//			Thread.sleep(1000);
//		}
		
		
		session.beginTransaction();
		
		//we can also provide positional parameters below
		String hql="update co.edureka.khalid.hibernate.entity.Student set studentName='Khalid Ch' where studentId=101";
		Query query=session.createQuery(hql);
		int rows=query.executeUpdate();
		
		System.out.println("records updated:"+rows);
		
		session.getTransaction().commit();
		
		
		
		session.close();
		sFactory.close();
	}

}
