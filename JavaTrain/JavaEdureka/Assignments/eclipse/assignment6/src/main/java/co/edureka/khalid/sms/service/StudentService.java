package co.edureka.khalid.sms.service;

import java.util.List;

import co.edureka.khalid.sms.dto.Student;

public interface StudentService {
	
	public void saveStudent(Student std) throws Exception;
	public void saveStudents(List<Student> stds) throws Exception;
	public void updateStudent(Student std) throws Exception;
	public void deleteStudentByID(Integer studentID) throws Exception;
	public Student getStudentByID(Integer studentID) throws Exception;
	public void getAllStudent()throws Exception;	
}
