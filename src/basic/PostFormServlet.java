package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.pisces.PiscesRenderer;

//������:post 
//��ûurl:/post.do


public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		//��û��������
		String userid = req.getParameter("userId");
		String username = req.getParameter("userName");
		String password = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String [] item = req.getParameterValues("item");
		//���
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Customer</h1>");
		out.println("<p>���̵�:"+userid+"<p>");
		out.println("<p>����:"+username+"<p>");
		out.println("<p>�н�����:"+password+"<p>");
		out.println("<p>����:"+gender+"<p>");
		out.println("<p>����:"+job+"<p>");
		out.println("<p>���ɺо�: ");
		for (int i = 0; i < item.length; i++) {
			out.println(item[i]);
		}
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
