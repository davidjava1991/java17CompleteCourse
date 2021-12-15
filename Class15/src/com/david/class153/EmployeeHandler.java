package com.david.class153;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeHandler extends DefaultHandler{
	ArrayList<Employee> eList;
	Employee e;
	boolean employee,id,name,age;
	@Override
	public void startDocument() throws SAXException {
		eList = new ArrayList<>();
		System.out.println("Document Started");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println(eList.size());
		System.out.println(eList);
		System.out.println("Document ended");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName);
		switch(qName) {
		case "employee": e = new Employee();
						employee = true;
			break;
		case "id" : id = true;
			break;
		case "name" : name = true;
			break;
		case "age" : age = true;
			break;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		System.out.println("character event");
		String val = new String(ch, start, length);
		if(id){
			e.id = Integer.parseInt(val);
			id =false;
		} else if(name) {
			e.name= val;
			name = false;
		} else if(age) {
			e.age = Integer.parseInt(val);
			age =false;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch(qName) {
		case "employee": eList.add(e);
			employee =false;
			break;
		}
		System.out.println(qName+"element ended");
	}
}
