package co.edureka.khalid.sms.dto;

public class Student {
	private Integer studentID;
	private String studentName;
	private String studentClass;
	private Float studentMarks;

	public Student() {
		
	}

	public Student(Integer studentID, String studentName,String studentClass,Float studentMarks) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentClass=studentClass;
		this.studentMarks = studentMarks;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {		
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Float studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return String.format("Student [%-4d %-12s %-12s %.2f]", studentID, studentName,studentClass, studentMarks);
	}

}
