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
public class JSONParser_EXam {
	public static void main(String[] args) throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject root = (JSONObject)parser.parse(new FileReader("src/json/mydata2.json"));
		String name = (String)root.get("name");
		String age = (String)root.get("age");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
		JSONArray subjectlist = (JSONArray)root.get("subject");
		
		for (int i = 0; i < subjectlist.size(); i++) {
			String subject = (String)subjectlist.get(i);
			System.out.println("subject :"+subject);
		}
		
		JSONObject addr = (JSONObject)root.get("addr");
		
		String zip = (String)addr.get("zip");
		String addr1 = (String)addr.get("addr1");
		
		System.out.println("zip:"+zip+" addr1:"+addr1);
		
		JSONArray historylist = (JSONArray)root.get("history");
		
		for (int i = 0; i < historylist.size(); i++) {
			
			JSONObject history = (JSONObject)historylist.get(i);
			String month = (String)history.get("month");
			String subject = (String)history.get("subject");
			
			System.out.println("history :"+"month :"+month+" subject :"+subject);
		}		
		
		
		
		

		
		
	}
}
