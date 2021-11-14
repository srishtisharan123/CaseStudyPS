<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <style><%@include file="/WEB-INF/css/login-form.css"%></style>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Case Study</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<table style="with: 80%">
			<link
				href='http://fonts.googleapis.com/css?family=Montserrat:400,700'
				rel='stylesheet' type='text/css'>
			<div class="logo"></div>
			<div class="login-block">
				<h1>Login</h1>
				<input type="text" placeholder="Username" name="username" /> <input
					type="password" placeholder="Password" name="password" />
				<button>Submit</button>
			</div>
</body>
</html>
