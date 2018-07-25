package openapi;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class OpenAPIPharmacyTest02 {
    public static void main(String[] args) throws IOException {
/*        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552657/ErmctInsttInfoInqireService/getParmacyFullDown"); URL

        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=UJE0pQOqX%2BTHd%2Bz%2Fq4VoF6wcWthiFXcQYj4vFPEE%2FJF6jLJkfSH7%2FcXMDcIziUBGhvy0GwcWuLCC7gqiwkyKfA%3D%3D"); Service Key
   */
    	
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	
    	try {
			DocumentBuilder domparser = factory.newDocumentBuilder();
			String pharmurl = "http://apis.data.go.kr/B552657/ErmctInsttInfoInqireService/getParmacyFullDown";
			String key = "UJE0pQOqX%2BTHd%2Bz%2Fq4VoF6wcWthiFXcQYj4vFPEE%2FJF6jLJkfSH7%2FcXMDcIziUBGhvy0GwcWuLCC7gqiwkyKfA%3D%3D";
			String realUrl = pharmurl +"?serviceKey="+key;
					URL url = new URL(realUrl);
					BufferedInputStream bis = 
								new BufferedInputStream(url.openStream());
			
			Document document =  domparser.parse(bis);
			Element root = document.getDocumentElement();
			
			NodeList itemlist =  root.getElementsByTagName("item");
			
					
			for (int i = 0; i < itemlist.getLength(); i++) {
				Node node = itemlist.item(i);
				NodeList childlist = node.getChildNodes();
				for (int j = 0; j < childlist.getLength(); j++) {
					Node childNode = childlist.item(j);
					System.out.print(childNode.getNodeName()+":");
					System.out.println(childNode.getTextContent());
				}
				System.out.println();
			}
			
			
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
    	
    }
}