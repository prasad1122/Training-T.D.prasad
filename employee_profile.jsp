<!DOCTYPE html>
<html>
<body bgcolor="#F08080">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE profile Page</h1></center>
<br><br><br>
<center>
<a href="employee_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="400" height="400" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>salary</td><td>address</td><td>jobtitle</td><td>Email</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/office";
String user="root";
String password="Prasad@1122";
con=DriverManager.getConnection(url, user, password);
String id=(String)session.getAttribute("sid");
ps=con.prepareStatement("select * from employee where id=?");
ps.setString(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getInt("salary") %></td>
<td><%=rs.getString("address") %></td>
<td><%=rs.getString("jobtitle") %></td>
<td><%=rs.getString("email") %></td>
</tr>
<%} %>
</table>
</center>
</body>
</html>