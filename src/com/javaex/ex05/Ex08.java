package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 내가 짠 코드
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {10,20,30};
		
		if(leftArray.length!=rightArray.length) {
			System.out.println("두 배열의 크기가 다릅니다.");
		}else {
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i]!=rightArray[i]) {
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		}
		*/
		
		//수업 때 같이 짠 코드
		
		int[] arrA = new int[] {10,20,30};
		int[] arrB = new int[] {10,20,30};
		
		if(arrA.length == arrB.length) {
			for(int i=0; i<arrA.length; i++) {
				if(arrA[i]!=arrB[i]) {
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
			
		}else {
			System.out.println("배열의 크기가 다릅니다.");
		}

		
	
			
		
	}
}