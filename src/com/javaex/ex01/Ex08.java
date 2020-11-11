package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 3;
		
		//산술연산자
		System.out.println("산술연산자");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		
		System.out.println(a/b); //int 나누기 int라 값은 정수(2)로 나타남
		System.out.println(a%b); //나머지 2*3=6. 7에서 1남음
		
		System.out.println("====나누기====");
		System.out.println(7.0 / 3.0); //실수 나누기 실수라 값은 실수(2.33333)로 나타남
		System.out.println(7.0 % 2.0); 
		System.out.println("============");
		
		//부호연산자
		int var01 = -3;
		System.out.println(var01);
		System.out.println(-var01); // 음수에 - 붙여서 +양수 -> -(-3)
		System.out.println(+var01); // 	  같은 수학적 개념
		System.out.println("=============");
		
		
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a); // 실제 변수 a값이 변경된다. 7->8->출력
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b); // 실제 변수 b값이 변경된다. 3->2->출력
		System.out.println(b);
		System.out.println("=============");
		
		System.out.println(a);
		System.out.println(a++); // 출력 후 +1을 올림
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		
		
	}
}
