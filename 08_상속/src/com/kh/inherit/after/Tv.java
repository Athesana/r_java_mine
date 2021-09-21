package com.kh.inherit.after;

public class Tv extends Product{

	private int inch;
	
	public Tv() {
	
	}
	
	public Tv(String brand, String pCode, String name, int price, int inch) {
//		super(brand, pCode, name, price);
		
		//super. 블라블라도 가능
		
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setName(name);
		this.setPrice(price);   // 부모는 setter는 public이라서 자식에서 접근 바로 가능
		this.setInch(inch);
//		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String information() {
	
		return super.information() + ", " + this.inch;
	}

	
	
	
	
}
