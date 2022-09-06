package co.edureka.khalid.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		//initialize spring container
		
		ApplicationContext context=new ClassPathXmlApplicationContext("customer-car-beans.xml");
		
		Customer cust=(Customer)context.getBean("cust1");
		
		System.out.println(cust.getFirstName() +" "+ cust.getLastName()+" owns a "
		+cust.getCar().getModel()+" cost US "+cust.getCar().getCost() );

	}

}
