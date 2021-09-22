package com.kh.chap2.sync;

public class Consumer implements Runnable {

	private Buffer buffer;
	
	public Consumer() {
	}
	
	public Consumer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {  //buffer에 있는 getdata만 가져다가 소비만 하게 만든다.
		try {
			for(int i = 1; i <= 10; i++) {
				buffer.getData();
				
				Thread.sleep(100);
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}
