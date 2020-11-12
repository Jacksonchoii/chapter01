package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("근무시간:");
		
		int h = sc.nextInt();
		
		int p = 10000;
		int op = 12000;
		
		if(h<=8) {
			System.out.println("임금은 "+(p*h)+"원 입니다.");
		}
		else {
			System.out.println("임금은 "+((p*8)+(h-8)*op)+"원 입니다.");
		}*/
		
		
		int pay;//급여
		int time;//근무시간
		
		System.out.print("근무시간: ");
		
		time = sc.nextInt();
		
		
		if(time>8) {
			pay = 8*10000+(time-8)*(int)(10000*1.5);
		}else {
			pay = time*10000;
		}
		
		System.out.println("임금은"+pay+"입니다");
		
		
		sc.close();

	}

}
