package co.edureka.khalid.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		super();
		
		System.out.println("In no argument constructor");
	}

	public User(String firstName, String lastName) {
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

	@Override
	public String toString() {
		return "User [First Name=" + firstName + ", Last Name=" + lastName + "]";
	}

}
