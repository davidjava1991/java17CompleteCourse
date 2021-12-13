package com.david.class134;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example1 {
	public static void main(String[] args) {
		try {
		FileOutputStream fos = new FileOutputStream("./out/Student.txt");
		ObjectOutputStream os =new ObjectOutputStream(fos);
		os.writeObject(new Student(1,"David","CSE"));
		os.close();
		System.out.println("Student serialized");
		} catch(IOException e) {
			
		}
	}
}
	
