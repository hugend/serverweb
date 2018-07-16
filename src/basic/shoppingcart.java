package basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cart.do")
public class shoppingcart extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*		int cnt = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		map.put("냉장고", 0);
		map.put("세탁기", 0);
		map.put("김치냉장고", 0);
		map.put("TV", 0);
		map.put("전자레인지", 0);
		String input = request.getParameter("item");
		HttpSession ses = request.getSession();
		ses.setAttribute("map", map);	
			
		cnt =map.get(input).intValue();
		cnt++;
		map.put(input, cnt);*/
		request.setCharacterEncoding("euc-kr");
		String productName = request.getParameter("item");
		HttpSession ses = request.getSession();
		Integer count = (Integer) ses.getAttribute(productName);
		// item에 해당하는 attribute가 없으면 null 리턴
		if(count==null){//최초선택
			ses.setAttribute(productName, 1);
		}else{//최초 작업이 아니므로 value에 1만 더해서 다시저장
			ses.setAttribute(productName, count+1);
		}
		
		
		
		ses.setAttribute("item", 1);	
		
		
		RequestDispatcher rd = 		
				request.getRequestDispatcher("/servletTest/cart.jsp");
		rd.forward(request, response);
/*		ArrayList<String> arr = new ArrayList<String>();
		arr.add(item);
		int cnt [] = {0,0,0,0,0}; 
		for(int i = 0; i<cnt.length; i++){
			
		}
		
		
		ses.setAttribute("cnt", cnt);	
		ses.setAttribute("arr", arr);	
		*/
		
		
		
		
		
		
	}

}
