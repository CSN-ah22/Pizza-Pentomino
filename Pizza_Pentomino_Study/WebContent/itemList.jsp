<%@page import="pentomino.model.ProductItem"%>
<%@page import="pentomino.model.UserInfo"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
import="javax.servlet.http.HttpServletRequest"
import="javax.servlet.http.HttpServletResponse"
import="javax.servlet.http.HttpSession"
import="pentomino.action.*"
import="java.util.List"
    pageEncoding="UTF-8"
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
<%

String value ="";
HttpSession ss = request.getSession();
UserInfo userInfoBean = new UserInfo();
if((ss.getAttribute("USER_INFO_SESSION_KEY"))!=null){
	userInfoBean = (UserInfo)ss.getAttribute("USER_INFO_SESSION_KEY");
	value = userInfoBean.getUserName();
}
if(value.equals("")==false){
	
%>
<div align="center">
<h2><%=value %>님, 원하는 피자를 선택해 주세요</h2>
<form action="itemListPage">
        <table class="menu">
        <tr>
            <th width="300px">상품</th>
            <th width="200px">가격</th>
        </tr>
        <%
        ItemListShowAction IA = new ItemListShowAction();
        List list = IA.ActionForward(request,response);
        for(int i=0 ; i<list.size(); i++) {
        	ProductItem ItemVO = (ProductItem)list.get(i);
        	
        	String itemId = ItemVO.getItemId();
			String itemName = ItemVO.getItemName();
			int price = ItemVO.getPrice();
        
        %>
        <tr>
            <td height="80px">
                <label><input type="checkbox" name="itemId" value="<%=itemId%>" ><%=itemName %></label>
            </td>
            <td class="price"><%=price %>원</td>
        </tr>
        <% } %>
     </table>

<input style="width: 508.727px; height: 34px" type="submit" value="선택된 상품을 장바구니에 넣는다"/>

     </form>
    <form action="cartShow.jsp"><input style="width: 508.727px; margin-top: 10px; margin-bottom: 10px;height: 34px" type="submit" value="바구니의 내용을 확인하고 주문한다" /></form>
    <form action="logout.jsp"><input type="submit" value="로그아웃" /></form>
</div>
<%}else{ %>
<jsp:forward page="login.jsp"></jsp:forward>
<%} %>
</body>
</html>