<%!

String cname="edureka limited";
public int add(int x,int y){
	return x+y;
}

%>
<h2>
     My Company name=<%=cname%>
     <br>
     <%="Sum= " + add(12,34)%>
</h2>