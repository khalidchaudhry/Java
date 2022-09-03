package co.edureka.hibernate.khalid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) throws Exception {
		
		SessionFactory sFactory=HibernateUtils.getSessionFactory();
		
		Session session=sFactory.openSession();		
		
		session.beginTransaction();
		
		//we can also provide positional parameters below
		String hql="delete co.edureka.khalid.hibernate.entity.Student where studentMarks<35";
		Query<Student> query=session.createQuery(hql,Student.class);
		int rows=query.executeUpdate();
		
		System.out.println("records deleted:"+rows);
		
		session.getTransaction().commit();	
		
		session.close();
		sFactory.close();
	}

}
