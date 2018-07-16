package emp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;
import emp.service.empService;
import emp.service.empServiceImpl;

/**
 * Servlet implementation class empReadServlet
 */
@WebServlet(name = "search", urlPatterns = { "/emp/search.do" })
public class empSearchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		String column = request.getParameter("column");
		String search = request.getParameter("search");
		String pass = request.getParameter("pass");
		empService service = new empServiceImpl();
		ArrayList<empDTO> emplist = service.Search(column, search);
		System.out.println("¼­ºí¸´"+column+search);
		request.setAttribute("emplist", emplist);
		RequestDispatcher rd = request.getRequestDispatcher("/emp/list.jsp");
		rd.forward(request, response);
	
	}



}
