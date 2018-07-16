package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;
import emp.service.empService;
import emp.service.empServiceImpl;

public class empListServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		empService service = new empServiceImpl();
		ArrayList<empDTO> emplist = service.getMemberList();
		int size = emplist.size();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>사원목록</h1>");
		out.println("<hr/>");
		out.println("<table border='1'>");
		out.println("<tr bgColor='skyblue'>");
		out.println("<th>아이디</th><th>패스워드</th><th>이름</th><th>주소</th>");
		out.println("<th>고용날짜</th><th>등급</th><th>포인트</th><th>부서번호</th><th>삭제</th>");
		
		out.println("</tr>");
		for (int i = 0; i < size; i++) {
			empDTO user = emplist.get(i);
			out.println("<tr>");
			out.println("<td>"+user.getId()+"</td>");
			out.println("<td>"+user.getPass()+"</td>");
			out.println("<td>"+user.getName()+"</td>");
			out.println("<td>"+user.getAddr()+"</td>");
			out.println("<td>"+user.getHiredate()+"</td>");
			out.println("<td>"+user.getGrade()+"</td>");
			out.println("<td>"+user.getPoint()+"</td>");
			out.println("<td>"+user.getDeptno()+"</td>");
			out.println("<td><a href='/serverweb/emp/delete.do?info=test&id="+user.getId()+"'>삭제</a></td>");
			out.println("</tr>");
		}		
		out.println("</table>");	
		out.println("</body>");
		out.println("</html>");
	}

}
