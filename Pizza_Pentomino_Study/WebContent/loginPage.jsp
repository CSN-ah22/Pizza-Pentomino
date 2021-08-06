<%@page import="pentomino.action.LoginPageAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>

<% LoginPageAction lpa = new LoginPageAction();
String result = lpa.ActionForward(request, response);
if(result.equals("success")){
%>
<jsp:forward page="itemList.jsp"></jsp:forward>
<%}else{ %>
<jsp:forward page="loginFailed.jsp"></jsp:forward>
<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginPage</title>
</head>
<body>
</body>
</html>