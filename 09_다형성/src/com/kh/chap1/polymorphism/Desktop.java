package com.kh.chap1.polymorphism;

import com.kh.chap2._interface.Basic;

public class Desktop extends Product implements Basic {

	private boolean allInOne;  // 일체형 여부
	
	public Desktop() {
		
	}
	
	
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) { 
		super(brand, pCode, name, price);
		this.allInOne = allInOne; 
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {
		return super.information() + ", " + this.allInOne;
	}


	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
