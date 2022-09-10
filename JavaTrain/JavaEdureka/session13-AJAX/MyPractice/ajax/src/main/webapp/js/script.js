var xhr;
function getEmployeeDetails(empno){
	
	//alert(empno)
	
	xhr=new XMLHttpRequest();
	xhr.open("GET","searchemp?eno="+empno,true);// true -asychronous communication
	
	xhr.onreadystatechange=stateChanged;
	xhr.send();	
	
}
function stateChanged(){
	 var name="NO MATCH";
	 var sal="NO MATCH";
	  
	if(xhr.readyState==4 && xhr.status==200){
	var response = xhr.responseText;
		//alert(response);
		if(response.length > 0){
			var obj = JSON.parse(response);
			
			name = obj.name;
			sal = obj.sal;
		}
		
		document.getElementById("emp-name").innerText = name;
		document.getElementById("emp-sal").innerText = sal;
		
	}
	
}