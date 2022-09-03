<%@page isErrorPage="true" %>
<body bgcolor=maroon text=cyan>
<h2>
<% 
 if(exception instanceof ArithmeticException)
	 out.println(exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println(exception.getMessage());
 else
	 out.println("Internal server error");
 
	 
 
 %>
</h2>