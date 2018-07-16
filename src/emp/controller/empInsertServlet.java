package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;
import emp.service.empService;
import emp.service.empServiceImpl;

public class empInsertServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		String deptno = req.getParameter("deptno");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		int point = Integer.parseInt(req.getParameter("point"));
		String grade = req.getParameter("grade");
		
		empDTO dto = new empDTO(id, pass, name, addr, grade, point, deptno);
		empService service = new empServiceImpl();
		int result = service.insert(dto);
		String msg = "";
		
		if(result>0){
			msg = result+"개행 삽입성공";
		}else{
			msg = "삽입실패";
		}
		
		req.setAttribute("msg", msg);
		//res.sendRedirect("/serverweb/basic/insertResult.html");		
		RequestDispatcher rd = 
				req.getRequestDispatcher("/emp/insertResult.jsp");
		rd.forward(req, res);
		

	}

}
