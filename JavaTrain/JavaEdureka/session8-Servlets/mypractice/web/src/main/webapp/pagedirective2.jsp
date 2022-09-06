<%@page errorPage="handler.jsp" %> 
<h2>
<%!
int x=10;
int y=5;
//int y=0;
int[] marks=new int[10];
%>
<%
int z=x/y;
out.println(x + "/" + y + "=" + z + "<br>");
out.println(marks[10]);
%>