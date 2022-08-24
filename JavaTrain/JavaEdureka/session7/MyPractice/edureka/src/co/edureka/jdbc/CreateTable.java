package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		
		//1. Initialize MYSQL JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Connect to MYSQL db_edureka database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka","root","edureka786");
		
		
	    //3. Create an object for passing sql query
		Statement st=connection.createStatement();
		
		//4. Pass SQL query to create DB table
		String sql="create table emp(empno int(5),ename varchar(30),salary float(10,2), primary key(empno))";
		try {
			st.execute(sql);
			System.out.println("Database table created");
			
		}catch(Exception ex) {
			System.out.println("Error--->"+ex.toString());
		}
		
		
		//5. Close the connection with the database
		
		
		
		
		

	}

}
