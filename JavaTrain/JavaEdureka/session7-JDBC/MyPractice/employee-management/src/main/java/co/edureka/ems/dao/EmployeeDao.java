package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.dto.Employee;

public interface EmployeeDao {
	public Integer SaveEmployee(Employee emp) throws Exception;
	public Integer updateEmployee(Employee emp) throws Exception;
	public Integer deleteEmployeeByNo(Integer empNo) throws Exception;
	public Employee findEmployeeByEmployeeNo(int empNo) throws Exception;
	public List<Employee> findAll() throws Exception;
	

}
