package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
		req.setAttribute("emplist", emplist);
		RequestDispatcher rd = req.getRequestDispatcher("/emp/list.jsp");
		rd.forward(req, res);

	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
				doGet(req, res);

		}
	
	


}
