package com.david.class151;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./out/Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String op ="";
			while(true) {
				String s = br.readLine();
				if(s == null) {
					break;
				} else {
					op += s + "\n";
				}
			}
			br.close();
			System.out.println("File content : \n"+op);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
