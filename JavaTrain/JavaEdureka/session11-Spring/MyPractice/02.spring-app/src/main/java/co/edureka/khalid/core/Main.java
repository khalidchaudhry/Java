package co.edureka.khalid.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//initialize sprint container
		
		ApplicationContext context=new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("==========================================================");
		
		User usr=(User)context.getBean("usr1");
		System.out.println(usr);
	    
		System.out.println("==========================================================");

		User usr2=context.getBean("usr1",User.class);
		System.out.println(usr2);
		
		System.out.println("==========================================================");

		User usr3=context.getBean("usr1",User.class);
		System.out.println(usr3);	 
		
		System.out.println("==========================================================");

		User usr4=context.getBean("usr2",User.class);
		System.out.println(usr4);	 
	
		}

	}
