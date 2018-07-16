package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String [] language = req.getParameterValues("language");
		String save = req.getParameter("save");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li>");
		if(name.equals("")){
			out.println("�̸� : <�̸��� �Է��ϼ���><br/>");
		}else{
			out.println("�̸� :"+name+"<br/>");
		}
		out.println("</li>");
		
		out.println("<li>");
		if(addr.equals("")){
			out.println("�ּ� : <�ּҸ� �Է��ϼ���><br/>");
		}else{
			out.println("�ּ� :"+addr+"<br/>");
		}
		out.println("</li>");
		
		out.println("<li>");
		out.println("��밡���� Language ����" );
		out.println("</li>");
		if(language!=null){
			for (int i = 0; i < language.length; i++) {
				out.println("<li>");
				out.println(language[i]+"<br/>");
				out.println("</li>");
			}
			
		}else{
			out.println("<li>");
			out.println("��밡���� language�� �����ϴ�.");
			out.println("</li>");
		}
		
		out.println("<li>");
		if(save != null){
			out.println("�Է� ���� �������� :"+save+"<br/>");
		}else{
			out.println("�Է� ���� ���������� �����ϴ�");
		}
		out.println("</li>");
		out.println("</body>");
		out.println("</html>");
		
	}
	

}
