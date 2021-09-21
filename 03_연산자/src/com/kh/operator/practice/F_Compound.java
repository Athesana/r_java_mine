package com.kh.operator.practice;

public class F_Compound {

	/*
	 *  복합 대입 연산자
	 *  - 다른 연산자와 대입 연산자를 함께 사용하는 연산자로 내부적으로 연산 처리 속도가 빠르므로 사용 권장
	 *    (메모리에서 직접 연산을 수행한다.)
	 *  - 증감 연산자(값이 1씩만 증감)와 비슷해 보이지만 복합 대입 연산자는 원하는 숫자만큼 증감연산 가능
	 *  - 산술 연산자가 아니여도 비트, 문자열에 가능
	 *    
	 *    +=, -=. *=, /=, %=
	 *    
	 *    a = a + 1;  =>  a += 1;
	 *    a = a - 3;  =>  a -= 3; 
	 *    a = a * 3;  =>  a *= 3; 
	 *    a = a / 3;  =>  a /= 3; 
	 *    a = a % 3;  =>  a %= 3; 
	 *
	 */

	public void method1() {
		
		int num = 12;
		String str = "Hello";
		
//		str = str + "\tWorld"
		str += "\tWorld!!";
		
		System.out.println(str);
		
		str += 1;  // str = str + 1; => Hello 	Wolrd!!1
		System.out.println(str);
		
		num += 3; // num = num +3; 자기자신에 3더하고 그 값을 자기자신한테 대입한다는 뜻
		System.out.println("num += 3 는(은) " + num);
		
		num -= 5; 
		System.out.println("num -= 5 는(은) " + num);
		
		num *= 6;
		System.out.println("num *= 6 는(은) " + num);
		
		num /= 3;
		System.out.println("num /= 3 는(은) " + num);
		
		num %= 4;
		System.out.println("num %= 4 는(은) " + num);
	}
	
}
