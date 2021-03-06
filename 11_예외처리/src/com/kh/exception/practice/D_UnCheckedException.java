package com.kh.exception.practice;

import java.util.Scanner;

public class D_UnCheckedException {

	/*
	 * UnCheckedException
	 *  - RuntimeException(실행시 발생하는 예외)을 상속하고 있는 예외들을 의미한다.
	 *  - 컴파일 시에 예외 처리 코드가 있는지 검사하지 않는 예외를 말한다.
	 *  - RuntimeException 같은 경우엔 프로그램 실행할 때 문제가 발생되는 것이기 때문에 충분히 예측이 가능하기 때문에 조건문들을 통해서 처리 가능
	 * 
	 * RuntimeException의 후손들
	 *  - ArrayIndexOutOfBoundsException : 배열 접근에 잘못된 인덱스 값을 사용하는 경우 예외 발생한다.
	 *  - NegativeArraySizeException : 배열 크기를 음수로 지정한 경우 예외 발생
	 *  - ArithmeticException : 나누기 연산에서 분모가 0인 경우 예외 발생
	 *  - NullPointerException : Null인 참조 변수로 객체의 멤버를 참조 시도시 예외 발생
	 *  - ClassCastException : 잘못된 Cast 연산자 사용시 예외 발생
	 */
	
	public void method1() {
		//ArithmeticException
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		num1 = scanner.nextInt();
		
		System.out.print("정수2 : ");
		num2 = scanner.nextInt();
		
		//1번 방법> 제어문 사용
//		if(num2 == 0) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//			
//			return;
//		}
		
		//2번 방법> try~catch 사용
		try {
			result = num1 / num2;
		
			System.out.println("result : " + result);
		} catch(ArithmeticException e) {	// 예외가 e라는 참조변수에 담긴다.
//			System.out.println(e.getMessage());  // / by zero 메세지 출력
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}
	
	public void method2() {
		//ArrayIndexOutOfBoundsException, NegativeArraySizeException
		
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		size = scanner.nextInt();  // 사용자가 음수같이 잘못입력하면 Negative~ 예외 발생
		
		//1번 방법> 예전 방식
//		if(size <= 0) {
//			System.out.println("양수를 입력해주세요.");
//		
//			return; //(0이면 리턴되서 메소드를 호출한 쪽으로 실행 흐름을 돌려준다.)
//		}
		
//		try {
//			arr = new int[size];  // 예외가 발생할 위치
//			
//			for(int i = 0; i <= arr.length; i++) {
//				arr[i] = size - i;
//			}
//			
//			for(int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");   // 출력하는 구문
//			}
//			
//		} catch (NegativeArraySizeException e) {  // try안에서 예외 발생하면 catch에서 잡아서 예외를 e에 대입해서 아래에 있는 프린트문"양수를~"을 수행한다
//			System.out.println("양수를 입력해주세요.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 인덱스에 접근하셨습니다."); // i <= arr.length로 잘 못 입력했을 때 예외처리할 것
//		} catch (Exception e) {
//			System.out.println("오류가 발생했습니다. 관리자에게 문의해주세요."); // 상위 개념은 아래에 있어야 한다.
//		}
//		
		
		//자바 1.7부터 하나의 catch 블록에서 여러 개의 예외를 처리할 수 있도록 '멀티 catch' 기능이 추가되었다. 
		try {
			arr = new int[size];  // 예외가 발생할 위치
			
			for(int i = 0; i <= arr.length; i++) {
				arr[i] = size - i;
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) { 
			System.out.println("잘못된 배열의 길이를 입력하셨거나 잘못된 인덱스에 접근하셨습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다. 관리자에게 문의해주세요."); 
		}
		
		
		
		
	}
	
	
}
