package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int point = sc.nextInt();
		
		if(point>0&&point%2==0) {
			System.out.println("짝수입니다");
		}
		
		else if(point%2==1) {
			System.out.println("홀수입니다");
		}
		
		else if(point<0) {
			System.out.println("음수입니다");
		}
		
		else if(point==0){
			System.out.println("0입니다");	
		}*/
		
		System.out.println("숫자를 입력하세요"); // if안에 if문
		System.out.print("숫자:");
		int point = sc.nextInt();
		
		if(point>0) {
			
			if(point%2==0) { //짝수니?
				// 짝수일 때 코드
				System.out.println("짝수");  
			}else {
				//홀수(짝수아닌 나머지) 일 때 코드
				System.out.println("홀수");
			}
		}else if(point<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
			
		sc.close();
	}

}

