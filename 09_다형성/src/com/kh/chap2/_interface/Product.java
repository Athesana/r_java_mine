package com.kh.chap2._interface;

// before의 3 클래스에서 모두 공통적으로 가지고 있는 요소(필드&메소드)만 추출하여 부모 클래스를 만들자!
public abstract class Product implements Basic, Basic2 {

	private String brand;  // 브랜드
	
	private String pCode;  // 상품 코드
	
	private String name;  // 상품명
	
	private int price;  // 가격
	
	
	public Product() {
		
	}
	
	
	public Product(String brand, String pCode, String name, int price) {
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
		return this.brand + ", " + this.name + ", " + this.pCode + ", " + this.price;
	}


	public void turnOn() {
		
		
	}
	
	
}
