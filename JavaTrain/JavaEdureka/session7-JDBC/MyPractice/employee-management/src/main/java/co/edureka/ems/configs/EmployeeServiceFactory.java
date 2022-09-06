package co.edureka.ems.configs;

import co.edureka.ems.service.EmployeeService;
import co.edureka.ems.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService service;
	
	public static EmployeeService getEmployeeService() throws Exception{
		if(service==null) {
			service=new EmployeeServiceImpl();
		}
		return service;
	}

}
