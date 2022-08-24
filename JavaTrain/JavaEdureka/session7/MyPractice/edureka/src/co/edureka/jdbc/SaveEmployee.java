package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{
		
		Connection con=ConnectionFactory.getDBConnection();
		
		Statement st=con.createStatement();
		
		String sql="insert into emp values(102,'Punkaj Kummar',35000),"
				+ "(103,'Charles',4500),"
				+ "(104,'Mark',5500),"
				+ "(105,'Rahul',6500)";
		
		try {
			
			int rowsAffected=st.executeUpdate(sql);
			System.out.println("employees saved="+rowsAffected);
			
			
			
		}catch(Exception ex) {
			System.out.println(ex);
			
		}
		
		st.close();
		con.close();

	}

}
