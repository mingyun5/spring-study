<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Admission Form</title>
	<style>
		.error {
			color:red;
		}
	</style>
</head>
<body>
<h1>
	Student Reg. Page  
</h1>

<form:errors path="student.*" cssClass="error" >
<span id="student.errors" class="error" >Error was FOUND!!!</span>
</form:errors>
<form action='process' method="post">
	<table>
		<tr>
			<td>Name: </td>
			<td><input type='text' name='studentName' value='${student.studentName }'/>
		</tr>
		<tr>
			<td>Hobby: </td>
			<td><input type='text' name='studentHobby' />
		</tr>
		<tr>
			<td>DOB: </td>
			<td><input type='text' name='studentDOB' />
		</tr>
		<tr>
			<td>country: </td>
			<td><input type='text' name='address.country' />
		</tr>
		<tr>
			<td>city: </td>
			<td><input type='text' name='address.city' />
			<form:errors path="student.address.city" />
		</tr>
		<tr>
			<td>zipcode: </td>
			<td><input type='text' name='address.zipcode' value="${student.address.zipcode }"/>
			<form:errors  path="student.address.zipcode" 
						cssClass="error" element="div">
				<div id="zipcode.errors" class="error">
					zip code should be int
				</div>
			</form:errors>
		</tr>
		<tr>
			<td><input type='submit' /></td>
		</tr>
	</table>
</form>


</body>
</html>
