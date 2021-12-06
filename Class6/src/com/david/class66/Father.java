package com.david.class66;

public class Father extends GrandFather{
	
	@Override 
	Father getObject() {// co-variant return type
		System.out.println("Father Object");
		return this;
	}
}
