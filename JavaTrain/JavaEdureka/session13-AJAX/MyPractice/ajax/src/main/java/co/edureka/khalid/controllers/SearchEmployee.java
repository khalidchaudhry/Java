package co.edureka.khalid.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.entity.Employee;
import co.edureka.khalid.service.EmployeeService;


public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService service;
       
    public SearchEmployee() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
	   ApplicationContext context=new ClassPathXmlApplicationContext("employee-beans.xml");
	   service=(EmployeeService)context.getBean("employee-service");
	   
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get employee number
		String empno=request.getParameter("eno");
		Employee emp=service.getEmployeeByNo(Integer.parseInt(empno));
		
		PrintWriter out=response.getWriter();
		
		if(emp!=null) {
			
			response.setContentType("application/json");
			String name=emp.getEmployeeName();
			Float sal=emp.getEmployeeSalary();
			
			JSONObject obj=new JSONObject();
			obj.put("name",name );
			obj.put("sal",sal );
			
			out.print(obj);
			
		}else {
			response.setContentType("text/plain");
			out.print("");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
