<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="m" class="pentomino.form.LoginForm" scope="page"/>
<jsp:setProperty name="m" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginPage</title>
</head>
<body>
<table align="center" width="100%">
<tr align="center" bgcolor="#99ccff">
<td width="7%">아이디</td>
<td width="7%">비밀번호</td>
</tr>
<tr align="center">
<td>
<jsp:getProperty name="m" property="user" />
</td>
<td>
<jsp:getProperty name="m" property="password" />
</td>
</tr>

<tr height="1" bgcolor="#99ccff">
<td colspan="5"></td>
</tr>
</table>
</body>
</html>