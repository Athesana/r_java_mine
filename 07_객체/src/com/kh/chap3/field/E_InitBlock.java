package com.kh.chap3.field;

/*
 * 필드의 초기화 순서
 * 
 * 	1. 필드의 초기화 순서(=인스턴스 변수)
 * 		1) JVM이 정한 기본값으로 초기화
 * 		2) 명시적 초기화
 * 		3) 인스턴스 블록을 이용한 초기화
 * 		4) 생성자를 이용한 초기화
 * 
 *  2. 클래스 변수의 초기화 순서 -> 객체를 생성하지 X, 따라러 생성자를 사용할 수 없다.
 *  	1) JVM이 정한 기본값으로 초기화
 * 		2) 명시적 초기화
 * 		3) static 블록을 이용한 초기화
 * 
 */
public class E_InitBlock {
	// 1. JVM이 정한 기본값으로 초기화
	private String name;	// null
	private static int age;  // 0
	private static String brand = "삼성";

	// 2. 명시적 초기화
	private String phoneName = "삼성 갤럭시 노트10+";
	private int price = 0;
	
	// 3. 초기화 블록을 이용한 초기화 { } 중괄호만 넣어주면 된다.
	// 인스턴스 필드를 초기화 시키는 블럭으로 객체 생성시마다 실행되고 초기화 한다.
	// 이미 2.명시적 초기화에서 초기화되어있는 값이 이제 바뀐다.
	{
		phoneName = "갤럭시 Z 플립";
		price = 500000;
		
		/*
		 *인스턴스 블록에서는 클래스 변수도 초기화 할 수 있다.
		 *하지만 클래스 변수는 프로그램 시작 시에 초기화 되기 때문에
		 *객체 생성 이후의 값을 초기화 하는 인스턴스 블록의 쵝화 값으로 덮어 씌게 된다.( 맨처음에 삼성이였는데 애플로 바뀜)
		 *why? static 필드는 공유할 목적으로 사용하는거라서 미리 초기화 된 값을 덮어씌울 수 있다. 
		 */
//		brand = "애플";    
	}
	
	// <LAST STEP> static 블록! -> 클래스 변수를 초기화 시키는 블록으로 프로그램 시작 시(클래스를 사용하는 시점) 단 한 번만 실행되고 초기화된다.
	static {			// static 블록은 필드에 접근할 수 없다.
		age = 20;
		
//		name = "홍길동";  필드는 객체 생성시에만 메모리에 만들어지기 때문에 static도 없고요 그래서 초기화 안됨. **순서 공부**
//						name은 static필드가 먼저 생성이되기 때문에 그 시점에는 존재하지 않아서 초기화가 안된다. 
	}
	
	//4. 생성자를 이용한 초기화(생성자가 순서가 가장 마지막이라서 여기에서 바뀐 값으로 값이 초기화 된다.)
	public E_InitBlock() {
		phoneName = "아이폰13";
	}
	
//	getter & setter zone
	
	public String getName() {
		return name;
	}

	

	public String getPhoneName() {
		return phoneName;
	}
	
	

	public int getPrice() {
		return price;
	}



	public static int getAge() {
		return age;
	}



	public static String getBrand() {
		return brand;
	}



	
	
}
