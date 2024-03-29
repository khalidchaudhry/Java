package co.edureka.khalid.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");

		Hospital hosp = (Hospital)context.getBean("apollo");

		System.out.println("Hospital Name : " + hosp.getHospitalName());

		System.out.println("Departments==> ");

		List<String> depts = hosp.getDepartments(); 
		for(String dept : depts ) {
			System.out.println("   ---> " + dept);
		} 	


	}

}
