package co.edureka.ems.service;

import java.util.List;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dao.EmployeeDaoImpl;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeDao dao;
	
	
	public EmployeeServiceImpl() throws Exception{
	  dao=new EmployeeDaoImpl();	
	}

	public void saveEmployee(Employee emp) throws Exception {
		
		int n=dao.SaveEmployee(emp);
		if(n>0) {
			System.out.println("Employee saved!!");
		}
	}

	public void updateEmployee(Employee emp) throws Exception {
		int n=dao.updateEmployee(emp);
		if(n>0) {
			System.out.println("Employee updated!!");
		}	
	}

	public void deleteEmployeeByNo(Integer empNo) throws Exception {
		int n=dao.deleteEmployeeByNo(empNo);
		if(n>0) {
			System.out.println("Employee deleted!!");
		}	else
		{
			System.out.println("No matching employee to delete");
		}
	}

	public Employee getEmployeeByNo(Integer empNo) throws Exception {
		
		return dao.findEmployeeByEmployeeNo(empNo);
	}

	public void  getAllEmployee() throws Exception {
		
		  List<Employee> emps=dao.findAll();
		  
		  for(Employee emp:emps) {
			  System.out.println(emp);
			  Thread.sleep(1000);
		  }			
	}
}
