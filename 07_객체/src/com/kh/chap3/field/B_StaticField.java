package com.kh.chap3.field;

public class B_StaticField {

	// static 키워드가 붙은 필드는 프로그램 실행하자마자 static 메모리 영역에 할당(프로그램 종료시 소멸)
	// static 필드는 객체로 생성하지 않아도 클래스 명을 통해서 접근 가능
	// 즉, 객체가 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 변수라고 한다.
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	
	// static 생략도 가능하지만 생략하면 applicaiton 클래스에서 객체를 생성해야한다.
	// static 필드에 대한 getter/setter 메소드 또한 static 키워드를 붙여서 만들어 줘야 한다.

	public static String getPriSta() {
//		return this.prista; -> 에러 why? this는 객체를 가르키는 참조인데 static은 객체가 없으니까 접근이 안되고 this 사용 불가!
		return priSta;
	}
	
	public static void setPriSta(String priSta) {
	// this.priSta = priSta; -> 에러 why? this는 객체 자기 자신을 가르키는데 static은 객체를 생성하지 않고 클래스명으로 접근 가능하기 때문에
//						객체를 생성하지 않고 클래스명으로 접근, 즉 객체를 생성하지 않아서 this는 존재하지 않는다.
		B_StaticField.priSta = priSta;
	}
	
	

	
	
	
}
