package openapi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
//dao의 역할
//xml을 파싱해서 dto를 만들어서 리턴하는 클래스
public class DeptLogic {
//	ArrayList<XMLDeptDTO> getDeptList()
	
	public ArrayList<XMLDeptDTO> getDeptListPull(){
		ArrayList<XMLDeptDTO> deptlist = new ArrayList<XMLDeptDTO>();
		try {
			XmlPullParserFactory factory =
					XmlPullParserFactory.newInstance();
			XmlPullParser pullparser = factory.newPullParser();
			BufferedInputStream bis = 
					new BufferedInputStream(new FileInputStream("src/openapi/dept.xml"));
			pullparser.setInput(bis, "utf-8");
			
			int eventType = pullparser.getEventType();
			String tagName = "";
			String code = "";
			String name = "";
			String loc = "";
			String tel ="";
			while(eventType!=XmlPullParser.END_DOCUMENT){
				if(eventType==XmlPullParser.START_TAG){
					tagName = pullparser.getName();//태그명세팅
				}else if(eventType == XmlPullParser.TEXT){
					if(tagName.equals("code") & !pullparser.getText().contains("\n")){
						code = pullparser.getText();
					}else if(tagName.equals("name") & !pullparser.getText().contains("\n")){
						name = pullparser.getText();
					}else if(tagName.equals("loc") & !pullparser.getText().contains("\n")){
						loc = pullparser.getText();
					}else if(tagName.equals("tel") & !pullparser.getText().contains("\n")){
						tel = pullparser.getText();
					}
				}else if(eventType == XmlPullParser.END_TAG){
					tagName= pullparser.getName();//태그명을 다시세팅
					if(tagName.equals("dept")){
						XMLDeptDTO dept = 
								new XMLDeptDTO(code, name, loc, tel);
						deptlist.add(dept);
					}
				}
			eventType = pullparser.next();
			}
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return deptlist;
	}
	
	
	
	
	
	
	
	public ArrayList<XMLDeptDTO> getDeptList() {
		ArrayList<XMLDeptDTO> dtolist = new ArrayList<XMLDeptDTO>();
		XMLDeptDTO dto = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		String code = null;
		String name = null;
		String loc = null;
		String tel = null;

		try {
			DocumentBuilder domparser = factory.newDocumentBuilder();
			Document document = domparser.parse("src/openapi/dept.xml");
			Element root = document.getDocumentElement();

			NodeList nodelist = root.getElementsByTagName("dept");
			
			
			for (int i = 0; i < nodelist.getLength(); i++) {
				//dept노드의 하위 노드들 중에서 공백노드를 제외한 노드
				
				Node deptnode = nodelist.item(i);
				System.out.println(nodelist.getLength());

				NodeList deptChildNodelist = deptnode.getChildNodes();

				for (int j = 0; j < deptChildNodelist.getLength(); j++) {
					Node deptChildNode = deptChildNodelist.item(j);

					if (deptChildNode.getNodeName().equals("code")) {
						code = deptChildNode.getTextContent();
					} else if (deptChildNode.getNodeName().equals("name")) {
						name = deptChildNode.getTextContent();
					} else if (deptChildNode.getNodeName().equals("loc")) {
						loc = deptChildNode.getTextContent();
					} else if (deptChildNode.getNodeName().equals("tel")) {
						tel = deptChildNode.getTextContent();
					}
					dto = new XMLDeptDTO(code, name, loc, tel);
				}
				dtolist.add(dto);
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dtolist;
	}
	
	
	// 노드의 텍스트값을 리턴하는 메소드
	public String getText(Node node, String tagname){
		String data = "";
		return data;
	}
}
