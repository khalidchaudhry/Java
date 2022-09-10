package co.edureka.khalid.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.khalid.dao.EmployeeDao;
import co.edureka.khalid.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	public Employee getEmployeeByNo(Integer eno) {
		return dao.findEmployeeByNo(eno);
	}

}
