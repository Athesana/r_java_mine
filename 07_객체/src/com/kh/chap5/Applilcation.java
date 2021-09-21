package com.kh.chap5;

import com.kh.chap4.constructor.User;
import com.kh.chap5.method.A_Method;
import com.kh.chap5.method.C_StaticMethod;

public class Applilcation {

	public static void main(String[] args) {

		A_Method methodTest = new A_Method();
		
		//1. 매개변수와 반환값이 둘 다 없는 메소드
	
		methodTest.method1();
	
		//2. 매개변수가 없지만 반환값은 있는 메소드
		
		String str = methodTest.method2();  // alt + shift + l 단축기 사용, 자동으로 변수를 담아준다.
		System.out.println(str);
		
		//3. 매개 변수가 있고 반환값이 없는 메소드
		
		methodTest.method3(10, 20);
	
		//4. 매개 변수가 있고 반환값도 있는 메소드

		System.out.println(methodTest.method4(30, 20));  // 10
		
		
		// 5. 매개 변수로 객체를 전달받는 메소드 호출
		User user = new User("lee", "1234", "이산아");
		System.out.println(user.information());
		methodTest.method5(user);
		System.out.println(user.information());
		
		
		// 6. 매개 변수로 가변인자를 전달받는 메소드
//		- 가변인자의 경우 자바 1.5 부터 지원한다.
//		- 가변인자는 항상 매개 변수 마지막에 있어야 한다.
//		- 가변인자 사용시 값을 주지 않아도 호출이 되기 때문에 인자에서 예외 처리하는 코드가 필요하다.
		
//		<1번> 배열 생성하고 호출
		int [] arr = {1, 2, 3, 4, 5, 7, 8};
		methodTest.method6(arr);
//		<2번> 생성 동시에 호출하는데 new int[]로 배열 형태로 만들어줘야한다.
		methodTest.method6(arr);
//		methodTest.method6(new int[] {1, 2, 3, 4, 5, 7, 8});
		
		methodTest.method7(1, 2, 3, 5, 7, 10, 11);
		methodTest.method7(1, 2, 3);
		
		
		System.out.println("=====================================");
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		C_StaticMethod.method1();  // 값 : 30
		// 정적 멤버는 객체 참조 변수로도 접근이 가능하지만 정적 멤버는 클래스 이름으로 접근하는 것이 좋다.
//		new C_StaticMethod().method1();  // 객체를 생성하고 호출 (잘 사용하지 않는다.) (주로 인스턴스 멤버가 하는 방법)
		
		// 2. 매개변수가 없고 반환값이 있는 메소드 // 정수값만 있어서 정수값을 받을 프린트 메소드가 필요해 // 값 : 31
		System.out.println("Result : " + C_StaticMethod.method2());
		
		// 3. 매개변수가 있고 반환값이 없는 메소드
		C_StaticMethod.method3("이산아");
		
		// 4. 매개변수도 있고 반환값도 있는 메소드
		int result = 0;  // 2. 변수에 담아서
		result = C_StaticMethod.method4(1, 2, 3); // 1. 클래스 이름으로 접근, 출력 구문이 없으니까
		System.out.println(result); // 3. 출력 // 값 : 6
		
		result = C_StaticMethod.method4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(result); // 값 : 55
		
	}

}
