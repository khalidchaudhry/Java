package co.edureka.khalid.ems.service;

import co.edureka.khalid.ems.entity.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);

	public void updateEmployee(Employee emp);

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployeeByNo(Integer employeeId);

	public void getAllEmployees();

}
