package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		}
		
		else if(80<=point&&point<90) { // 90 이상의 숫자는 point에 들어 올 수 없으므로 
		    System.out.println("B등급");// 조건식이 point>=80 이렇게만 되어도 가능 
		}
		
		else if(70<=point&&point<80) {
			System.out.println("C등급");
		}
		
		else if(60<=point&&point<70) {
			System.out.println("D등급");
		}
		
		else {
			System.out.println("F등급");
		}
		
		
		sc.close();
	}

}
