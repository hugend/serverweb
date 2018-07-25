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
		//1. �ļ��� factory�� ���ؼ� ����
		try {
			XmlPullParserFactory factory =
					XmlPullParserFactory.newInstance();
			
		//2. �ļ�����
			XmlPullParser pullparser = factory.newPullParser();
			
		//3. �Ľ��� ������ ����
		// - ���� : URL �̿�
//			- ���� : BufferedInputStream
			BufferedInputStream bis = 
					new BufferedInputStream(new FileInputStream("src/openapi/dept.xml"));
			
//			4. pullparser�� ��Ʈ������ �Ѱ��ش�.
			pullparser.setInput(bis, "utf-8");
//			5. ������ �̺�Ʈ�� ������ �� �ֵ��� �ڵ带 �ۼ�
//			�̺�Ʈ�� ������ �� �ִ� ����� �����ϸ� �� ����� ������ �� �ִ� ������ �ʿ��ϴ�.
			int eventType = pullparser.getEventType();
			
			while(eventType!=XmlPullParser.END_DOCUMENT){
				if(eventType==XmlPullParser.START_TAG){
					//�±װ� �����϶� �±׸��� ����
					System.out.println("�±׸�:"+pullparser.getName());
					
				}else if(eventType==XmlPullParser.TEXT){
					String text = pullparser.getText();
					if(!text.contains("\n")){
						System.out.println("���ڿ�:"+pullparser.getText());
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
