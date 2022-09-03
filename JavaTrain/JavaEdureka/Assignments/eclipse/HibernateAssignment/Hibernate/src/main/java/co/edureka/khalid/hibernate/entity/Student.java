package co.edureka.khalid.hibernate.entity;

public class Student {
	
	private Integer studentId;
	private String studentName;
	private Integer studentMarks;
	
	public Student() {
		
	}
	public Student(Integer studentId, String studentName, Integer studentMarks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public Student(String studentName, Integer studentMarks) {
		this.studentName = studentName;
		this.studentMarks = studentMarks;
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
	public Integer getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		
		return String.format("Student [%3d | %-15s | %-20s]", studentId,studentName,studentMarks);
	}
	
	

}
