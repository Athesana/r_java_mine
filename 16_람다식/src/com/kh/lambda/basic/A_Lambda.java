package com.kh.lambda.basic;

public class A_Lambda {
	
	public void method1() {
	
		Thread thread;
		
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");
				
			}
		});
		
		/*
		 * [스레드 생성 방법]
		 * 1. 스레드 클래스를 상속하는 클래스를 만들고 실행시킨다. 
		 * 2. Runnable() 인터페이스를 구현해서 클래스를 만들고 스레드 객체를 생성할 때 구현 클래스를 객체로 넘겨준다.
		 * 3. 한 번만 사용하는, 클래스를 만들 필요가 없다면 Runnable() 인터페이스를 익명 구현 객체로써 사용한다. 
		 */
		
		/* 
		 * 스레드는 Runnable()을 구현하는데 여기에는 run() 추상메소드 1개만 있다. 
		 * 따라서 run() 메소드랑 람다식 표현 모양이 동일해야한다. (매개값, 반환값)

		 * 익명 구현 객체를 만들어서 람다식을 사용하면 넘겨준다.
		 * 밑에서 람다식을 통해서 Runnable() 인터페이스를 이어받으려면 타입도, 매개변수도 리턴 유무도 동일해야 한다.
		 */
		
		thread.start();
		
		thread = new Thread(() -> {
			System.out.println("람다식을 이용한 Thread 생성");
		});
		
		thread.start();
		
		
		
		
		
		
		
	}
}
