<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile Page</h1>
		<a href="./manager_home.html">Home</a> | <a
			href="./manager_profile.jsp">Profile</a> |
			 <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.office.Managerloginbean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			
			<td>Email</td>

		</tr>
	<%
		Managerloginbean  mb=(Managerloginbean)session.getAttribute("bean1");
	%>
	<tr>
	<td><%=mb.getEmail()%></td>
</tr>
	
	</table>
</body>
</html>