package com.kh.object.practice;

public class Product {

	private String id;   // 상품 아이디
	private String name; // 상품명
	private String site; // 생산지
	private int price;  // 가격
	private double tax;  // 부가세비율
	
	
	
	public Product() {
	}

	
	
	public Product(String id, String name, String stie, int price, double tax) {
		super();
		this.id = id;
		this.name = name;
		this.site = stie;
		this.price = price;
		this.tax = tax;
	}
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	
	
	public String information() {
		return this.id + ", " + this.name + ", " + this.site + ", " + this.price + ", " + this.tax;
	}
	
	
}
