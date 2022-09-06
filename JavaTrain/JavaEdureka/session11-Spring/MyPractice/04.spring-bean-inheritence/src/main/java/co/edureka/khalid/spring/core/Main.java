package co.edureka.khalid.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("user-beans.xml");
		User u1=(User)context.getBean("user1");
		System.out.println(u1);
		User u2=(User)context.getBean("user2");
		System.out.println(u2);
			
		

	}

}
