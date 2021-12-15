package com.david.class154;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Example1 {
	static Element createEmployee(Document d,int id, String name, int age) {
		Element e = d.createElement("employee");
		Element c1 = d.createElement("id");
		c1.setTextContent(""+id);
		Element c2 = d.createElement("id");
		c2.setTextContent(name);
		Element c3 = d.createElement("id");
		c3.setTextContent(""+age);
		e.appendChild(c1);
		e.appendChild(c2);
		e.appendChild(c3);
		return e;
	}
	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.newDocument();
			Element root =d.createElement("Company");
			root.appendChild(createEmployee(d,12,"David",22));
			root.appendChild(createEmployee(d,4,"Paul",32));
			root.appendChild(createEmployee(d,62,"Sam",24));
			root.appendChild(createEmployee(d,42,"Adam",42));
			d.appendChild(root);
			DOMSource doms = new DOMSource(d);
			StringWriter s = new StringWriter();
			StreamResult sr = new StreamResult(s);
			TransformerFactory tf = TransformerFactory.newInstance();
			try {
				Transformer tr = tf.newTransformer();
				tr.transform(doms, sr);
				System.out.println(s.toString());
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
}
