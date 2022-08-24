package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		Connection con=ConnectionFactory.getDBConnection();
		
		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
		
		String req="Y";
		while(req.equalsIgnoreCase("Y")) {
			System.out.println("enter empno,name,salary:");
			int empNo= sc.nextInt();
			String name=sc.next();
			float sal=sc.nextFloat();
			
			pst.setInt(1, empNo);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n=pst.executeUpdate();
			System.out.println("employee saved");
			System.out.println();
			
			System.out.println("Do you want to add more employees?(Y/N)");
			req=sc.next();
			
			
		}
		
		
		
	}

}
