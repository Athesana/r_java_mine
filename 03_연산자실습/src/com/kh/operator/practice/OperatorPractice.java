package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		int i = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하세요. (양수 또는 음수)");
		i = scanner.nextInt();
		
		result = (i > 0)? "양수이다." : "양수가 아니다.";
		System.out.println(result);
		
	}
	
	public void practice2() {
		
		int i = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하세요.");
		
		i = scanner.nextInt();
		result = (i > 0)? "양수이다" : (i == 0) ? "0이다." : "음수이다.";
				
		System.out.println(result);
		
		
	}

	public void practice3() {
		
		int i = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하세요.");
		i = scanner.nextInt();
		
		result = (i % 2 == 0)? "짝수다." : "홀수다.";
		System.out.println(result);
		
		
	}

	public void practice4() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		

		
		System.out.println("인원 수를 입력하세요.");
		num1 = scanner.nextInt();
		
		System.out.println("사탕 개수를 입력하세요.");
		num2 = scanner.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));
	}

	public void practice5() {
		
		String result = "";
		int age = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		age = scanner.nextInt();

		result = (age > 0) && (age <= 13) ? "어린이" : (age > 13) && (age <= 19) ? "청소년" : "성인";
		System.out.println(result);
	}
	
	public void practice6() {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean isTrue = false;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("각 숫자를 입력하세요.");
		System.out.print("입력 1 : ");
		num1 = scanner.nextInt();
		
		System.out.printf("입력 2 : ");
		num2 = scanner.nextInt();
		
		System.out.print("입력 3 : ");
		num3 = scanner.nextInt();
		
		isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);
		
		
		
	}

	
	
}

