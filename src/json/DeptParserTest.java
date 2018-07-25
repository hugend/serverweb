package json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
// 
/*
 * .json������ JSONArray�� JSONObject�� ��ȯ
 * JSON �ļ� - JSONparser(json-simple.jar ���̺귯�� ������)
*/
public class DeptParserTest {
	public static void main(String[] args) throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject root = (JSONObject)parser.parse(new FileReader("src/json/dept.json"));
		
		JSONArray deptlist = (JSONArray) root.get("dept");
		
		for (int i = 0; i < deptlist.size(); i++) {
			JSONObject dept = (JSONObject)deptlist.get(i);
			String code = (String)dept.get("code");
			String name = (String)dept.get("name");
			String loc = (String)dept.get("loc");
			
			System.out.println("code:"+code+"name:"+name+"loc:"+loc);
		}
		
		
		

		
		
	}
}
