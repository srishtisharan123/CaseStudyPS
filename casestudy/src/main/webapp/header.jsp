<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/static/css/global.css" />
</head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 199px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
</style>
<body>
<ul>
  <li><a class="active" href="./">Home</a>
  <c:if test="${sessionScope.customer==null}"></li>
  <li><a href="./register">Register</a></li>
  <li><a href="./login">Login</a></li>
  </c:if>
  <c:if test="${sessionScope.customer!=null}">
			<li><a href="./logout">Logout</a></li>
		</c:if>
</ul>

</body>
</html>