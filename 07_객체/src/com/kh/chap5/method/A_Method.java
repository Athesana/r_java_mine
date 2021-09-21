package com.kh.chap5.method;

import java.util.Arrays;

import com.kh.chap4.constructor.User;

/*
 *  메소드부 (객체의 기능을 정의)
 *  
 *   [표현법]
 * 		[접근 제한자] [예약어] 반환형 메소드명([매개변수]) {
 * 		... 수행 내용;...
 * 		[return] [반환값];
 * 		}
 */


public class A_Method {
	//1. 매개 변수가 없고 반환값도 없는 메소드
	public void  method1() {
		// 어떤 값도 반환하지 않고 메소드 내용만 수행 후에 종료
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
//		return; 반환값 없이 단독 사용 가능 but! return 1; 은 에러난다. void는 반환값이 없는데 return 뒤에 반환값을 적어서. 
//		System.out.println("리턴 이후 실행");  // return 후에 실행할 문장이 없는데 죽은 코드 사용하면 에러난다.
	}
	
	// 2. 매개 변수는 없고 반환값은 있는 메소드
	public String method2() {
//		String str = "매개변수가 없지만 반환값은 있는 메소드입니다.";	
//		return str;    -> 문자열을 담아서 그걸 리턴하니까 조금 비효율적이라서 아래처럼 그냥 리턴하고 바로 적어주기도 한다.
		
		return "매개변수가 없지만 반환값은 있는 메소드입니다.";
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {     // double num1, double num2로 해도 자동형변환 덕분에 에러가 없다.
		System.out.println("매개 변수는 있고 반환값이 없는 메소드입니다.");
		System.out.println("\t입력받은 매개 변수 num1 + num2 = " + (num1 + num2));
	}
	
	// 4. 매개 변수가 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		return num1 - num2;
	}
	
	// 5. 매개변수로 User 객체를 전달받는 메소드
	// 매개 변수로 객체(배열, 문자열, 클래스로 만든 객체(여기서는 User)가 전달되거나 반환값으로 반환할 때는 객체의 참조 값(주소 값)이 전달 또는 반환된다. 
	public void method5(User user) {
		user.setName("이몽룡");
		user.setAge(10);
	}
	
	
	// 6. 매개 변수로 가변인자를 전달받는 메소드
	// - 가변인자의 경우 자바 1.5부터 지원한다.
	// - 가변인자는 항상 매개변수 마지막에 있어야 한다.
	// - 가변인자 사용시 값을 주지 않아도 호출이 되기 때문에 인자에서 예외 처리하는 코드가 필요하다.
	// - 생략 가능, 생략하면 값이 없는 목록을 넘겨주는 것
	public void method6(int[] numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
	
	public void method7(int ... numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
	
	
	
	
}
