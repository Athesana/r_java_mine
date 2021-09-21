package com.kh.chap2._abstract;

public abstract class Sports {

	// 각 종목에 참여하는 사람의 수
	private int numberOfPlayers;
	
	public Sports() {

	}

	//매개 변수를 갖는 생성자
	public Sports(int numberOfPlayers) {
		super();
		this.numberOfPlayers = numberOfPlayers;
	}

	//getter setter
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	
	public abstract void rule();  // 추상메소드! 몸체가 없다. 각 스포츠를 상속하는 자식들이 반드시 상속, 정의해야 한다.( 각 스포츠마다 그에 따른 룰을 반드시 정의해야 된다.)
	
	
}
