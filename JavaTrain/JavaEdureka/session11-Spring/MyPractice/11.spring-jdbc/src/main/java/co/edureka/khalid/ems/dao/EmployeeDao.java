package co.edureka.khalid.ems.dao;

import java.util.List;

import co.edureka.khalid.ems.entity.Employee;



public interface EmployeeDao {

	public Integer saveEmployee(Employee emp);

	public Integer updateEmployee(Employee emp);

	public Integer deleteEmployeeByNo(Integer eno);

	public Employee findEmployeeByNo(Integer eno);

	public List<Employee> findAll();
}
