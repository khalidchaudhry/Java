<h2>
<% 
//String name=request.getParameter("txt_uid");
String name=request.getParameter("txt_uuid");
out.println("User Name="+ name);
%>
<hr>

  <!--User Name: ${param.txt_uid} -->
  User Name: ${param.txt_uuid}

</h2>