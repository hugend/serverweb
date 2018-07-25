package openapi;

import java.util.ArrayList;

public class DeptController {

	public static void main(String[] args) {
		
		
			DeptLogic logic = new DeptLogic();
			ArrayList<XMLDeptDTO> list = logic.getDeptList();
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
				
			}
	}

}
