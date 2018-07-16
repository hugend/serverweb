<%@page import="emp.dto.empDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<% 
	empDTO dto = (empDTO)request.getAttribute("dto");
%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
			action="" 
			method="get">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="deptcode">�μ��ڵ�</label>
						<div class="col-sm-3">
							<%=dto.getDeptno() %>
						</div>
					</div>
					
					<div class="form-group">
						<!-- �μ���-->
						<label class="control-label col-sm-2" for="name">����</label>
						<div class="col-sm-3">
							<!-- ������ �̰��� ����ϼ��� -->
							<%=dto.getName() %>
						</div>
					</div>
					
					<div class="form-group">
						<!-- ���̵�-->
						<label class="control-label col-sm-2" for="id">���̵�</label>
						<div class="col-sm-3">
							<!-- ���̵� �̰��� ����ϼ��� -->
							<%=dto.getId() %>
						</div>
					</div>
					<div class="form-group">
						<!-- �ּ�-->
						<label class="control-label col-sm-2" for="addr">�ּ�</label>
						<div class="col-sm-3">
							<!-- �ּҸ� �̰��� ����ϼ��� -->
							<%=dto.getAddr() %>
						</div>
					</div>

					<div class="form-group">
						<!-- �Ի糯¥-->
						<label class="control-label col-sm-2" for="hiredate">�Ի糯¥</label>
						<div class="col-sm-3">
							<!-- �Ի糯¥�� �̰��� ����ϼ��� -->
							<%=dto.getHiredate() %>
						</div>
					</div>
					<div class="form-group">
						<!-- ����Ʈ-->
						<label class="control-label col-sm-2" for="point">����Ʈ</label>
						<div class="col-sm-3">
							<!-- ����Ʈ�� �̰��� ����ϼ��� -->
							<%=dto.getPoint()%>
						</div>
					</div>
					<div class="form-group">
						<!-- ���-->
						<label class="control-label col-sm-2" for="grade">���</label>
						<div class="col-sm-3">
							<!-- ����� �̰��� ����ϼ��� -->
							<%=dto.getGrade()%>
						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="button" value="����" 
							onclick="location.href='/serverweb/emp/read.do?action=modify&id=<%=dto.getId()%>'"
							 class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>