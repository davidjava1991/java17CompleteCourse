package com.david.class71;

public class GlassCup extends Cup {
	@Override
	void clean() {
		System.out.println("Clean Glass Cup");
	}
	public static void main(String[] args) {
		Cup c = new GlassCup();
		c.fill();
		c.clean();
	}
}
