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
		out.println("<h1>������</h1>");
		out.println("<hr/>");
		out.println("<table border='1'>");
		out.println("<tr bgColor='skyblue'>");
		out.println("<th>���̵�</th><th>�н�����</th><th>�̸�</th><th>�ּ�</th>");
		out.println("<th>��볯¥</th><th>���</th><th>����Ʈ</th><th>�μ���ȣ</th><th>����</th>");
		
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
			out.println("<td><a href='/serverweb/emp/delete.do?info=test&id="+user.getId()+"'>����</a></td>");
			out.println("</tr>");
		}		
		out.println("</table>");	
		out.println("</body>");
		out.println("</html>");
	}

}
