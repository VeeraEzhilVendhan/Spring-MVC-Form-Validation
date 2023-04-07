<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
	<style>
	body
	{
		font-size:20px;
	}
	
	</style>	
</head>

<body>

This Customer is confirmed: 
<br><br>
Customer Firstname - ${customer.firstName} 
<br><br>
Customer Lastname - ${customer.lastName}
<br><br>
Customer Id -${customer.id}
<br><br>
Postal Code -${customer.postalcode}
<br><br>
Product Code -${customer.productCode}
</body>

</html>










