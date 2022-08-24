package co.edureka.ems.dto;

public class Employee {
	private Integer employeeNumber;
	private String employeeName;
	private Float employeeSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeNumber, String employeeName, Float employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return String.format("Employee [%-4d %-12s %.2f]", employeeNumber, employeeName, employeeSalary);
	}

}
