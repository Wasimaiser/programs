<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<style>
body {
	background-color: linen;
	font-family: Arial, sans-serif;
	margin: 20px;
}

h1, h2 {
	color: maroon;
}

p {
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<h1>Course Registration Details</h1>
	<% out.print("<h1> Your Details </h1>"); %>
	<%  
String CId=request.getParameter("CId");  
String CName=request.getParameter("CName");  
String Cdetails=request.getParameter("Cdetails");  
String JDate=request.getParameter("JDate");  
String budget=request.getParameter("budget");  
String[] selectedCourses = request.getParameterValues("selectedt");
%>

	<p>
		<strong>Course Id:</strong>
		<%= CId %></p>
	<p>
		<strong>Course Name:</strong>
		<%= CName %></p>
	<p>
		<strong>Course Details:</strong>
		<%= Cdetails %></p>
	<p>
		<strong>Joining Date Of The Course:</strong>
		<%= JDate %></p>
	<p>
		<strong>Budget:</strong>
		<%= budget %></p>
	<% if (selectedCourses != null && selectedCourses.length > 0) { %>
	<p>
	<br>
		<strong>Selected Courses:</strong>
		<% for (String course : selectedCourses) { %>
		<br>
		
		<%= course %>
		<% } %>
	</p>
	<% } %>
	
		
</body>
</html>