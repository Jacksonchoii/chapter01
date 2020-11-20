package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum =0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		/* do while 문 사용

		do {
			num = sc.nextInt();
			sum = sum+num;
			System.out.println("합계: "+sum);
		} while(!(num==0));
		*/
		
		//다른표현
		
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: "+sum);
			
			
			if(num==0) {
				break;
			}
		}
		
		
		
		
		System.out.println("종료");
		
		
		
		
		
		sc.close();
		
	}

}
