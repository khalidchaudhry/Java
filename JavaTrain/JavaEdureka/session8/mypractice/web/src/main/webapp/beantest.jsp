<jsp:useBean id="prod" class="co.edureka.khalid.web.Product"> </jsp:useBean> 
<h2>
ProductID: <jsp:getProperty name="prod" property="productId"/><br>
ProductName: <jsp:getProperty name="prod" property="productName"/><br>
ProductID: <jsp:getProperty name="prod" property="productPrice"/><br>
<hr>
<jsp:setProperty name="prod" property="productName" value="Mobile Phone" />  
ProductName: <jsp:getProperty name="prod" property="productName"/><br>

</h2>