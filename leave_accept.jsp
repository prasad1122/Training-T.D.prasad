<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/office";
String user="root";
String password="Prasad@1122";
con=DriverManager.getConnection(url, user, password);
String askleave=request.getParameter("askleave");
String sql="insert into holiday(askleave) values(?)";
ps=con.prepareStatement(sql);
ps.setString(1,askleave);
int x=ps.executeUpdate();
if(x!=0)
{
	response.sendRedirect("./leave.html?msg=leaveaccepted");
}
%>