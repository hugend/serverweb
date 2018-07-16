package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.pisces.PiscesRenderer;

//서블릿명:post 
//요청url:/post.do


public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		//요청정보추출
		String userid = req.getParameter("userId");
		String username = req.getParameter("userName");
		String password = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String [] item = req.getParameterValues("item");
		//출력
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Customer</h1>");
		out.println("<p>아이디:"+userid+"<p>");
		out.println("<p>성명:"+username+"<p>");
		out.println("<p>패스워드:"+password+"<p>");
		out.println("<p>성별:"+gender+"<p>");
		out.println("<p>직업:"+job+"<p>");
		out.println("<p>관심분야: ");
		for (int i = 0; i < item.length; i++) {
			out.println(item[i]);
		}
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
