package co.edureka.khalid.sms.dao;

import java.util.List;

import co.edureka.khalid.sms.dto.Student;

public interface StudentDao {
	public Integer SaveStudent(Student std) throws Exception;
	public void SaveStudents(List<Student> stds) throws Exception;
	public Integer updateStudent(Student std) throws Exception;
	public Integer deleteStudentByID(Integer ID) throws Exception;
	public Student findStudentByID(int ID) throws Exception;
	public List<Student> findAll() throws Exception;
	

}
