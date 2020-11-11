package com.javaex.ex01;

public class Ex07 {
	public static void main(String[]args) {
		
		
		double v01 = 5/4; //정수/정수 = 1 -> 결과물이 int로 나옴 -> 1도 double에(억지로)담을 수 있음 = 1.0
		//double v01 = (double) 5/4; 
		System.out.println(v01);
		
		double v02 = (double)5 / 4; // double형 / int정수형 = double형 -> 5.0 / 4 = 1.25
		System.out.println(v02);
		
		double v03 = 5 / (double)4; // 5 / 4.0 = 1.25
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4; // 5.0 / 4.0 = 1.25
		System.out.println(v04);
		
		//실수값 정수로 표현
		int v05 = (int)1.3 + (int)1.8; // 각각 int를 먹여서 정수+정수 소숫점 날라감 1+1 = 2
		System.out.println(v05);
		
		int v06 = (int)(1.3 + 1.8); // (1.3+1.8)을 먼저한 값 3.1에 int를 먹임 = 3
		System.out.println(v06);
		
		
		
	}
}
