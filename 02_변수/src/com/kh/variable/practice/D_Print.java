package com.kh.variable.practice;

public class D_Print {
	public void printMethod() {
		int iNum = 10;
		int iNum2 = 20;

		
		// Systme.out.printf("포멧", 출력하고자 하는 값1, 값2, 값3, ...);
		// 출력하고자 하는 값들을 제시된 포멧(서식)에 맞춰서 출력을 진행, 줄바꿈 X
		System.out.printf("%d\n", iNum);
		System.out.printf("%-5d\n", iNum);
		System.out.printf("%d\n", iNum, iNum2);
//		System.out.printf("%d %d\n", iNum); // 에러가 발생한다. (서식 지정자에 해당하는 값들이 모두 존재해야 한다.)
		System.out.printf("%d + %d = %d\n", iNum, iNum2, (iNum + iNum2));
		
		System.out.println("=================");
	
		float fNum = 3.14159272f; 
		double dNum = 4.56;
		
		//%f는 실수값을 소수점 아래 6자리까지만 보여주고 7자리에서 반올림해서 보여준다. 만약 6자리까지 수가 없으면 모두 0으로 채워서 표시.
		
		System.out.printf("%f\t%f\n", fNum, dNum);
		System.out.printf("%.3f\t%.3f\n", fNum, dNum);
		
		System.out.println("=================");
		
		char ch = 'A';
		String str = "\"Hello\"";
		
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%s %s\n", ch, str); // %s는 char 타입도 표현이 가능
		System.out.printf("%C %S\n", ch, str); // %C %S를 대문자로 적으면 모든 글씨가 대문자로 나온다.
		
		
	}
	
}
