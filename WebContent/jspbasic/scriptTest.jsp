<%@page import="emp.dto.empDTO"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>4. ���� - jsp�������� �������, ����޼ҵ带 �����ϱ� ���ؼ� ���(���� ������� �ʴ´�.)</h3>
	<% int num= 1000; %>
	<%! int num = 100; %>
	<%! public void test(){
		System.out.print("test");		
	}
		%>
	<h3>3. ǥ���� - jsp�� �������� ��ȯ�ɶ� out.print() ���ο� �����Ǵ� �ڵ�</h3>
	<h4>==> ǥ�������� �����ϴ� �����ʹ� out.print()�� �Ű������� ���޵ȴ�.
			���� ǥ�������� �����Ҷ��� ; �� �߰����� �ʴ´�. ;�� �߰��ϴ� ���� print(��;)�� 
			������ ����� �ȴ�. 
			ǥ������ �ڹٿ��� ����Ǵ� ���� �� �������� ����� �������� ����ϴ� jsp ��ũ��Ʈ ����̸�
			��밡���� Ÿ���� �������̴�. Ÿ���� �������� ������ �������� ��ȯ�ɶ�
			print�޼ҵ��� �Ű������� ���޵ǹǷ�...�⺻��, ��Ʈ������ ��ȯ�� �� �ִ� ������ ��,
			 �޼ҵ��� ȣ���� ����� ���� ����� �� �ִ�.
			</h4>
			<% String mydata = "java programming";	%>
			<h3> ǥ�������� �ۼ��ϴ� ���ڿ��� ����:<%= mydata.length()%></h3>
			<h5><%=10 %></h5>
			<h5><%=10.5 %></h5>
			<h5><%="java" %></h5>
			<h5><%=10/4 %></h5>
			<h5><%=mydata %></h5>
			<h5><%= new Date().toString() %></h5>
			<h5><%=mydata.charAt(1) %></h5>
			
			
	<h3>2. ��ũ��Ʈ �� - �ڹ��ڵ带 �� �� �ִ� ��ũ��Ʈ���</h3>
	<%
	//�ڹٸ�ɹ��� ������ �� �ִ� �� ; �� ������ ���� �߰��ؾ��Ѵ�.
	// �⺻���� �ν��ϴ� ��Ű���� java.lang��Ű���ۿ� ����. �ٸ� ��Ű���� ����ϴ� ���
	// import �ؾ��Ѵ�. jsp���� �ڵ����� ��������� ���������� ����� �� �ִ�.
	
	String str = new String("�ڹ�");
	out.println("<h3>���ڿ��� ����"+str.length()+"</h3>");
	Random rand = null;
	ArrayList list = null;
	StringTokenizer st = null;
	empDTO user = null;
%>
	<h3>1. �ּ���</h3>
	<!-- html �ּ��� -->
	<%-- jsp �ּ��� --%>
	<% // �ڹ� �ּ���  %> 

</body>
</html>






