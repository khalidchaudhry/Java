package co.edureka.khalid.ems.service;

import co.edureka.khalid.ems.entity.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);

	public void updateEmployee(Employee emp);

	public void deleteEmployee(Integer eno);

	public Employee getEmployeeByNo(Integer eno);

	public void getAllEmployees();

}
