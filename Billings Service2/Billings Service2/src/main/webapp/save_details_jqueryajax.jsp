<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Details</title>
<link rel="stylesheet" href="Views/bootstrap.min.css"> 
<script src="Components/jquery-3.4.1.min.js"></script> 
<script src="Components/user.js"></script> 
</head>
<body>
<div class="container"> 
	<div class="row">  
		<div class="col-6"> 
			<h1>BillDETAILS</h1>
				<form id="formUser" name="formUser" method="post" action="User.jsp">  
					ID:  
 	 				<input id="Acc NO" name="accNo" type="text"  class="form-control form-control-sm">
					<br> User Name:   
  					<input id="CustomerName" name="cusName" type="text" class="form-control form-control-sm">  
  					<br> Password:   
  					<input id="Bill Amount" name="billAmount" type="text"  class="form-control form-control-sm"> 				
					<br> Name:   
  					<input id="Date" name="date" type="text" class="form-control form-control-sm">   
  					<br> EmailID:   
  					<input id="Email" name="email" type="text"  class="form-control form-control-sm">
  					
					
					<br> 
					<input id="btnSave" name="btnSave" type="button" value="SAVE" class="btn btn-primary">  
					<input type="hidden" id="hidAccNoSave" name="hidAccNoSave" value=""> 
				</form>
				
				<div id="alertSuccess" class="alert alert-success"> </div>
				
			   <div id="alertError" class="alert alert-danger"></div>
				
			   <br>
				<div id="divPaymentGrid">
					<%
					Bill billObj = new Bill();
						out.print(billObj.readBill());
					%>
				</div>
				
				 
			</div>
		</div>
</div>
 
</body>
</html>