package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[6];
		
		/*
		intArray[0] = (int)(Math.random()*45)+1;
		intArray[1] = (int)(Math.random()*45)+1;
		intArray[2] = (int)(Math.random()*45)+1;
		intArray[3] = (int)(Math.random()*45)+1;
		intArray[4] = (int)(Math.random()*45)+1;
		intArray[5] = (int)(Math.random()*45)+1;
		*/
		
		for(int i=0; i<=5; i++) {
			intArray[i] = (int)(Math.random()*45)+1;	
		}
		
		
		for(int i=0; i<=5; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
