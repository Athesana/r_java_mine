package com.kh.exception.practice;

import java.io.IOException;

public class B_Throws {

	public void method1() throws IOException, Exception {
		System.out.println("method1() 호출");
		
		method2();
		
		System.out.println("method1() 종료");
	}
	
	public void method2() throws IOException, Exception {
		System.out.println("method2() 호출");
		
		method3();   // ctrl + 1 누르면 에러 해결(자동으로 메소드3 만들기)
		
		System.out.println("method2() 종료");
	}

	public void method3() throws IOException, Exception {  //상속 관계이기 때문에 상위 Exception은 둘 다 처리된다.
		System.out.println("method3() 호출");
		
		int random = (int) (Math.random() * 3 + 1);
		
		if(random == 1) {
			throw new Exception();
		} else if (random == 2) {
			throw new IOException();
		}
		
		System.out.println("method3() 종료");
	}
	
}
