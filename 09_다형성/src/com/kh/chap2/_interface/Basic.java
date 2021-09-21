package com.kh.chap2._interface;

public interface Basic {
	//인터페이스에서 필드는 무조건 상수 필드이다.
	/* public static final */ int NUM = 10;
	
	// 인터페이스에서 메소드는 무조건 추상 메소드이다.
	/* public abstract */ void turnOn(); // {} 몸체가 없고 생략해야된다. 쓰면 에러
	/* public abstract */ void turnOff();
	
	
	
	
}
