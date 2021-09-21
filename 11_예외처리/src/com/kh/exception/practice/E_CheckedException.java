package com.kh.exception.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_CheckedException {

	/*
	 * CheckedException : 무조건 예외가 처리되어야 하는 예외들
	 * - 컴파일 단계에서 예외를 처리하고 있는지 확인, 예외 처리 코드가 있는지 검사하는 예외, 컴파일러 체크 예외라고도 한다.
	 * - Exception 클래스를 상속하고 있는 예외들을 말한다.
	 * - 예외 처리가 되어있지 않으면 컴파일 에러가 발생
	 * - try-catch나 throws로 처리해야 한다.
	 * - 조건문이나 소스코드를 수정한다고 해서 해결되지는 않는다. 주로 외부에 매개체와 입출력이 일어날 때 발생한다.
	 */
	
	public void method1() throws IOException {
		method2();
		
	}
	
	
	public void method2() throws IOException {
		String str = null;
		
		//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자열을 입력해 주세요.");
		str = br.readLine();
		
		System.out.println(str);
	}
	
}
