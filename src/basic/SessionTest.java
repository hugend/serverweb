package basic;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		HttpSession ses = request.getSession();
		
		// 세션에 데이터 공유
		ses.setAttribute("mydata", id);
//		request.setAttribute("mydata", id);
		
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/servletTest/ses_first.jsp");
		rd.forward(request, response);
	}


}
