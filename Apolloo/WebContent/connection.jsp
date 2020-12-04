<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Apollo";
String user="root";
String password="Prasad@1122";
con=DriverManager.getConnection(url, user, password);
%>