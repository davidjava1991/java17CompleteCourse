package com.david.class121;

public class Example3 {
	public static void main(String[] args) {
		int matrix[][] = {{1,0,0},{0,1,0}, {0,0,1}};
		for(int i = 0; i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print("\t"+matrix[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
