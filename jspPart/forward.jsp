<%@ page language="java" contentType = "text/html; charset=utf-8" pageEncoding= "UTF-8" %>
<%@ page import="example.*" %> 
<html>
    
<head>
    <meta http-equiv="Content-Type" content="text/html";>
</head>
<title>
    Insert title here
</title>
<body>
<%
    int number = (Integer)request.getAttribute("dice");
%>
    주사위 수 : <%= number %>
</body>
    
</html>