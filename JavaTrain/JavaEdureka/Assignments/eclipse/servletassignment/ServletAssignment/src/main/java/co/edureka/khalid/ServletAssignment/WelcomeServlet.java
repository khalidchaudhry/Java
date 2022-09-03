package co.edureka.khalid.ServletAssignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid=request.getParameter("txt_uid");
		String pwd=request.getParameter("txt_pwd");
		
		Cookie c1=new Cookie("name",uid);
		Cookie c2=new Cookie("pwd",pwd);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body style=background-color:lightgreen;text-align:center>");
		out.println("<h1>edureka limited</h1>");
		out.println("<img src=images/edureka.jpeg>");
		out.println("<hr>");
		out.println("<p style=text-align:left;font-size:20px> hi "+uid+"</p>");
		out.println("</hr>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
