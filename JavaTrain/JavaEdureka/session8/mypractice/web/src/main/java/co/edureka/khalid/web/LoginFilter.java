package co.edureka.khalid.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns = { "/welcome" })
public class LoginFilter implements Filter {

    
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uid=request.getParameter("txt_uid");
		String pwd=request.getParameter("txt_pwd");
		if(uid.contentEquals("admin") && pwd.contentEquals("123")) {
			chain.doFilter(request, response);	
		}else {
			
			PrintWriter out=response.getWriter();
			out.println("<p style=text-align:center;font-size:18px;color;yellow>Invalid Username/Password</p>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
		
		

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
