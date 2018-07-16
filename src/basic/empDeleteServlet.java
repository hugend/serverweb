package basic;

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
		
		out.println("<html>");
		out.println("<body>");
		if(result>0){
			out.println("<h1>"+result+" 행 삭제성공</h1>");
			
		}else{
			out.println("<h1>삭제실패</h1>");
			
		}
		out.println("</body>");
		out.println("</html>");
	}

}
