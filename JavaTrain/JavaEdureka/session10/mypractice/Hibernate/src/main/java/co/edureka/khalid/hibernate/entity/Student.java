package co.edureka.khalid.hibernate.entity;

public class Student {
	
	private Integer studentId;
	private String studentName;
	private String studentEmail;
	
	public Student() {
		
	}
	public Student(Integer studentId, String studentName, String studentEmail) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public Student(String studentName, String studentEmail) {
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		
		return String.format("Student [%3d | %-15s | %-20s]", studentId,studentName,studentEmail);
	}
	

}
