<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<style><%@include file="/WEB-INF/css/registration-form.css"%></style>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Case Study</title>
</head>
<body>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">

<div class="testbox">
  <h1>SIGN-UP</h1>
  <form action="<%=request.getContextPath()%>/register" method="post">
  <hr>
  <label id="icon" for="name"><i class="icon-user "></i></label>
  <input type="text" name="username" placeholder="Username" required/>
  <label id="icon" for="name"><i class="icon-shield"></i></label>
  <input type="password" name="password" placeholder="Password" required/>
  <label id="icon" for="name"><i class="icon-shield"></i></label>
  <input type="password" name="cpassword" placeholder="Confirm Password" required/>
    <label id="icon" for="name"><i class="icon-envelope"></i></label>
  <input type="text" name="email" placeholder="Email" required/>
  <div class="gender">
<input type="radio" value="Male" id="male" name="gender" checked/>
    <label for="male" class="radio" checked=true>Male</label>
    <input type="radio" value="Female" id="female" name="gender" />
    <label for="female" class="radio">Female</label>
   </div> 
   <input type="reset" name="Reset" value="Reset">
   <input type="submit" name="Register" value="Register">
  </form>
</div>

</body>
</html>