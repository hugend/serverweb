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
				'"title": "json연습",'+
				'"date": "2018/01/01",'+
				'"content": "json어렵다",'+
				'"writer": "kim",'+
				'"category": ["it", "math"],'+
				'"reply": ['+
					'{'+
						'"댓글번호": "1",'+
						'"내용": "어렵다ㅜㅜ",'+
						'"날짜": "2018/5/1",'+
						'"작성자": "kim123"'+
					'},'+
					'{'+
						'"댓글번호": "2",'+
						'"내용": "하다보니 조금",'+
						'"날짜": "2018/5/10",'+
						'"작성자": "kim777"'+
					'}'+
					']'+
			'},'+
			'{'+
				'"no": "2",'+
				'"title": "json표현하기",'+
				'"date": "2018/02/03",'+
				'"content": "json해볼까",'+
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