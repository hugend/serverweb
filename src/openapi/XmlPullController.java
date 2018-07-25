package openapi;

import java.util.ArrayList;

public class XmlPullController {

	public static void main(String[] args) {
		
		DeptLogic logic = new DeptLogic();
		ArrayList<XMLDeptDTO> dtolist = logic.getDeptListPull();

		for (int i = 0; i < dtolist.size(); i++) {
			System.out.println(dtolist.get(i));
			
		}
	}

}
