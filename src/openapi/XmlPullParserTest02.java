package openapi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import jdk.nashorn.internal.runtime.ECMAException;

public class XmlPullParserTest02 {

	public static void main(String[] args) {
		//1. 파서를 factory를 통해서 생성
		try {
			XmlPullParserFactory factory =
					XmlPullParserFactory.newInstance();
			
		//2. 파서생성
			XmlPullParser pullparser = factory.newPullParser();
			
		//3. 파싱할 문서를 지정
		// - 원격 : URL 이용
//			- 로컬 : BufferedInputStream
			BufferedInputStream bis = 
					new BufferedInputStream(new FileInputStream("src/openapi/dept.xml"));
			
//			4. pullparser에 스트림으로 넘겨준다.
			pullparser.setInput(bis, "utf-8");
//			5. 각각의 이벤트에 반응할 수 있도록 코드를 작성
//			이벤트를 구분할 수 있는 상수가 존재하며 이 상수를 저장할 수 있는 변수가 필요하다.
			int eventType = pullparser.getEventType();
			
			while(eventType!=XmlPullParser.END_DOCUMENT){
				if(eventType==XmlPullParser.START_TAG){
					//태그가 시작일때 태그명을 추출
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
