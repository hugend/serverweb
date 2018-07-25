package json;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DeptMakerTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		JSONObject myjson = new JSONObject();
		
		JSONArray deptlist = new JSONArray();
		JSONObject dept1 = new JSONObject();
		dept1.put("code", "001");
		dept1.put("name", "�����ý�����");
		dept1.put("loc", "4��");
		JSONObject dept2 = new JSONObject();
		dept2.put("code", "002");
		dept2.put("name", "�ý���������");
		dept2.put("loc", "5��");
		JSONObject dept3 = new JSONObject();
		dept3.put("code", "003");
		dept3.put("name", "�����������");
		dept3.put("loc", "6��");
		JSONObject dept4 = new JSONObject();
		dept4.put("code", "004");
		dept4.put("name", "�����");
		dept4.put("loc", "7��");
		
		deptlist.add(dept1);
		deptlist.add(dept2);
		deptlist.add(dept3);
		deptlist.add(dept4);
		
		myjson.put("deptlist", deptlist);
		System.out.println(myjson.toJSONString());
		FileWriter fw = new FileWriter("src/json/dept.json");
		fw.write(myjson.toJSONString());
		fw.flush();
		fw.close();
		
		
		
	
	}

}
