<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Residence Hall B</title>
</head>
<body>
<% if(session.getAttribute("passkey")==null)
	response.sendRedirect("login.html");	
%>
	Welcome to res hall b's website!
</body>
</html>