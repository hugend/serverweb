package emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;
import emp.service.empService;
import emp.service.empServiceImpl;

@WebServlet(name = "read", urlPatterns = { "/emp/read.do" })
public class empReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		
		
		String id = request.getParameter("id");
		empService service = new empServiceImpl();
		empDTO dto = service.read(id);
		request.setAttribute("dto", dto);
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equals("view")){
			RequestDispatcher rd = request.getRequestDispatcher("/emp/emp_read.jsp");
			rd.forward(request, response);
			
		}else if(action.equals("modify")){
			RequestDispatcher rd = request.getRequestDispatcher("/emp/emp_update.jsp");
			rd.forward(request, response);
			
		}
		
		
	
	}



}
