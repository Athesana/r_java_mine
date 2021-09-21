package com.kh.chap5.method;

/*
 *  static(정적 멤버) 메소드
 *  
 *   [표현법]
 * 		[접근 제한자] static [예약어] 반환형 메소드명([매개변수]) {
 * 		... 수행 내용;...
 * 		[return] [반환값];
 * 		}
 */

public class C_StaticMethod {

	public static int num1 = 10;
	
	public static int num2 = 20;
	
	// 1. 매개변수와 반환값이 없는 메소드
	public static void method1() {
		System.out.println(num1 + num2);  // 직접 접근 가능
		
		 C_StaticMethod.num2++; // 클래스명으로 접근 가능 (this. 는 불가능, why? 객체를 생성하는게 아니기 때문에)
	}
	
	// 2. 매개변수가 없고 반환값이 있는 메소드
	public static int method2() {
		
		return num1 + num2;
	}
	
	// 3. 매개변수가 있고 반환값이 없는 메소드
	public static void method3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
		
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드 (정수형 가변인자를 매개변수로 -> 배열 형태로 넘어간다.)
	public static int method4(int ... numbers) {
		int sum = 0;
//		==향상된 for문== (배열에 있는 값을 다 담아줄 변수 : 배열 이름)
//		for(int number : numbers) {
//			sum += number;  // sum = sum + number; 와 같은 뜻
//		}
		
//		==일반 for문==
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}
		
	
}
