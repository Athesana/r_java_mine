package com.kh.chap2;

import com.kh.chap2._class.Person;

public class Application {

	public static void main(String[] args) {

		Person islee = new Person();
		// Phone 클래스는 접근 제한이 default 클래스로 외부에서 접근이 불가능 하다. (Phone 클래스로 객체 생성 불가)
//		Phone phone = new Phone(); -> 얘도 불가능
//		com.kh.chap2._class.Phone; -> 패키지가 다르기 때문에 접근 불가능! 자동완성에 안나옴
	
		islee.setName("이산아");
		islee.setAge(20);
		islee.setPhone("갤럭시 노트10+", "그린", "삼성");
//		islee.setPhone("아이폰", "화이트", "애플"); // 호출할 떄마다 객체를 새로 만든다.
		
//		System.out.println(islee.whoAreYou());
		islee.whoAreYou();
	}
}
