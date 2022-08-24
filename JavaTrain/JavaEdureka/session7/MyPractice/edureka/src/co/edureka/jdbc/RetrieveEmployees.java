package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception{
		Connection con=ConnectionFactory.getDBConnection();
		Statement st=con.createStatement();
		
		String sql="select * from emp";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getFloat("salary"));
			int empNo=rs.getInt(1);
			String empName=rs.getString(2);
			Float sal=rs.getFloat("salary");
			String emp=String.format("%4d %-13s %.2f", empNo,empName,sal);
			System.out.println(emp);	
			Thread.sleep(2000);
		}
		
		rs.close();
		st.close();
		con.close();

	}

}
