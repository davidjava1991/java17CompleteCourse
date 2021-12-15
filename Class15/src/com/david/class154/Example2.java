package com.david.class154;

import java.io.File;
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

public class Example2 {
	public static void main(String[] args) {
		File file = new File("./in/Customers.xml");
		ArrayList<Customer> cList = new ArrayList<>();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			NodeList nList = doc.getElementsByTagName("customer");
			Customer c;
			for(int i = 0;i<nList.getLength();i++) {
				c = new Customer();
				Node node = nList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) node;
					c.id = Integer.parseInt(e.getElementsByTagName("id").item(0).getTextContent());
					c.name = e.getElementsByTagName("name").item(0).getTextContent();
					c.address = e.getElementsByTagName("address").item(0).getTextContent();
					cList.add(c);
				}
			}
			cList.forEach(e ->{ 
				System.out.println("---------------");
				System.out.println("id : "+e.id);
				System.out.println("name : "+e.name);
				System.out.println("address : "+e.address);
			});
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}  
		
	}
}
