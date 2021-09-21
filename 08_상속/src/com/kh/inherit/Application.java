package com.kh.inherit;

import com.kh.inherit.after.Desktop;
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.after.Tv;
import com.kh.inherit.override.Book;

public class Application {

	public static void main(String[] args) {
		// Desktop 객체 생성
		Desktop desktop = new Desktop("LG", "a1111", "화이트27인치", 200000, true);
		
		// SmartPhone 객체 생성
		SmartPhone phone = new SmartPhone("삼성", "b2222", "갤럭시노트10+", 1000000, "LG U+");
		
		// Tv 객체 생성
		Tv tv = new Tv("LG", "T01", "올레드 벽걸이 tv", 2500000, 75);
		
		// 출력
		System.out.println(desktop.information());
		System.out.println(phone.information());
		System.out.println(tv.information());
		System.out.println();
		
		
		//오버라이딩 테스트
		Book book1 = new Book("자바의 정석", "이산아", 3000);
		Book book2 = new Book("자바의 정석", "이산아", 3000);
		
		//toStirng()테스트
		System.out.println(book1);
//		System.out.println(book.toString());
		System.out.println();
		
		//equals()테스트
		System.out.println("book1과 book2가 같은 책 입니까? " + (book1 == book2));
		System.out.println("book1과 book2가 같은 책 입니까? " + book1.equals(book2));
		
		//hashCode() 메소드 테스트
		System.out.println("book1의 해시코드 : " + book1.hashCode());
		System.out.println("book2의 해시코드 : " + book2.hashCode());
		
		
		
	}

}
