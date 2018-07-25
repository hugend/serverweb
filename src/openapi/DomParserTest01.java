package openapi;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DomParserTest01 {
	public static void main(String[] args) {
		// parser�� �������ִ� factory ��ü�� ���� �ۼ�
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		try {
			// XML ������ �Ľ��� �� �ִ� DOM parser �� ����
			DocumentBuilder xmlparser = factory.newDocumentBuilder();
			
			// XML ������ �Ľ��ؼ� �ڹٿ��� ����� �� �ִ� ��ü�� ��ȯ 
			// XML �� ��ȯ�ؼ� ������ DOM��ü
			Document document = 
					xmlparser.parse("src/openapi/dept.xml");
			
			System.out.println(document);
			
			// dom��ü�κ��� ������Ʈ ��ȯ�ޱ� - xml ������ root ������Ʈ
			Element root = document.getDocumentElement();
			System.out.println(root);
			System.out.println(root.getTagName());
			System.out.println(root.getFirstChild());
			System.out.println(root.getLastChild());
			
			NodeList nodelist = root.getChildNodes();
			
			//���鵵 ��ü����̶� 9������
			System.out.println("�ڽİ�ü�� ������=>"+nodelist.getLength());
			int size = nodelist.getLength();
			for (int i = 0; i < size; i++) {
				Node node = nodelist.item(i);
				System.out.println("������"+node.getNodeName());
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
