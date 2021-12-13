package com.david.class134;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./out/Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)ois.readObject();
			ois.close();
			System.out.println("Student details");
			System.out.println("id = "+s.id);
			System.out.println("name = "+s.name);
			System.out.println("branch = "+s.branch);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
