package co.edureka.hibernate.khalid;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.khalid.hibernate.entity.Student;
import co.edureka.khalid.hibernate.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);

		String req = "Y";
		while (req.equalsIgnoreCase("Y")) {

			System.out.println("enter student name and email:");
			String name = sc.next();
			Integer studentMarks = sc.nextInt();
			

			Student st = new Student(name, studentMarks);
			session.save(st);
			System.out.println();
			System.out.println("do you want to save more students[Y/N]");
			req = sc.next();

		}

		sc.close();

		System.out.println("--------------------------------------------------");

		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
