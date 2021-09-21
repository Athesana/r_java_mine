package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {

		Book book = new Book();
		System.out.print(book.information());
		System.out.println();
		
		Book book2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(book2.information());
		
		System.out.println("========================================");
		System.out.println("수정된 결과 확인");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println(book.information());
		
		System.out.println("========================================");
		
		System.out.println("도서명 = " + book.getTitle());
		System.out.println("할인된 가격 = " + (int)(book.getPrice() - (book.getPrice() * book.getDiscountRate())) + "원");
		System.out.println("도서명 = " + book2.getTitle());
		System.out.println("할인된 가격 = " + (int)(book2.getPrice() - (book2.getPrice() * book2.getDiscountRate())) + "원");
		
		
		
	}

}
