<%@page import="pentomino.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
import="javax.servlet.http.HttpServletRequest"
import="javax.servlet.http.HttpServletResponse"
import="javax.servlet.http.HttpSession"
    pageEncoding="UTF-8"
    %>
<%
HttpSession ss = request.getSession();
UserInfo userInfoBean = new UserInfo();
userInfoBean = (UserInfo)ss.getAttribute("USER_INFO_SESSION_KEY");
String value = userInfoBean.getUserName();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel=stylesheet type="text/css" href="css/pentomino.css">
<title>피자 펜토미노 - 상품 목록</title>
</head>
<body>
<h1>피자 펜토미노 - 상품 목록</h1>
<div align="center">
<h2><%=value %>님, 원하는 피자를 선택해 주세요</h2>
</div>
</body>
</html>