package com.david.class152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Example1 {
	public static void main(String[] args) {
		Path p1 = Paths.get("out", "Sample.txt");
		Path p2 = Paths.get("out", "SampleCopy.txt");
		try {
			Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Files copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
