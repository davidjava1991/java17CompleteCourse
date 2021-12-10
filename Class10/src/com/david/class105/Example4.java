package com.david.class105;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example4 {
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println("printing local time : "+lt);
		LocalDate ld = LocalDate.now(); 
		System.out.println("printing local date : "+ld);
		LocalDateTime ldt = LocalDateTime.of(ld, lt); 
		System.out.println("printing local date time : "+ldt);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("formatted date : "+ldt.format(df));
	}
}
