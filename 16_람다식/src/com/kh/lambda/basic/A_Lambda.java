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
		
		/* Runnable() 인터페이스에는 run() 메소드 하나만 있고
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
