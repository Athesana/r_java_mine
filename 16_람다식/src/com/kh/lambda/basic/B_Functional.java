package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FuncInterface;
import com.kh.lambda.basic.functional.B_FuncInterface;
import com.kh.lambda.basic.functional.C_FuncInterface;

public class B_Functional {
	
	private int num = 100;
	
	public void method1() {
		A_FuncInterface fi = () -> {
//			String str = "매개변수와 반환값이 없어요~~";
			System.out.println("매개변수와 반환값이 없는 람다식 1");
//			System.out.println(str);
		};
		
		fi.method();
		
//		fi = new A_Functional() {
//			
//			@Override
//			public void method() {
//				System.out.println("매개변수와 반환값이 없는 람다식 1");
//				
//			}
//		};
//		
//		fi.method();
		
		
//		실행문이 한줄이라면 중괄호({})를 생략할 수 있다.
		
		fi = () -> System.out.println("매개변수와 반환값이 없는 람다식 2");
		
		fi.method();
		
//		fi = new A_Functional() {
//			
//			@Override
//			public void method() {
//				System.out.println("익명 구현 객체를 통한 인터페이스 구현");
//				
//			}
//		};
//		이 방법보다 더 간결하게 표현할 수 있다.
		
	}

	
	public void method2() {
		B_FuncInterface fi = (int a) -> {
			System.out.println(a * a);
		};
		
		fi.method(5);
		
		// 매개변수의 자료형을 생략 가능
		// 매개변수가 하나이면 괄호() 생략 가능
		fi = a -> System.out.println(a * 5);			
		
		fi.method(10);
	}
	
	
	
	public void method3() {
		int result = 0;
		C_FuncInterface fi = null;
		
		fi = (int x, int y) -> {
			return x + y;
		};
		
		result = fi.method(10, 20);
		
		System.out.println("10 + 20 = " + result);
		
		// 매개변수의 자료형, return 구문과 중괄호{} 생략 가능
		fi = (x, y) -> x * y;
		
		System.out.println("10 * 20 = " + fi.method(10, 20));
	}
	
	/*
	 * 람다식의 실행 블록에서는 필드(인스턴스 변수) 및 로컬변수(매개변수)를 사용할 수 있다.
	 * 필드(인스턴스 변수)는 제약사항 없이 사용하지만, 로컬변수(매개변수)는 제약사항이 따른다.
	 * 람다식에서 사용되는 this는 익명 구현 객체의 참조가 아니라 람다식을 실행하는 객체의 참조이다.
	 * 람다식에서 로컬변수(매개변수)를 이용할 때는 변수들이 final 이거나 effectively final이여야 한다.
	 * 	- 로컬변수(매개변수)는 람다식에서 읽는 것은 허용하지만, 람다식 내부에서 또는 외부에서 변경할 수 없다.
	 * 	- 초기화가 된 후에 한 번도 값이 변경되지 않는 변수를 effectively final 이라고 한다.
	 */
	
	
	public void method4(int arg) {
		int num = 20;
		
// 		필드(인스턴스 변수) 사용
//		this.num = 200;
		// 익명 구현 객체 안에서 위에 있는 private int num에 접근하고 싶어요.
		A_FuncInterface fi = () -> {
//			this.num = 300;
			
			System.out.println(this.num);
		};
		
		fi.method(); // this.num => 100이 찍힌다.
//		람다식에서의 this는 람다식을 실행하는 객체 B_Functional을 의미한다.
//		field의 값을 변경하는 것 가능
		
//		fi = new A_FuncInterface() {
//			
//			@Override
//			public void method() {
//				System.out.println(this.num);
//			// 익명 구현 객체의 this는 		
//			}
//		};
		
//		로컬 변수 사용
		//Local variable num defined in an enclosing scope must be final or effectively final 에러 발생
//		num = 200;
//		arg = 200;
		
		fi = () -> {
			//Local variable num defined in an enclosing scope must be final or effectively final 에러 발생
//			num = 200;
//			arg = 200;
			System.out.println(num + ", " + arg);
		};
		
		fi.method();  // 20, 30 출력
		
	}
	
	
	
	
}
