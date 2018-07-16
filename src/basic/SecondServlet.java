package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
//1부터 10까지출력
	// 서블릿명 second 
	// url : /second/kitri.html
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
			
		for(int i= 1; i<=10; i++){
			System.out.println(i);
		}
	}
}
