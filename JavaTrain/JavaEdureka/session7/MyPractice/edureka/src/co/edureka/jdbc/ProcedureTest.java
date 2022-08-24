package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureTest {

	public static void main(String[] args) throws Exception {
		Connection con=ConnectionFactory.getDBConnection();
		CallableStatement cst=con.prepareCall("call salary_hike(?,?,?)");
		
		int empno=101;
		int hike=10;
		
		cst.setInt(1,empno);
		cst.setInt(2,hike);
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		System.out.println("Updated salary for employee: "+empno+" is "+cst.getFloat(3));
		
		cst.close();
		con.close();
		
		

	}

}
