package com.david.class35;

public class Example3 {
	public static int returnRuns(String event) {
		return switch(event) {
			case "NoBall","Wide" -> 1;
			case "four"->  4;
			case "One" -> 1;
			case "Four" -> 4;
			case "Out" -> 0;
			case "Six" -> 6;
			default -> 0;
			};
	}
	public static void main(String[] args) {
		int totalRuns = 0;
		totalRuns += returnRuns("Four");
		totalRuns += returnRuns("One");
		totalRuns += returnRuns("Four");
		totalRuns += returnRuns("Six");
		totalRuns += returnRuns("Out");
		totalRuns += returnRuns("One");
		System.out.println("Runs : "+totalRuns);
	}
}
