package co.edureka.khalid.sms.configs;

import co.edureka.khalid.sms.service.StudentService;
import co.edureka.khalid.sms.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService service;
	
	public static StudentService getStudentService() throws Exception{
		if(service==null) {
			service=new StudentServiceImpl();
		}
		return service;
	}

}
