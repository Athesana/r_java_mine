package com.kh.variable.practice;

public class A_Variable {
	// 클래스 안에 여러개의 메소드 존재 가능하다.
	public void printValue() {
		
		// 변수를 사용하지 않은 경우
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		
		System.out.println(); //콘솔에서 줄바꿈을 위해서 호출
		
		// 변수를 사용하는 경우
		double pi = 3.141592653589793;
		int r = 10;
		int h = 20;
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
		
	}

	public void declear() {
		/*
		 * 변수의 선언
		 * 	[표현법]
		 * 		자료형 변수명;
		 * 
		 *   - 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당 받을지에 대한 정보
		 *   - 변수명은 변수의 이름으로 이름, 값을 읽고, 쓰고, 지우고, 변경하는 작업을 한다.
		 */
		// 논리형 
		boolean isTure; 
		
		// 정수형
		byte bNum;   // 1byte의 정수를 담을 수 있는 변수를 선언
		short sNum;  // 2byte의 정수를 담을 수 있는 변수를 선언
		int iNum;    // 4byte의 정수를 담을 수 있는 변수를 선언
		long lNum;   // 8byte의 정수를 담을 수 있는 변수르 선언
		
		// 실수형
		float fNum;  // 4byte의 실수를 담을 수 있는 변수를 선언
		double dNum; // 8byte의 실수를 담을 수 있는 변수를 선언
		
		
		// 문자형
//		char ch;     // 2byte의 문자를 담을 수 있는 변수를 선언
//		char ch = '\u0000'; 유니코드 형태로 초기화(빈 문자)
		char ch = 'a';
		
		// 문자열
//		String name; 문자열을 가리킬 수 있는 참조형 변수를 선언, String은 클래스로써 생성됐기 때문에 대문자로 시작함, 주소값 이용
		String name = "이산아";
		
	
		/*
		 * 변수의 초기화
		 * 	[표현식]
		 * 		변수명 = 값; 
		 * 
		 * 		= : 오른쪽 데이터를 왼쪽의 변수에 대입(저장)하는 연산자, 같다는 뜻이 아님.
		 */
		
		// 선언 후 초기화
		isTure = false;
		
		// 로컬 변수를 생성 후 초기화가 되지 않은 경우, 사용하려고 하면 에러가 발생한다.
//		System.out.println("bNum : " + bNum);
		
		bNum = 11;
		sNum = 12;
		iNum = 300;
		// 정수형 리터럴은 기본적으로 int 컴파일 된다. int 범위 넘어가는 숫자가 입력되면 에러 발생.
		// long 타입 리터럴은 숫자 뒤에 L 또는 l을 입력해야 한다.
		lNum = 3456345235l;
		
		// 실수형 리터럴은 기본적으로 double로 컴파일 된다.
		// float 타입의 리터럴은 숫자뒤에 F 또는 f를 입력해야 한다.
		fNum = 3.14f;
		// double 타입의 리터럴에서 숫자뒤에 D 똔는 d는 생략 가능하다.
		dNum = 1.23425235d;
		
		System.out.println("isTrue : " + isTure);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("name : " + name);

//		Alt + 방향키 하면 한 줄 통째로 아래로 내려옴, 여러 줄은 블록처리로 잡고 내림
//		Shift + Enter 커서가 중간에 있어도 다음 줄로 이동함
//		Ctrl + D 한 줄 통째로 삭제
		
		//변수의 명명 규칙
		// 1) 대소문자 구분 (각각 다른 변수로 인식, 자료형이 달라도 같은 이름이 존재하면 에러 발생)
		int number;
		int NUBMER;
		int NumBer;
		
		// 2) 예약어를 사용할 수 없다.(변수, 클래스, 메소드 등등에 사용할 수 없다.)
//		int double;
//		int void;
//		int publid; 
		
		// 3) 숫자로 시작할 수 없다. (어떤 자료형도 똑같이 안됨)
//		int 1age;
		int age1;
		
		// 4) 특수 문자는 '_'와 '$'만 사용 가능하다. (값 중간에 사용해도 된다.)
		int _age;
		int $age;
//		int @age;
//		int %age;
		
	}
	
	public void overflow() {
		// byte 자료형의 저장 범위 : -128~127
		
		byte bNum = 127;
		byte result = (byte)(bNum + 1);
		
		System.out.println("bNum : " + bNum);
		System.out.println("result : " + result);
		
		
		System.out.println("byte의 표현 범위 : " + Byte.MAX_VALUE + " ~ " + Byte.MIN_VALUE);
		System.out.println("short의 표현 범위 : " + Short.MAX_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int의 표현 범위 : " + Integer.MAX_VALUE + " ~ " + Integer.MIN_VALUE);
		System.out.println("long의 표현 범위 : " + Long.MAX_VALUE + " ~ " + Long.MIN_VALUE);
		System.out.println("float의 표현 범위 : " + Float.MAX_VALUE + " ~ " + Float.MIN_VALUE);
		System.out.println("double의 표현 범위 : " + Double.MAX_VALUE + " ~ " + Double.MIN_VALUE);
		System.out.println("char의 표현 범위 : " + (int) Character.MAX_VALUE + " ~ " + (int) Character.MIN_VALUE);
		
		
		
	}

	public void constant() {
		/*
		 * 상수
		 * 	[표현법]
		 * 		final 자료형 변수명;
		 * 
		 * 		- 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 *		- 어느 시점부터 변하지 않을 건지도 설정
		 *		- 초기화 이후에는 값을 변경할 수 없다.
		 *		- 대소문자 구분하기 때문에 밑의 두 변수는 다른 것으로 인식한다.
		 *		- 대부분 대문자로 많이 쓴다.
		 */
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 30;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
//		위처럼 이미 초기화하고 출력까지 하고 또 다시 초기화 하려고 하면 오류난다.
//		age = 25; 오류남
//		AGE = 35; 오류남
		
	}
	
}
