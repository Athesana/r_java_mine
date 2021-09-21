package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {

		Product product1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product product2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("============================================================");
		
		product1.setPrice(1200000);
		product1.setTax(0.05);
		
		product2.setPrice(1200000);
		product2.setTax(0.05);
		
		product3.setPrice(1200000);
		product3.setTax(0.05);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("============================================================");
		
		System.out.println("상품명 = " + product1.getName());
		System.out.println("부가세 포함 가격 = " + (int)(product1.getPrice() + (product1.getPrice() * product1.getTax())) + "원");
		System.out.println("상품명 = " + product2.getName());
		System.out.println("부가세 포함 가격 = " + (int)(product2.getPrice() + (product2.getPrice() * product2.getTax())) + "원");
		System.out.println("상품명 = " + product3.getName());
		System.out.println("부가세 포함 가격 = " + (int)(product3.getPrice() + (product3.getPrice() * product3.getTax())) + "원");
		
	}

}
