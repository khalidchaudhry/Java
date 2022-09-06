package co.edureka.khalid.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.khalid.ems.dao.EmployeeDao;
import co.edureka.khalid.ems.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public void saveEmployee(Employee emp) {
		int n = dao.saveEmployee(emp);
		if (n > 0)
			System.out.println("Employee Saved!!!");
	}

	public void updateEmployee(Employee emp) {
		int n = dao.updateEmployee(emp);
		if (n > 0)
			System.out.println("Employee Updated!!!");
	}

	public void deleteEmployee(Integer eno) {
		int n = dao.deleteEmployeeByNo(eno);
		if (n > 0)
			System.out.println("Employee Deleted!!!");
		else
			System.out.println("No matching Employee to delete!!!");
	}

	public Employee getEmployeeByNo(Integer eno) {
		return dao.findEmployeeByNo(eno);
	}

	public void getAllEmployees() {
		List<Employee> emps = dao.findAll();

		for (Employee emp : emps) {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}

}
