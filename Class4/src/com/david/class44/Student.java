package com.david.class44;

public class Student {
	int id;
	String name;
	String branch;
	Student(){ // no arg constructor
		System.out.println("no arg constructor");
	}
	
	Student(int idNum) { //  constructor with one arg
		id = idNum;
	}
	
	Student(int idNum, String nm, String br){ // multiple args
		id = idNum;
		name = nm;
		branch = br;
	}
	
	
}
