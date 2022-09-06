<%!

String cname="edureka limited";
public int add(int x,int y){
	return x+y;
}

%>
<h2>
<%
  out.println("My company mame:"+cname+"<br>");
  out.println("Sum="+ add(10,30));
%>
</h2>