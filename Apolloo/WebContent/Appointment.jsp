<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="wheat">
<h1>Welcome to Appointment page</h1>
<br>
<br>
<a href="Patient_Home.html">Home</a>
<a href="Patient_Profile.jsp">Profile</a>
<a href="Appointment.jsp">Appointment</a>
<a href="index.html">Logout</a>
<br>
<br>
<form action="Apply_Appointment.jsp" method="post">
<input type="text" name="name">
<input type="number" name="phone">
<input type="text" name="email">
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
<select name="blood_group">
<option>A+</option>
<option>B+</option>
<option>O+</option>
<option>AB+</option>
<option>AB-</option>
<option>O-</option>
<option>B-</option>
</select>
<select name="specialist">
<option value="dentist">Dentist</option>
<option value="ENT">ENT</option>
<option value="cardiologist">Cardiologist</option>
</select>
<input type="date" name="date_of_appointment">
<input type="time" name="time_of_appointment">
<input type="submit" value="Apply"></td>
</form>
</body>
</html>