<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file = "/html/menu.jsp" %>
		<br>
		<br>

	<h1 align = center>connection</h1>
	
		<div style = "text-align:center;">
		<form method = post>	
			<label>login :</label>
			<input type="text" name="txt-login" /><br /><br />
			<label>password : </label>
			<input type = "password" name="txt-pass"/><br /><br />
			<button type = "submit">se connecter</button>
		</form>
		</div>
		
</body>
</html>

