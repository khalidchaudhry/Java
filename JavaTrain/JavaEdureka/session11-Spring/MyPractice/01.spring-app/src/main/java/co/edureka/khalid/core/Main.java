package co.edureka.khalid.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize sprint container
		
		ApplicationContext context=new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("==========================================================");
		
		int noOfBeans=context.getBeanDefinitionCount();
		System.out.println("Number of beans configured:"+noOfBeans);
		
		String[] beanNames=context.getBeanDefinitionNames();
		for(String beanName:beanNames) {			
			System.out.println("------->  "+beanName);
		}
		

	}

}
