<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">

var boardlist = '{"board": [{'+
				'"no": "1",'+
				'"title": "json����",'+
				'"date": "2018/01/01",'+
				'"content": "json��ƴ�",'+
				'"writer": "kim",'+
				'"category": ["it", "math"],'+
				'"reply": ['+
					'{'+
						'"��۹�ȣ": "1",'+
						'"����": "��ƴ٤̤�",'+
						'"��¥": "2018/5/1",'+
						'"�ۼ���": "kim123"'+
					'},'+
					'{'+
						'"��۹�ȣ": "2",'+
						'"����": "�ϴٺ��� ����",'+
						'"��¥": "2018/5/10",'+
						'"�ۼ���": "kim777"'+
					'}'+
					']'+
			'},'+
			'{'+
				'"no": "2",'+
				'"title": "jsonǥ���ϱ�",'+
				'"date": "2018/02/03",'+
				'"content": "json�غ���",'+
				'"writer": "lee",'+
				'"category": ["it", "math", "eng"]'+
			'}'+
		']'+
	'}'
	
		var data = JSON.parse(boardlist);
		mydata1 = data.board[0].no+","+data.board[0].title+","+data.board[0].date+","+data.board[0].content+","+data.board[0].writer;
		mydata2 = data.board[1].no+","+data.board[1].title+","+data.board[1].date+","+data.board[1].content+","+data.board[1].writer;
		alert(mydata1);
		alert(mydata2)
	</script>
</body>

</html>