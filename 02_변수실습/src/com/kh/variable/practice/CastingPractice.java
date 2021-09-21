package com.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1(){
		
		Scanner scanner = new Scanner(System.in);
		int keyboard = 'A';
		
		System.out.println("문자를 입력하세요.");
		scanner.nextLine();

		
		System.out.println("A Unicode : " + keyboard);
		
	}
	
	public void method2() {
		
		Scanner scanner = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		int iSum = 0;
		int iAvg = 0;
		
		System.out.println("국어 점수를 입력하세요.(소수점 첫번째 자리까지 입력하세요.)");
		a = scanner.nextDouble();
		
		
		System.out.println("영어 점수를 입력하세요.(소수점 첫번째 자리까지 입력하세요.)");
		b = scanner.nextDouble();
		
		System.out.println("수학 점수를 입력하세요.(소수점 첫번째 자리까지 입력하세요.)");
		c = scanner.nextDouble();
		
		iSum = (int)(a + b + c);
		iAvg = (int)(a+b+c)/3;
		
		System.out.println("총점 : " + iSum);
		System.out.println("평균 : " + iAvg);
		
	}

	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1/iNum2 );  // 2
		System.out.println( (int)dNum );  // 2
		
		System.out.println( iNum2*dNum );  //10.0
		System.out.println( (float)iNum1 );  //10.0

		System.out.println( (double)iNum1/iNum2 );  // 2.5
		System.out.println( (double)dNum );  // 2.5
		
		System.out.println( (int)fNum );  //3
		System.out.println( iNum1/(int)fNum );  //3

		double d = (double)iNum1/fNum;
		
		
		System.out.printf( "%.7f\n", d ); //3.3333333
		System.out.printf( "%.16f\n", d );  // 3.333333333333335
		
		
		System.out.println( ch );  // 'A'
		System.out.println( (int)ch );  // 65 

		System.out.println( (int)ch + iNum1 );  // 75
		System.out.printf( "%c", (ch + (char)iNum1) );  //'K'
		
		
	}
	
}
