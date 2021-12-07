package com.david.class72;

public class Vivo extends AndroidPhone{

	@Override
	public void sendMail() {
		System.out.println("Mail send");
	}

	@Override
	public void makeCall() {
		System.out.println("Call made");
		
	}
	@Override
	void videoCall() {
		System.out.println("Video call");
		
	}
	
	public static void main(String[] args) {
		Vivo obj = new Vivo();
		obj.makeCall();
		obj.videoCall();
		obj.sendMail();
	}
	
}
