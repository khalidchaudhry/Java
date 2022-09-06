<%@page import="java.util.Date" info="this page expalins about info directive of JSP" language="java" %>
<h2 style="text-align:center;color:blue">
<%
Date date=new Date();
out.println(date);
%>
<hr>
<%=getServletInfo() %>
</h2>
