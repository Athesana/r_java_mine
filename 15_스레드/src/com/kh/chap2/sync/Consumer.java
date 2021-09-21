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
	public void run() {
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
