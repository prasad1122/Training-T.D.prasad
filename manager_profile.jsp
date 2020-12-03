<!DOCTYPE html>
<html>
<body bgcolor="#DC143C">
<br><br><br>
<br><br><br>
<center>
<a href="manager_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<center><h1>WELCOME TO MANAGER profile Page</h1></center>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="400" height="400" cellpadding="20">
<tr><td>ID</td><td>Name</td><td>Email</td><td>salary</td><td>address</td><td>age</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/office";
String user="root";
String password="Prasad@1122";
con=DriverManager.getConnection(url, user, password);
String id=(String)session.getAttribute("sid");
ps=con.prepareStatement("select * from manager where id=?");
ps.setString(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getInt("salary") %></td>
<td><%=rs.getString("address") %></td>
<td><%=rs.getInt("age") %></td>
</tr>
<%} %>
</table>
</center>
</body>
</html>