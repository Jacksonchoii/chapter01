package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan;
		int i = 1; //초기값
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		dan = sc.nextInt();
		
		while(i<=9) { //조건식
			System.out.println(dan+" * "+i+" = "+(dan*1));
			i++; //증감식
		}
		
		sc.close();
		
	}

}
