package co.edureka.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.ems.configs.ConnectionFactory;
import co.edureka.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Statement st = null;

	public EmployeeDaoImpl() throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		st = con.createStatement();

	}

	public Integer SaveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values(" + emp.getEmployeeNumber() + ",'" + emp.getEmployeeName() + "',"
				+ emp.getEmployeeSalary() + ")";

		int rowsInserted = st.executeUpdate(sql);
		return rowsInserted;

	}

	public Integer updateEmployee(Employee emp) throws Exception {
		String sql = "update emp set ename='" + emp.getEmployeeName() + "', sal=" + emp.getEmployeeSalary()
				+ " where empno=" + emp.getEmployeeNumber();
		int rowsUpdated = st.executeUpdate(sql);
		return rowsUpdated;
	}

	public Integer deleteEmployeeByNo(Integer empNo) throws Exception {
		String sql = "delete from emp where empno=" + empNo;
		int rowsDeleted = st.executeUpdate(sql);

		return rowsDeleted;
	}
	
	public Employee findEmployeeByEmployeeNo(int empNo) throws Exception {
		Employee emp=null;
		String sql = "select ename,salary from emp where empno="+empNo;
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()) {
		    emp=new Employee();
			emp.setEmployeeNumber(empNo);
			emp.setEmployeeName(rs.getString(1));
			emp.setEmployeeSalary(rs.getFloat(2));
		}
		
		return emp;
	}
	

	public List<Employee> findAll() throws Exception {
		List<Employee> employees=new ArrayList<Employee>();
		String sql = "select * from emp";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			Integer empNo=rs.getInt(1);
			String empName=rs.getString(2);
			Float empSal=rs.getFloat(3);
			
		    Employee emp=new Employee(empNo,empName,empSal);
			
			employees.add(emp);
		}
		
	    return employees;
	}



}
