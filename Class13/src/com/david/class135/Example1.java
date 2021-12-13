package com.david.class135;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"David","Accounting");
		try {
			FileOutputStream fo = new FileOutputStream("./out/Employee.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo); 
			os.writeObject(e1);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	try {
		FileInputStream fi = new FileInputStream("./out/Employee.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee e2 = (Employee)oi.readObject();
		System.out.println("id= "+e2.id+", name= "+e2.name+", department = "+e2.department);
		oi.close();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}
}
