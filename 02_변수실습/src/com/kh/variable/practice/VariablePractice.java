package com.kh.variable.practice;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1(){
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int age = 0;
		char gender = '\u0000';
		double height = 0;
		
		System.out.println("이름을 입력하세요.");
		name = scanner.nextLine();
		
		System.out.println("나이를 입력하세요.");
		age = scanner.nextInt();
		
		System.out.println("키를 입력하세요(소수점 첫번째 자리까지 입력하세요.)");
		height = scanner.nextDouble();
		
		System.out.println("성별을 입력하세요(남/여)");
		
		scanner.nextLine();
		
		String line = scanner.nextLine();
		gender = line.charAt(0);

		
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
				
	}
	
	public void method2() {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int r = 0;
		
		System.out.println("첫 번째 정수를 입력하세요.");
		i = scanner.nextInt();
				
		System.out.println("두 번째 정수를 입력하세요.");
		r = scanner.nextInt();
		
		System.out.println("더하기 결과 : " + (i+r));
		System.out.println("빼기 결과 : " + (i-r));
		System.out.println("곱하기 결과 : " + i*r);
		System.out.println("나누기 몫 결과 :" + i/r);
		
	}

	public void method3() {
		
		Scanner scanner = new Scanner(System.in);
		double w = 0;
		double d = 0;
		
		System.out.println("가로");
		w = scanner.nextDouble();
		
		System.out.println("세로");
		d = scanner.nextDouble();
		
		System.out.println("면적 : " + w*d);
		System.out.println("둘레 : " + ((w+d)*2));
		
		
	}

	public void method4() {
		
		Scanner scanner = new Scanner(System.in);
		char keyboard = '\u0000';
		
		System.out.println("문자열을 입력하세요.");
		
		String line = scanner.nextLine();
		keyboard = line.charAt(0);
		System.out.println("첫 번째 문자 : " + keyboard);
		
		keyboard = line.charAt(1);
		System.out.println("두 번째 문자 : " + keyboard);
		
		keyboard = line.charAt(2);
		System.out.println("세 번째 문자 : " + keyboard);
		
		
	}

	
	
}
