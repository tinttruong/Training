<%@ page import="com.hcl.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
    User u = (User) request.getAttribute("test");
    out.println("Welcome " + u.getusername());
    %>

</body>
</html>