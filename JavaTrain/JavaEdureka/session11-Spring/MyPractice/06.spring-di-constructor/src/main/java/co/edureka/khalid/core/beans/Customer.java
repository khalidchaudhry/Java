package co.edureka.khalid.core.beans;

public class Customer {
	private String firstName;
	private String lastName;
	private Car car;

	public Customer(String firstName, String lastName, Car car) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.car = car;
	}

	public String getFirstName() {

		System.out.println("in getFirstName()");
		return firstName;
	}

	public String getLastName() {
		System.out.println("in getLastName()");
		return lastName;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "User [First Name=" + firstName + ", Last Name=" + lastName + "]";
	}

}
