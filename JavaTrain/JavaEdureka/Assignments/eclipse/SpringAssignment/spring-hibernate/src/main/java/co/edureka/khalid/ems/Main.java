package co.edureka.khalid.ems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.ems.dao.EmployeeDao;
import co.edureka.khalid.ems.entity.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("empdao");		
		
		dao.saveEmployee(new Employee(1,"Khalid Chaudhry",150000,200,0,400));
		dao.saveEmployee(new Employee(2,"Puneet Kumar",100000,50,0,200));
		dao.saveEmployee(new Employee(3,"Johny Keith",900000,10,0,200));
		dao.saveEmployee(new Employee(4,"Andrew Praise",200000,50,0,200));
		dao.saveEmployee(new Employee(5,"Eric Hanko",500000,100,0,200));
		dao.saveEmployee(new Employee(6,"Varun Dewan",50000,100,0,20));
		dao.saveEmployee(new Employee(7,"Anirban Sarkar",200000,100,0,200));
		dao.saveEmployee(new Employee(8,"Joseph Sarosh",500000,100,0,2000));
		dao.saveEmployee(new Employee(9,"john marquee",1000,100,0,2));
		dao.saveEmployee(new Employee(10,"Sachin Tendulkar",1000000,100,0,250000));
		
		Employee johnmarquee=dao.getByName("john marquee");
		System.out.println(johnmarquee);
		
		
		
	}

}
