<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<% // session에 저장된 데이터를 꺼내서 출력 - jsp는 기본으로 세션객체를 제공한다. - 내장객체
	String mydata = (String)session.getAttribute("mydata");
	%>
	<h2>꺼낸데이터는 : <%=mydata %></h2>
	<hr/>
	<h3><a href="/serverweb/servletTest/ses_second.jsp">데이터가 공유될까요?</a></h3>
</body>
</html>