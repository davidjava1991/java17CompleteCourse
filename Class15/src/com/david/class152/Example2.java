package com.david.class152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;

public class Example2 {
	public static void main(String[] args) {
		Path p1 = Paths.get("out", "Example.txt");
		System.out.println("file name : "+p1.getFileName());
		System.out.println("file system"+p1.getFileSystem());
		try {
			Files.createFile(p1);
			System.out.println("File created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
