<%@page import="java.util.ArrayList"%>
<%@page import="emp.dto.empDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>	
	<jsp:include page="/jspbasic2/search.jsp"/>
	<h2>회원목록</h2>
	<hr>
	<%empDTO emp = new empDTO(); %>
	<% ArrayList<empDTO> emplist=(ArrayList<empDTO>)request.getAttribute("mydata"); 
		empDTO loginUser=(empDTO)request.getAttribute("loginUser");
	%>
	<%if(loginUser==null){
		response.sendRedirect("/serverweb/emp/login.jsp");	
	}else{%>
	<h3><%=loginUser.getId() %>님 환영합니다.</h3>
	<table border="1">
	<tr bgcolor="skyblue">
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>주소</th>
		<th>입사일</th>
		<th>등급</th>
		<th>포인트</th>
		<th>부서번호</th>
		<th>삭제</th>
	</tr>
	<% for(int i=0;i<emplist.size();i++){%>
	<% emp=emplist.get(i);%>
	<tr>
	<th><a href="/serverweb/read.do?id=<%=emp.getId() %>&action=read"><%=emp.getId() %></a></th>
	<th><%=emp.getPass() %></th>
	<th><%=emp.getName() %></th>
	<th><%=emp.getAddr() %></th>
	<th><%=emp.getHiredate() %></th>
	<th><%=emp.getGrade() %></th>
	<th><%=emp.getPoint() %></th>
	<th><%=emp.getDeptno() %></th>
	<th><a href="/serverweb/delete.do?id=<%=emp.getDeptno()%>">삭제</a></th>
	</tr>
	<% }%>
	</table>
	<%}%>
</body>
</html>