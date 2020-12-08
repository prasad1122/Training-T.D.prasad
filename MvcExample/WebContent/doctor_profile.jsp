<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<a href="View_Appointment.jsp">View Appointment</a>
<br><br><br>
<%@page import="com.mvc.LoginBean" %>
<%
LoginBean lb=(LoginBean)session.getAttribute("bean");
%>
<%=lb.getEmail() %>
</body>
</html>