package com.kh.chap2.sync;

public class Buffer {

	private int data;
	
	// 플래그 변수 (객체의 상태를 저장하고 흐름을 제어하기 위한 변수) -> 상품이 비었냐고 물어보는 것
	// 버퍼의 상태를 가지고 있다가 버퍼가 비어있을 때 = 데이터가 없으면 set 메소드 호출 = 소비하려고 하면 소비하지 못하게 제어하고
	// 비어있지 않으면 get 메소드 호출하되, 또 생산하지 못하게 set 메소드를 제어한다.
	private boolean empty = true;
	
	/*
	 * Synchronized 
	 *  - 동기화 메소드, 동기화 블럭에 사용되는 키워드
	 *  - 동기화 메소드 선언에 synchronized 키워드를 붙인다. (인스턴스, 정적 메소드 어디든 사용이 가능하다.)
	 *  - 동기화 메소드는 스레드가 메소드를 실행하면 동기화 된 메소드 전체에 즉시 락을 걸고 메소드가 종료되면 락이 풀린다.
	 *  - 메소드 전제차 아니라 일부 내용만 락을 걸고 싶다면 동기화 블록을 만들면 된다. (synchronized(공유 객체(this)) { ... }) 
	 */
	public synchronized void getData() {
		
		while(empty) {	// empty 상태(비어있으면) 정지시킬게 // set에서 false로 되어있기 때문에 반복문을 빠져나오고 syso 출력된다.
			try {		// wait가 풀리면 여기서부터 다시 실행
				wait();  // 동기화 메소드 안에서 wait 메소드가 실행되면 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다. (사용 중인 상태)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.empty = true; // 소비했으니까 비어있다고 데이터의 상태를 바꿔줘야 set 구문이 실행됨
		
		System.out.println("소비자가 " + this.data + "번 상품을 소비하였습니다.");
		notify(); // wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
	}
	
	public synchronized void setData(int data) {
		
		while(!empty) {  // 데이터가 생산이 되어있을 때는 실행을 정지시킬거라서 false인지를 확인
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;  // 데이터를 set 함
		this.empty = false;  // 플래그 변수도 바꿔줘야 한다. 데이터의 상태를 바꿈. 안바꾸면 get의 while(empty)는 계속 true 상태인 것
		
		System.out.println("생산자가 " + data + "번 상품을 생산하였습니다.");
		notify();  // wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
		
	}
	
}
