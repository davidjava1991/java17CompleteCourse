package com.david.class134;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 0L;
	int id;
	String name;
	transient String branch;
	public Student(int id, String name, String branch) {
		this.id =id;
		this.name =name;
		this.branch = branch;
	}
	
}
