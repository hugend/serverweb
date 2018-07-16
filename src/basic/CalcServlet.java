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
		out.println("<p>계산결과("+method+"연산적용)</p>");
		out.println("<hr>");
		out.println("<p>num1의"+num1+"과 num2의 "+ num2+"을 <br/>");
		out.println("연산한 결과는 "+result+"입니다 </p>");
		
		
		out.println("<body>");
		out.println("</html>");
		
	}

}
