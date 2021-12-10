package com.david.class101;

public class Example2 {
	public static void main(String[] args) {
		FootballLeague epl = FootballLeague.LIV;
		System.out.println("status : "+epl.printStatus());
		switch(epl) {
		case CHE : System.out.println("chelsea");
			break;
		case LIV : System.out.println("Liverpoool");
			break;
		default : System.out.println("other teams");
		}
		
	}
}
