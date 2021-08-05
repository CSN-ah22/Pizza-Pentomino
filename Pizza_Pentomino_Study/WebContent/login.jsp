<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel=stylesheet type="text/css" href="css/pentomino.css">
    <title>피자 펜토미노 - 로그인</title>
</head>
<body>
    <h1>피자 펜토미노입니다!</h1>
    
    <form action="loginPage.jsp" Class="login">
    <table class="login" align="center">
	    <tr>
	        <td>아이디</td>
	        <td><input name="user" type="text" size="16" value=""/></td>
	    </tr>
	    <tr>
	        <td>패스워드</td>
	        <td><input name="password" type="password" size="16" value=""/></td>
	    </tr>
	    </table>
	    <input type="submit" value="로그인" />
    </form>


</body>
</html>