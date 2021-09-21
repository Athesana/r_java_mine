package com.kh.inherit.after;

// before의 3 클래스에서 모두 공통적으로 가지고 있는 요소(필드&메소드)만 추출하여 부모 클래스를 만들자!
public class Product {

	private String brand;  // 브랜드
	
	private String pCode;  // 상품 코드
	
	private String name;  // 상품명
	
	private int price;  // 가격
	
	
//	*상속에서 기본 생성자 반드시 있어야 한다.
	public Product() {
		System.out.println("부모 객체 기본 생성자");
	}
	
	
	public Product(String brand, String pCode, String name, int price) { // 먼저 실행
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}


	
	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getpCode() {
		return pCode;
	}



	public void setpCode(String pCode) {
		this.pCode = pCode;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}


// 우리가 호출하고 있는 부분
	public String information() {
		return this.brand + ", " + this.name + ", " + this.price;
	}
	
	
}
