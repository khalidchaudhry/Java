package co.edureka.Khalid.Assignment;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PreparedStatement pst=null;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
		       Class.forName("com.mysql.cj.jdbc.Driver");
		       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka","root","edureka786");
		       pst=con.prepareStatement("select username,password from users where username=? and password=?");
			
		}catch(Exception ex) {
				System.out.println(ex);		
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the form data 
		String uid=request.getParameter("txt_uid");
		String pwd=request.getParameter("txt_pwd");
		try {
		pst.setString(1, uid);
		pst.setString(2, pwd);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);			
		}else {
			PrintWriter out=response.getWriter();
			out.println("<p style=text-align:center;font-size:18px;color;yellow>Invalid Username/Password</p>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			
		}
		}catch(Exception ex) {
			
			System.out.println(ex);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
