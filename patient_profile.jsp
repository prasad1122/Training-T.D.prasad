<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO Patient Home Page</h1></center>
<br><br><br>
<center>
<a href="patient_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="400" height="400" cellpadding="20">
<tr><td>Name</td><td>password</td><td>email</td><td>phone</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Apollo";
String user="root";
String password="Prasad@1122";
con=DriverManager.getConnection(url, user, password);
String email=(String)session.getAttribute("semail");
ps=con.prepareStatement("select * from patient where email=?");
ps.setString(1,email);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getInt("phone") %></td>
</tr>
<%} %>
</table>
</center>
</body>
</html>