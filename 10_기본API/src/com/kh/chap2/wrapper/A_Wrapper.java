package com.kh.chap2.wrapper;

/*
 * Wrapper 클래스
 *  - 기본 자료형을 객체로 포장해 주는 클래스
 *  - 기본 자료형으로 사용해도 되지만 프로그램에 따라서 해당 기본 타입을 객체로 취급해서 처리해야 하는 경우에 사용
 *  (메소드의 매개변수로 객체 타입만 요구될 때, 컬렉션에 데이터를 저장하려고 할 때)
 *  - 기본 자료형을 Wrapper 클래스로 포장해주는 것을 Boxing이라고 한다.
 *  - 반대로, Wrapper 클래스를 기본 자료형으로 바꿔주는 UnBoxing이라고 한다.
 */

public class A_Wrapper {

	public void method1() {
		//Boxing : 기본자료형 -> Wrapper
		int iNum = 10;
		double dNum = 3.14;
		double dNum2 = 3.15;
		
		// 1.객체 생성을 통한 방법 (Deprecated(비권장))
		Integer integer = new Integer(iNum);
		Double double1 = new Double(dNum);
		Double double2 = new Double(dNum2);
				
		System.out.println(integer);
		System.out.println(double1);
		System.out.println(double2);
		
		System.out.println(double1 == double2); // 주소값을 비교하기 때문에 false로 나온다.
		System.out.println(double1.equals(double2)); // (장점) 객체가 되었기 때문에 다양한 메소드 사용이 가능하다.
		System.out.println(double1.compareTo(double2)); // 두 값을 비교해서 앞쪽에 값이 크면 1을 반환, 뒤쪽이 크면 -1을 반환, 같으면 0을 반환한다.
		System.out.println();
		
		
		// 2. 객체를 직접 생성하지 않고 정적 메소드를 통한 방법
		Integer integer2 = Integer.valueOf(3);
		Double double3 = Double.valueOf("1.11"); // 문자열을 숫자화 시켜준다. 단, 문자열에 숫자가 아닌 값이 있으면 오류가 발생
		
		System.out.println(integer2);   // 3
		System.out.println(double3);   // 1.11
	
		// 3. Auto Boxing
		Integer integer3 = 5; // (객체타입 = 정수타입인데 에러가 안남 why? 같은 타입만 Auto Boxing이 가능) 
		Double double4 = 3.555; // 대입할 기본 값 타입이 맞기만 하면, 기본 타입을 박싱/언박싱 안해도 자동 포장(박싱)이 일어난다.
		
		// UnBoxing : Wrapper -> 기본 자료형으로 변경
		int iNum2 = integer2.intValue();  // 3
		int iNum3 = integer3.intValue();  // 5
		
		System.out.println(iNum2 + iNum3);  // 8
		
		int iNum4 = integer3;  //Auto UnBoxing
		
		System.out.println(integer2 + integer3);  // 객체끼리 더하기 연산 가능? 놉 그러나 여기에서는 오토 언박싱되서 가능
		
//		System.out.printf("%s, %d", "HI", 4);
		
		
		
		
	}
	
	public void method2() {
		String str1 = "10";
		String str2 = "3.14";
		
		System.out.println(str1 + str2);
		
		//1. 문자형을 기본 자료형으로 변경(Wrapper 클래스에서 제공하는 parseXXX() 정적 메소드 이용->객체생성 안하고 클래스 이름으로 바로 접근)
		int iNum = Integer.parseInt(str1);  //str2 안됨
		double dNum = Double.parseDouble(str2); //str1 str2 둘 다 됨
		
		System.out.println(iNum + dNum);
		
		//2. 기본 자료형을 문자열로 변경
		// String의 valueOf() 메소드를 사용하는 방법
		String str3 = String.valueOf(iNum);
		String str4 = String.valueOf(dNum);
		
		System.out.println(str3);
		System.out.println(str4);
		
		//Wrapper 클래스에서 제공하는 valueOf().toString() 메소드를 사용하는 방법 (어려워!)
//		Integer valueOf = Integer.valueOf(iNum);
		String str5 = Integer.valueOf(iNum).toString();
		String str6 = Double.valueOf(dNum).toString();
		
		System.out.println(str5);
		System.out.println(str6);
		
		
		
	}
	
}
