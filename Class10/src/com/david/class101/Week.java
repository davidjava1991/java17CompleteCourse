package com.david.class101;

public enum Week{
	SUN("Sunday"),
	MON("Monday"),
	TUE("Tuesday"),
	WED("wednessday"),
	THU("Thursday"),
	FRI("Friday"),
	SAT("Saturday");
	
	String day;
	Week(String day) {
		this.day = day;
	}@Override
	public String toString() {
		return "day is "+ this.day;
	}
}
