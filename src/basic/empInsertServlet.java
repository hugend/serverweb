package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

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
		
		out.println("<html>");
		out.println("<body>");
		if(result>0){
			out.println("<h1>삽입성공</h1>");
			out.println("<h1>"+result+"개 행 삽입성공</h1>");
		}else{
			out.println("<h1>삽입실패</h1>");
		}
		
		out.println("<h3 href='/serverweb/emp/list.do'>회원목록보기</h3>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
