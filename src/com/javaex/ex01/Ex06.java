package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//자동형변환
		int num01 = 1;
		float num02 = 1.0f;
		float result01 = num01 + num02;
		System.out.println(result01);
		
		//자동형변환2
		long num03 = 12345L;
		float num04 = 1.1f;
		
		float result04 = num03 + num04;
		System.out.println(result04);
		
		
		//강제형변환 -> 실수를 정수로 강제 형변환하니 소숫점 날라가고 정수만 남음
		float var01 = 12.34f;
		int var02 = (int)var01;
		System.out.println(var02);
		
		float var03 = 12.5f;
		float var04 = var03+0.1f;
		System.out.println(var03);
		System.out.println(var04);
		
		//강제형변환: 확대변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		
		//강제형변환: 축소변환(정상)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//강제형변환: 축소변환(비정상)
		int v05 = 1234567;
		byte v06 = (byte)v05;
		System.out.println(v06);
		System.out.println(v05);
		
		//강제형변환: 실수 -> 정수(소수점 이하 없어짐)
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//강제형변환: 정수 -> 실수
		int v09 = 123;
		double v10 = (double)v09;
		System.out.println(v10);
		
	}
	
}
