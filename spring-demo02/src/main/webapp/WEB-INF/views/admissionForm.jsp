<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Student Reg. Page
</h1>

<%-- <form:errors path="student.*" /> --%>

<form action='process' method="post">
	<table>
		<tr>
			<td>Name: </td>
			<td><input type='text' name='studentName' />
		</tr>
		<tr>
			<td>Hobby: </td>
			<td><input type='text' name='studentHobby' />
		</tr>
		<tr>
			<td>DOB: </td>
			<td><input type='text' name='studentDOB' />
			<form:errors path="student.studentDOB" />
		</tr>
		<tr>
			<td>country: </td>
			<td><input type='text' name='address.country' />
		</tr>
		<tr>
			<td>city: </td>
			<td><input type='text' name='address.city' />
		</tr>
		<tr>
			<td>zipcode: </td>
			<td><input type='text' name='address.zipcode' />
		</tr>
		<tr>
			<td><input type='submit' /></td>
		</tr>
	</table>
</form>
</body>
</html>
