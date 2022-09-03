<jsp:useBean id="prod" class="co.edureka.khalid.web.Product"> </jsp:useBean> 
<jsp:setProperty name="prod" property="*"/>

<h2>
ProductID: <jsp:getProperty name="prod" property="productId"/><br>
ProductName: <jsp:getProperty name="prod" property="productName"/><br>
ProductID: <jsp:getProperty name="prod" property="productPrice"/><br>

</h2>