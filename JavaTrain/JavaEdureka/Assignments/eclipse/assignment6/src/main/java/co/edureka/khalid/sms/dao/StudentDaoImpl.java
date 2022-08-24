package co.edureka.khalid.sms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.khalid.sms.configs.ConnectionFactory;
import co.edureka.khalid.sms.dto.Student;

public class StudentDaoImpl implements StudentDao {

	private static Statement st = null;
	private static Connection con =null; 

	public StudentDaoImpl() throws Exception {
		con = ConnectionFactory.getDBConnection();
		
		st = con.createStatement();
	}

	public Integer SaveStudent(Student std) throws Exception {
		String sql = "insert into student values(" + std.getStudentID() + ",'" + std.getStudentName() + "','"
				+std.getStudentClass()+"',"+std.getStudentMarks() + ")";	

		int rowsInserted = st.executeUpdate(sql);		
		return rowsInserted;

	}
	
	public void SaveStudents(List<Student> stds) throws Exception {
		if(stds.size()==0) {
			System.out.println("No students to save");
		}
		
		con.setAutoCommit(false);
		
		for(Student std:stds) {
			String sql = "insert into student values(" + std.getStudentID() + ",'" + std.getStudentName() + "','"
					+std.getStudentClass()+"',"+std.getStudentMarks() + ")";
			st.addBatch(sql);			
		}
		try {
			
			int[] rowsAffected=st.executeBatch();
			for(int n:rowsAffected) {
				System.out.println("rows affected=" + n);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		finally {
			con.setAutoCommit(true);
		}		
	}

	public Integer updateStudent(Student std) throws Exception {
		String sql = "update student set name='" + std.getStudentName() + "', class='" + std.getStudentClass()
		        + "',marks=" + std.getStudentMarks()
				+ " where ID=" + std.getStudentID();
		
		int rowsUpdated = st.executeUpdate(sql);
		return rowsUpdated;
	}

	public Integer deleteStudentByID(Integer ID) throws Exception {
		String sql = "delete from student where ID=" + ID;
		int rowsDeleted = st.executeUpdate(sql);
	
		return rowsDeleted;
	}
	
	public Student findStudentByID(int ID) throws Exception {
		Student std=null;
		String sql = "select name,class,marks from student where ID="+ID;
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()) {
		    std=new Student();
			std.setStudentID(ID);
			std.setStudentName(rs.getString(1));
			std.setStudentClass(rs.getString(2));
			std.setStudentMarks(rs.getFloat(3));
		}
		
		return std;
	}
	

	public List<Student> findAll() throws Exception {
		List<Student> students=new ArrayList<Student>();
		String sql = "select id,name,class,marks from student";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			Integer ID=rs.getInt(1);
			String name=rs.getString(2);
			String studentClass=rs.getString(3);
			Float marks=rs.getFloat(4);
			
		    Student std=new Student(ID,name,studentClass,marks);
			
			students.add(std);
		}
		
	    return students;
	}





}
