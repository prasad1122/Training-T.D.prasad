<!DOCTYPE html>
<html>

<body bgcolor="grey">
<br><br><br>
<center><h1>WELCOME TO patient HOME</h1></center>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<a href="View_Appointment.jsp">View Appointment</a>
<br><br><br>
<%@page import="com.mvc.LoginBean2" %>
<%
LoginBean2 plb=(LoginBean2)session.getAttribute("bean1");
%>
<%=plb.getEmail() %>
</body>
</html>