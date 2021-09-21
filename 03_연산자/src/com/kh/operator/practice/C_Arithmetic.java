package com.kh.operator.practice;

public class C_Arithmetic {
	
	/*
	 *  산술 연산자
	 *    + (더하기)
	 *    - (빼기)
	 *    * (곱하기)
	 *    / (나누기)
	 *    % (나머지 구하기)
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		double dNum1 = 35.0;	// 35로 적어도 오류 안남 why? 자동으로 형변환되서 대입되기 때문
		double dNum2 = 10;
		
		System.out.println("====== 정수형의 사칙연산 ======");
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + ((double)num1 / num2)); // 나누기의 몫
		System.out.printf("num1 / num2 = %.1f\n", ((double)num1 / num2)); // 나누기의 몫, 소수점 첫째자리까지만 출력
		System.out.println("num1 % num2 = " + (num1 % num2));
		
//		System.out.println(10 / (double)20); // 원래 값은 0.5라서 int는 정수만 표현 가능해서 0으로 나옴
											 // 0.5가 나오게 하고 싶으면 피연산자 둘 중 하나를 형변환 해주면 나머지는 자동형변환됨
		
		System.out.println("====== 실수형의 사칙연산 ======");
		System.out.println("dNum1 + dNum2 = " + (dNum1 + dNum2));
		System.out.println("dNum1 - dNum2 = " + (dNum1 - dNum2));
		System.out.println("dNum1 * dNum2 = " + (dNum1 * dNum2));
		System.out.println("dNum1 / dNum2 = " + (dNum1 / dNum2));
		System.out.println("dNum1 % dNum2 = " + (dNum1 % dNum2));
		
//		<참고>
//		System.out.println(5/0); //java에서는 0으로 나누면 에러가 발생한다.
		System.out.println(5/0.0); // Infinity라는 무한대 값이 나옴 -> 실수를 0으로 나누면 무한히 나누어질 수 있다.
		System.out.println(5%0.0);  // NaN(Not a Number) 값이 아니라는 뜻 -> 0으로 나눈 나머지 값은 존재하지도 않고 숫자도 아니다.
		System.out.println((5/0.0) + 2); // Infinity에 2 더해도 무한대임
		System.out.println((5%0.0) + 2 );  // NaN(Not a Number) 값이 아니라는 뜻
		System.out.println(Double.isInfinite(5/0.0)); // Infinity인지 아닌지 체크하는 메소드, 무한대면 true 무한대가 아니면 false
		System.out.println(Double.isNaN(5%0.0)); // NaN인지 아닌지 체크하는 메소드, 맞으면 true 아니면 false
		
	}

}
