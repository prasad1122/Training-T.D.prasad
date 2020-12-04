<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Apollo";
String user="root";
String password="Prasad@1122";
con=DriverManager.getConnection(url, user, password);
String name = request.getParameter("name");
Long phone = Long.parseLong(request.getParameter("phone"));
String email = request.getParameter("email");
String gender = request.getParameter("gender");
String blood_group = request.getParameter("blood_group");
String specialist = request.getParameter("specialist");
String date_of_appointment = request.getParameter("date_of_appointment");
String time_of_appointment = request.getParameter("time_of_appointment");
System.out.println(time_of_appointment);
String sql = "insert into appointment (name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment) values (?,?,?,?,?,?,?,?)";
ps=con.prepareStatement(sql);
ps.setString(1, name);
ps.setLong(2, phone);
ps.setString(3, email);
ps.setString(4, gender);
ps.setString(5, blood_group);
ps.setString(6, specialist);
ps.setString(7, date_of_appointment);
ps.setString(8, time_of_appointment);
int x=ps.executeUpdate();
if(x!=0)
response.sendRedirect("./View_Appointment.jsp?msg=appointment_applied");
%>