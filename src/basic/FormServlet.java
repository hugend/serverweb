package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String [] language = req.getParameterValues("language");
		String save = req.getParameter("save");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li>");
		if(name.equals("")){
			out.println("이름 : <이름을 입력하세요><br/>");
		}else{
			out.println("이름 :"+name+"<br/>");
		}
		out.println("</li>");
		
		out.println("<li>");
		if(addr.equals("")){
			out.println("주소 : <주소를 입력하세요><br/>");
		}else{
			out.println("주소 :"+addr+"<br/>");
		}
		out.println("</li>");
		
		out.println("<li>");
		out.println("사용가능한 Language 선택" );
		out.println("</li>");
		if(language!=null){
			for (int i = 0; i < language.length; i++) {
				out.println("<li>");
				out.println(language[i]+"<br/>");
				out.println("</li>");
			}
			
		}else{
			out.println("<li>");
			out.println("사용가능한 language가 없습니다.");
			out.println("</li>");
		}
		
		out.println("<li>");
		if(save != null){
			out.println("입력 정보 저장유무 :"+save+"<br/>");
		}else{
			out.println("입력 정보 저장유무가 없습니다");
		}
		out.println("</li>");
		out.println("</body>");
		out.println("</html>");
		
	}
	

}
