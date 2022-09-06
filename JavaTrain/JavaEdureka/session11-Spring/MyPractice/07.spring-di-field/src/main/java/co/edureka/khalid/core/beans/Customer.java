package co.edureka.khalid.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String firstName;
	private String lastName;
	@Autowired
	//@Qualifier("audi")
	private Car car;

	public Customer() {
		super();
		
		System.out.println("In no argument constructor");
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("in two argument constructor");
	}

	public String getFirstName() {
		
		System.out.println("in getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("in setFirstName()");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("in getLastName()");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("in setLastName()");
		this.lastName = lastName;
	}
	

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "User [First Name=" + firstName + ", Last Name=" + lastName + "]";
	}

}
