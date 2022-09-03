<h2>
<% 
String uid=request.getParameter("txt_uid");
//String pwd=request.getParameter("txt_pwd");
out.println("Hello "+ uid);
pageContext.setAttribute("name",uid,PageContext.SESSION_SCOPE);

%>

</h2>
<br>
<br>

<a href="pagecontext2.jsp" >Next page</a>