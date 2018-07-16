package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.empDTO;

@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		System.out.println("include연습 - include서블릿 실행중");
		out.print("<h1>요청재지정연습 - include</h1>");
		
		//1. 데이터 공유 - db에서 가져온 결과나 비즈니스 로직 수행결과를 출력
		empDTO dto = new empDTO("jang", "", "장동건", "", "", 0, "");
		
		request.setAttribute("mydata", dto);
			// 요청범위안에서 "mydata"라는 이름으로 dto가 공유될 수 있도록 공유작업
		
		//2. 요청재지정 -  include
		RequestDispatcher rd = 
				request.getRequestDispatcher("/servletTest/result.jsp");
		rd.include(request, response);
		
		out.print("<h1>요청재지정 연습 include end</h1>");
	
	}

}
