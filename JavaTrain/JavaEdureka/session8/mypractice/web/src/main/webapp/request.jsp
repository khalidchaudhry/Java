<h2>
<%
String uid=request.getParameter("txt_uid");
String pwd=request.getParameter("txt_pwd");



%>
<hr>

Server Name=<%=request.getServerName()%> <br>
Server Port=<%=request.getServerPort()%> <br>
HTTPMethod =<%=request.getMethod()%>     <br>
Protocol =<%=request.getProtocol()%>     <br>

ApplicationName=<%=request.getContextPath()%> <br>

Content Type=<%=request.getContentType()%>

Content Size=<%=request.getContentLength()%>

</h2>