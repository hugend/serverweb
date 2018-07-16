<%@page import="emp.dto.empDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
	ArrayList<empDTO> emplist = (ArrayList<empDTO>)request.getAttribute("emplist");	
	int size = emplist.size();
	
	%>

	<jsp:include page="/emp/search.jsp">
		<jsp:param value="searchlist" name="c"/>
	</jsp:include>


	<h1>사원목록</h1>
	<hr/>
	<table border="1">
	<tr bgcolor="skyblue">
	<th>아이디</th><th>패스워드</th><th>이름</th><th>주소</th>
		<th>고용날짜</th><th>등급</th><th>포인트</th><th>부서번호</th><th>삭제</th>
	</tr>
	<%
	for(int i=0 ; i< size; i++){
		empDTO user = emplist.get(i);	
		%>
			<tr>
			<td><a href="/serverweb/emp/read.do?action=view&id=<%=user.getId()%>"><%=user.getId()%></a></td>
			<td><%=user.getPass()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAddr()%></td>
			<td><%=user.getHiredate()%></td>
			<td><%=user.getGrade()%></td>
			<td><%=user.getPoint()%></td>
			<td><%=user.getDeptno()%></td>
		<td><a href="/serverweb/emp/delete.do?info=test&id=<%=user.getId() %>">삭제</a></td>
			</tr>
	<% }%>
	</table>
</body>
</html>