<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function runAjax(){
		location.href="/serverweb/notajax?id="+myform.id.value;
		//alert("test");
	}

</script>
</head>
<body>
	<h1>ajax�׽�Ʈ�ϱ�</h1>
	<form action="" name="myform">
		<input type="text" name="id"/>
		<input type="button" onclick="runAjax()" value="ajax�׽�Ʈ">
	</form>
	<div id="result"><%=request.getAttribute("msg") %></div>
</body>
</html>