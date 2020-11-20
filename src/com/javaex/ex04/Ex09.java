package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
						//boolean action = true;
						// while( action) true 값을 action으로
		
		int num01;
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			num01 = sc.nextInt();
			
			if(num01==0) {
				System.out.println("종료");
				break; // break; 대신 action=false; 로 대체할 수 있음 
					   // ↑ 사용시 action=false;에서 while로 올라가서 밖으로 빠져나감
			}else if(num01%3==0){
				System.out.println("3의 배수 입니다");
			}else {
				System.out.println("3의 배수가 아닙니다");
			}
			
			
			
		}
		
		
		
		
		sc.close();
	}

}
