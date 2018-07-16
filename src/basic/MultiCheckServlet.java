package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiCheckServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String [] sw = req.getParameterValues("sw");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Customer</h1>");
		out.println("<p>�̸�:"+name+"<p>");
		out.println("<p>�ּ�:"+addr+"<p>");
		out.println("<p>������� ����Ʈ����: ");
		out.println("<br/>");
		for (int i = 0; i < sw.length; i++) {
			out.println(sw[i]);
			out.println("<br/>");
		}
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
