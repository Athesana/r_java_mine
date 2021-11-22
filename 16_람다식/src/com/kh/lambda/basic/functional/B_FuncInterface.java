package com.kh.lambda.basic.functional;

@FunctionalInterface
public interface B_FuncInterface {
	// 매개변수가 있고 반환값이 없는 추상 메소드를 만들어보자. 
	// 무조건 하나 이상의 추상 메소드가 있어야 하는데 아무것도 없이 어노테이션부터 달면 에러 발생
	
	public void method(int a);
}
