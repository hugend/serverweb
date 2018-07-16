<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	
		#myimg{
			border: solid 3px blue;
		
		}
	</style>
	<script type="text/javascript">
	
	
			function test(){
				alert("환영");
				
				
			}
	</script>

</head>
<body>

	<h1><%= "hello3" %></h1>
	<hr/>
	<img src="../images/jang.jpg" id="myimg"/>
	<!-- html 주석문 -->
	<%-- jsp 주석문 --%>
</body>
</html>