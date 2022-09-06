package co.edureka.ems.service;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee emp) throws Exception;
	public void updateEmployee(Employee emp) throws Exception;
	public void deleteEmployeeByNo(Integer empNo) throws Exception;
	public Employee getEmployeeByNo(Integer empNo) throws Exception;
	public void getAllEmployee()throws Exception;	
}
