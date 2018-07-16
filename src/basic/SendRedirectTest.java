package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		System.out.println("sendRedirect���� - Redirect���� ������");
		out.print("<h1>��û���������� - sendRedirect</h1>");
		
		//1. ������ ���� - db���� ������ ����� ����Ͻ� ���� �������� ���
		empDTO dto = new empDTO("jang", "", "�嵿��", "", "", 0, "");
		
		request.setAttribute("mydata", dto);
			// ��û�����ȿ��� "mydata"��� �̸����� dto�� ������ �� �ֵ��� �����۾�
		
		//2. ��û������ -  sendRedirect
		response.sendRedirect("/serverweb/servletTest/result.jsp");
	
	}

}
