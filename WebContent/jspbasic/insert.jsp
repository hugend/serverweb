<%@page import="emp.service.empServiceImpl"%>
<%@page import="emp.service.empService"%>
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

<%
	request.setCharacterEncoding("euc-kr");
	response.setContentType("text/html; charset=euc-kr");
	
	
	String deptno = request.getParameter("deptno");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	int point = Integer.parseInt(request.getParameter("point"));
	String grade = request.getParameter("grade");
	
	empDTO dto = new empDTO(id, pass, name, addr, grade, point, deptno);
	empService service = new empServiceImpl();
	int result = service.insert(dto);
%>
<%if(result>0){	%>
	<h1><%=result%>행 삽입</h1>
<% }else{%>
		<h1>삽입실패</h1>
<% }%>



</body>
</html>