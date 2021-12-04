package com.david.class45;

public class Student {
	int id;
	String branch;
	String name;
	{// instance initialization block
		System.out.println("iib block");
		name = "default name";
		branch = "default branch";
		id =0;
	}
	Student(){ // no arg constructor
		System.out.println("no arg constructor");
	}
	
	Student(int idNum) { //  constructor with one arg
		id = idNum;
	}
	
	Student(int idNum, String nm, String br){ // multiple args constructor
		id = idNum;
		name = nm;
		branch = br;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 name = "+s1.name);
		System.out.println("s1 branch = "+s1.branch);
		System.out.println("s1 id = "+s1.id);
		Student s2 = new Student(2);
		System.out.println("s2 name = "+s2.name);
		System.out.println("s2 branch = "+s2.branch);
		System.out.println("s2 id = "+s2.id);
		Student s3 = new Student(3,"David", "CSE");
		System.out.println("s3 name = "+s3.name);
		System.out.println("s3 branch = "+s3.branch);
		System.out.println("s3 id = "+s3.id);
		
	}
	
	
}
