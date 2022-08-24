package co.edureka.khalid.sms.service;

import java.util.List;

import co.edureka.khalid.sms.dao.StudentDao;
import co.edureka.khalid.sms.dao.StudentDaoImpl;
import co.edureka.khalid.sms.dto.Student;

public class StudentServiceImpl implements StudentService {

	private static StudentDao dao;
	
	
	public StudentServiceImpl() throws Exception{
	  dao=new StudentDaoImpl();	
	}

	public void saveStudent(Student std) throws Exception {
		
		int n=dao.SaveStudent(std);
		if(n>0) {
			System.out.println("student saved!!");
		}
	}
	public void saveStudents(List<Student> stds) throws Exception {
		dao.SaveStudents(stds);		
	}

	public void updateStudent(Student std) throws Exception {
		int n=dao.updateStudent(std);
		if(n>0) {
			System.out.println("Student updated!!");
		}	
	}

	public void deleteStudentByID(Integer ID) throws Exception {
		int n=dao.deleteStudentByID(ID);
		if(n>0) {
			System.out.println("Employee deleted!!");
		}	else
		{
			System.out.println("No matching employee to delete");
		}
	}

	public Student getStudentByID(Integer ID) throws Exception {
		   
		return dao.findStudentByID(ID);
	}

	public void  getAllStudent() throws Exception {
		
		  List<Student> stds=dao.findAll();
		  
		  for(Student std:stds) {
			  System.out.println(std);
			  Thread.sleep(1000);
		  }			
	}

	
}
