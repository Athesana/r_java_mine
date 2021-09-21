package com.kh.operator.practice;

import java.util.Scanner;

public class E_Logical {

	/*
	 * 	논리 연산자
	 *  - 두 개의 논리값을 연산하는 연산자(boolean 타입의 값만 사용 가능)
	 *  - &&(AND) : 왼쪽, 오른쪽 피연산자가 모두 true 일 경우 참(true)
	 *  			true && ture  = ture
	 *  			true && false  = false
	 *  			false && ture  = false
	 *  			false && false  = false
	 *  - ||(OR) : 왼쪽, 오른쪽 피연산자 둘 중 하나라도 true일 경우 참(true)
	 * 				true || ture = ture
	 * 				true || false = ture
	 * 				false || ture = ture
	 * 				false || false = false
	 */
	
	public void method1() {
		// 사용자가 입력한 정수 값이 1~100 사이의 값인지 확인하기
		
		int num = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력하세요.");
		num = scanner.nextInt();
		
		//논리(boolean)은 대소비교할 수 없다. 따라서 1 <= num <= 100 작성은 불가능
		result = (num >= 1) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1 이상 100 이하의 값인가요? : " + result);
		
		
	}
	
	public void method2() {
		// 사용자가 입력한 값이 y 또는 Y 인지 확인하기
		
		char ch = '\u0000';
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계속 진행하시려면 y 또는 Y를 입력하세요.");
		
//		String str = scanner.nextLine(); 문자열 클래스 생성한 값을 str 변수에 담아준다.
//		str.charAt(0);  을 한 줄로 쓴게 아래 줄로 한꺼번에 쓴 것. 사용자가 입력한 문자열에서 charAt 메소드를 사용해서 문자를 반환한다.
		
		ch = scanner.nextLine().charAt(0); // 클래스를 생성하면서 바로 메소드를 수행시켜서 ch 변수에 담아준다.
		
		result = (ch =='y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? : " + result);
		
		
	}
	
	public void method3() {
		// Short Cut 연산 테스트 (AND/OR 연산에서 뒤에 연산을 실행하지 않고도 결과가 예측 가능할 때 사용, 뒤 연산은 실행하지 않는다.)
		
		int num = 10;
		boolean result = false;
		
		System.out.println("&& 연산 전의 num의 값 : " + num);
		
		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (num < 5) && (++num > 0);
		
		System.out.println("result : " + result);
		System.out.println("&& 연산 후의 num의 값 : " + num);
		System.out.println();
		
		System.out.println("|| 연산 전의 num의 값 : " + num);
		
		
		// || 연산자를 기준으로 앞에서 이미 true가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (num < 20) || (++num > 0);
		
		System.out.println("result : " + result);
		System.out.println("|| 연산 후의 num의 값 : " + num);
		
	}
	
	
}
