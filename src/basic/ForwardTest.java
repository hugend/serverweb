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

@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class ForwardTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		System.out.println("forward연습 - forward서블릿 실행중");
		out.print("<h1>요청재지정연습 - forward</h1>");
		
		//1. 데이터 공유 - db에서 가져온 결과나 비즈니스 로직 수행결과를 출력
		empDTO dto = new empDTO("jang", "", "장동건", "", "", 0, "");
		
		request.setAttribute("mydata", dto);
			// 요청범위안에서 "mydata"라는 이름으로 dto가 공유될 수 있도록 공유작업
		
		//2. 요청재지정 -  RequestDispatcher
		//서블릿이 요청되고 response되지 않은 상태로 다시 jsp가 요청되는 것이므로현재
		//context안에서 작업이 이루어진다. 따라서 context빼고 경로를 지정한다.
		RequestDispatcher rd = 
				request.getRequestDispatcher("/servletTest/result.jsp");
		rd.forward(request, response);
		
		out.print("<h1>요청재지정 연습 forward end</h1>");
	
	}

}
