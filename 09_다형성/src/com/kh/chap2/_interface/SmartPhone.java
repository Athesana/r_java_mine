package com.kh.chap2._interface;

public class SmartPhone extends Product {

	private String mobileAgency;  // 통신사
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);  // super 생략해도 되는대 대신에 부모의 기본생성자는 반드시 있어야 한다.
	
		this.mobileAgency = mobileAgency;
	}

	
	
	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String information() {
		
		return super.information()  + ", " + this.mobileAgency;
	}

	
	@Override
	public void turnOn() {
		System.out.println("SmartPhone을 켭니다.");	
		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartPhone을 끕니다.");
		
	}
	
	
}
