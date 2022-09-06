package co.edureka.hibernate.khalid;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Batch;
import co.edureka.khalid.hibernate.entity.Faculty;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class RelationshipTests {

	public static void main(String[] args) {
		SessionFactory sFactory=HibernateUtils.getSessionFactory();
		Session session=sFactory.openSession();
		Transaction tx=session.beginTransaction();
		Faculty faculty=new Faculty("Sunil Joseph");
		
		Batch batch1=new Batch(101,"Java certification",faculty);
		Batch batch2=new Batch(102,"Python certification",faculty);
		Batch batch3=new Batch(103,"Android certification",faculty);
		
		Set<Batch> batches=new HashSet<Batch>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);
			
		tx.commit();
		session.close();
		sFactory.close();
		
	}

}
