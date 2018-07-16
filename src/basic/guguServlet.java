package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class guguServlet extends HttpServlet{
// 서블릿명 gugu
// url 패턴 : /gugu
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,
	ServletException{
		
		for (int i = 1; i < 10; i++) {
			System.out.println("7"+"*"+i+"="+(i*7));
			
		}
		
	}
// 
}
