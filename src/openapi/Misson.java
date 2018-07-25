package openapi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class Misson {
	public static void main(String[] args) {
		XmlPullParserFactory factory;
		try {
			factory = XmlPullParserFactory.newInstance();
			XmlPullParser pullparser = factory.newPullParser();
			String pharmurl = "http://apis.data.go.kr/B552657/ErmctInsttInfoInqireService/getParmacyFullDown";
			String key = "UJE0pQOqX%2BTHd%2Bz%2Fq4VoF6wcWthiFXcQYj4vFPEE%2FJF6jLJkfSH7%2FcXMDcIziUBGhvy0GwcWuLCC7gqiwkyKfA%3D%3D";
			String realUrl = pharmurl +"?serviceKey="+key;
					URL url = new URL(realUrl);
			
			BufferedInputStream bis = 
					new BufferedInputStream(new FileInputStream("src/openapi/dept.xml"));
			pullparser.setInput(bis, "utf-8");
			int eventType = pullparser.getEventType();
			
			
			
			while(eventType!=XmlPullParser.END_DOCUMENT){
				if(eventType==XmlPullParser.START_TAG){
					System.out.println("태그명:"+pullparser.getName());
					
				}else if(eventType==XmlPullParser.TEXT){
					String text = pullparser.getText();
					if(!text.contains("\n")){
						System.out.println("문자열:"+pullparser.getText());
					}
				}
				
				eventType = pullparser.next();
			}
			
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
