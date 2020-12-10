<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Profile Page</h1>
		<a href="./employee_home.html">Home</a> | <a
			href="./employee_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
			<a href="update_employee_profile.jsp">update</a>
	</center>
	<br>
	<br>
	<%@page import="com.office.Employeeregisterbean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			
			<td>Email</td>

		</tr>
	<%
	Employeeregisterbean er=(Employeeregisterbean)session.getAttribute("employeedetails");
	%>
	<tr>
	<td><%=er.getEmail()%></td>
	
	<a href="update_employee_profile.jsp?id=<%=er.getEid()%>"><center>Update Profile</center></a>
</tr>
	
	</table>
</body>
</html>