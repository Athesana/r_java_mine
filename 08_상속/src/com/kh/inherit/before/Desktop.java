package com.kh.inherit.before;

public class Desktop {
	private String brand;  // 브랜드
	
	private String pCode;  // 상품 코드
	
	private String name;  // 상품명
	
	private int price;  // 가격
	
	private boolean allInOne;  // 일체형 여부
	
//	기본 생성자 이제 필수로 그냥 만들기 ctrl+space bar해서 클래스 이름의 Consturctor 만들면 된다.
	public Desktop() {

	}
// 매개 변수 있는 생성자 만들기 alt + shift + s -> generate constructor using fields;
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
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

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return this.brand + ", " + this.name + ", " + this.price + ", " + this.allInOne;
	}
	
	
}
