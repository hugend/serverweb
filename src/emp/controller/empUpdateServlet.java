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

@WebServlet(name = "update", urlPatterns = { "/emp/update.do" })
public class empUpdateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		String id = request.getParameter("id");
		String addr = request.getParameter("addr");
		String grade = request.getParameter("grade");
		int point = Integer.parseInt(request.getParameter("point"));
		empDTO dto = new empDTO(id, addr, grade, point);
	
		empService service = new empServiceImpl();
		int result = service.update(dto);
		  
		if(result>0){
			response.sendRedirect("/emp/list.do");
//			RequestDispatcher rd = request.getRequestDispatcher("/emp/list.jsp");
//			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("/emp/read.do");
			rd.forward(request, response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	
	}
}
