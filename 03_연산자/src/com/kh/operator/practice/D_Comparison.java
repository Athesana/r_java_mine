package com.kh.operator.practice;

import java.util.Scanner;

public class D_Comparison {

	/*
	 *  비교 연산자(관계 연산자)
	 *   - 두 값을 비교하는 연산자, 관계 연산자라고도 한다.
	 *   - 비교 연산자는 조건을 만족하면 true(참)을 반환, 만족하지 않으면 false(거짓)을 반환한다.
	 *  
	 *   a < b : a가 b보다 작은가?
	 *   a > b : a가 b보다 큰가?
	 *   a <= b : a가 b보다 작거나 같은가?
	 *   a >= b : a가 b보다 크거나 같은가?
	 *   a == b : a와 b가 같은가?
	 *   a != b : a와 b가 같지 않은가?
	 *   
	 *   
	 */
	
	public void method1() {
		boolean result = false;
		int num1 = 10;
		int num2 = 25;
		int num3 = 0;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		
		result = (num1 != num2);
		
		System.out.println("result : " + result);
		
		result = ('A' == 65);  // 65 == 65 로 자동 형변환 된다.
		System.out.println(result);
		
		result = (3 == 3.0);  // 3.0 == 3.0 로 자동 형변환 된다.
		System.out.println(result);
		
		result = (0.1 == 0.1f);  // 부동 소수점 타입은 약간의 오차가 발생한다. 따라서 같은 형으로 변환해줘야 true가 나온다.
//		System.out.println(0.1);    단, 예외가 있다. 부동 소수점 타입은 오차가 발생할 수 있기 때문에 대부분의 비교 연산에서는 정수 타입을 사용한다.
//		System.out.println(0.1f);
		System.out.println(result);
		
		// 산술연산 + 비교연산
		// 사용자에게 입력받은 값이 짝수인지, 홀수인지 판단
		System.out.println("임의의 정수를 입력해주세요.");
		
		Scanner scanner = new Scanner(System.in);
		num3 = scanner.nextInt();
		
		System.out.println("num3는 짝수인가? : " + (num3%2 == 0));
		System.out.println("num3는 홀수인가? : " + (num3%2 == 1));
		System.out.println("num3는 5의 배수인가? : " + (num3%5 == 0));
		
		
	}
	
}
