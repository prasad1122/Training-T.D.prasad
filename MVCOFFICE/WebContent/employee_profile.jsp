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
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Address</td>
			<td>Designation</td>
			<td>Experience</td>
			<td>No of Leaves Taken</td>
		</tr>
	<%
	Employeeregisterbean er=(Employeeregisterbean)session.getAttribute("employeedetails");
	%>
	<tr>
	<td><%=er.getEid()%></td>
		<td><%=er.getEname()%></td>
		<td><%=er.getEmail()%></td>
		<td><%=er.getPhone()%></td>
		<td><%=er.getGender()%></td>
		<td><%=er.getAddress()%></td>
		<td><%=er.getDesignation()%></td>
		<td><%=er.getExperience()%></td>
		<td><%=er.getNo_of_leaves_taken() %></td>
	<a href="update_employee_profile.jsp?id=<%=er.getEid()%>"><center>Update Profile</center></a>
</tr>
	
	</table>
</body>
</html>