<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style>
.error
{
  color:red
}

body
{
	font-size:20px;
}	
</style>
</head>
<body>

<h2>Customer form</h2>

<form:form action="processform" modelAttribute="customer">

First Name: <form:input  path="firstName" />
<form:errors path="firstName" cssClass="error" />
<!-- display error if set that time cssClass is used -->
<br><br>
Last Name: <form:input  path="lastName" />
<br><br>
Customer ID: <form:input path="id" />
<form:errors path="id" cssClass="error" />
<br><br>
Postal code: <form:input path="postalcode" />
<form:errors path="postalcode" cssClass="error" />
<br><br>
Product code: <form:input path="productCode" />
<form:errors path="productCode" cssClass="error" />
<br><br>
<input type="submit" value="Submit" />

</form:form>

</body>
</html>