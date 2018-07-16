<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% request.setCharacterEncoding("EUC-KR"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String [] item = request.getParameterValues("item");
	
	%>
	
	<h1>user ID : <%=userId %></h1>
	<h1>userName : <%=userName %></h1>
	<h1>passwd : <%=passwd %></h1>
	<h1>gender : <%=gender %></h1>
	<h1>job : <%=job %></h1>
	<h1>item : </h1>
	<% for (int i=0; i<item.length; i++){
		%>
		 <%=item[i] %>  
	<%} %>

</body>
</html>