package com.david.class151;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Example4 {
	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("./in/settings.properties"));
			System.out.println(p);
			System.out.println("check key : "+p.containsKey("name"));
			System.out.println("version = "+p.get("version"));
			p.setProperty("name", "paul");
			p.store(new FileWriter("./in/settings.properties"), "set name");
			System.out.println("file stored");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
