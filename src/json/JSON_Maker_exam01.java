package json;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON_Maker_exam01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		JSONObject myjson = new JSONObject();
		myjson.put("name", "±è¿¬¾Æ");
		myjson.put("age", "28");
		
		JSONArray subjectlist = new JSONArray();
		subjectlist.add("ÀÚ¹Ù");
		subjectlist.add("ÇÏµÓ");
		subjectlist.add("¼­ºí¸´");
		
		myjson.put("subject", subjectlist);
		JSONObject addr = new JSONObject();
		addr.put("zip", "111-222");
		addr.put("addr1","ÀÎÃµ½Ã");
		
		myjson.put("addr", addr);
		
		JSONArray histoy = new JSONArray();
		JSONObject historylist = new JSONObject();
		JSONObject historylist2 = new JSONObject();
		historylist.put("subject", "java");
		historylist.put("month", "11");
		historylist2.put("subject", "servlet");
		historylist2.put("month", "12");
		
		histoy.add(historylist);
		histoy.add(historylist2);
		
		myjson.put("history", histoy);
		
		
		myjson.put("subject", subjectlist);
		
		System.out.println(myjson.toJSONString());
		FileWriter fw = new FileWriter("src/json/maker_test.json");
		fw.write(myjson.toJSONString());
		fw.flush();
		fw.close();
		
		
		
	
	}

}
