package com.david.class151;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("./out/Sample.txt");
			BufferedWriter bw =new BufferedWriter(fw);
			bw.write("Hello World \n i am David");
			bw.close();
			System.out.println("File created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
