package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		String num1 = req.getParameter("num1");
		String method = req.getParameter("method");
		String num2 = req.getParameter("num2");
		
		
		
		Calc calc = new Calc();
		int result = calc.calc(Integer.parseInt(num1),
				Integer.parseInt(num2), method);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>�����("+method+"��������)</p>");
		out.println("<hr>");
		out.println("<p>num1��"+num1+"�� num2�� "+ num2+"�� <br/>");
		out.println("������ ����� "+result+"�Դϴ� </p>");
		
		
		out.println("<body>");
		out.println("</html>");
		
	}

}
