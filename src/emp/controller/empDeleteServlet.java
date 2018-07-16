package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;
import emp.service.empService;
import emp.service.empServiceImpl;

public class empDeleteServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		empService service = new empServiceImpl();
		
		String id = req.getParameter("id");
		int result = service.delete(id);
		System.out.println(id);
		
		res.sendRedirect("/serverweb/emp/list.do");
	}

}
