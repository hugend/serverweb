package json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
// 
/*
 * .json파일을 JSONArray나 JSONObject로 변환
 * JSON 파서 - JSONparser(json-simple.jar 라이브러리 내에서)
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
