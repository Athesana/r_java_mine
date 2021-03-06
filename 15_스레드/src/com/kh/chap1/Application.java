package com.kh.chap1;

import com.kh.chap1.thread.Thread1;
import com.kh.chap1.thread.Thread2;

public class Application {

	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
	
		th1.setPriority(Thread.MAX_PRIORITY); // 1~10까지 숫자를 직접 적어도 된다. 반드시 start() 메소드 호출 전에 적어야 한다.
//		th1.run();
		th1.start();
		
		Thread th2 = new Thread(new Thread2());

		th2.setPriority(Thread.MAX_PRIORITY);
		
//		th2.run();
		th2.start();
		
		// 2-1) 익명 구현 객체 : Runnable 인터페이스를 구현하는 방법 중 하나
		// [표현법]
		// - new 인터페이스() { ...구현내용...}
		// - 자바에서는 소스파일을 만들지 않고도 구현 객체를 만들 수 있는 방법을 제공하는데 그것을 익명 구현 객체라고 한다.
		// - 객체를 생성할 때 인터페이스를 직접 구현해서 객체를 생성할 수 있다.
		// - 중괄호 {...} 에는 인터페이스에 선언된 모든 추상 메소드들을 재정의해서 작성해야 한다. 
		
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
			}
			
		});
		
		th3.start();
		
		
		// 2-2) 람다식을 통한 익명 구현 객체(참고)
		
		Thread th4 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
//						Thread.sleep(5);
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		});
		
		th4.setDaemon(true);
		th4.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("메인스레드 종료");
		
	}

}
