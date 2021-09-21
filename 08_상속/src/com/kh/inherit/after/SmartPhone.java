package com.kh.inherit.after;

public class SmartPhone extends Product {

	private String mobileAgency;  // 통신사
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);  // super 생략해도 되는대 대신에 부모의 기본생성자는 반드시 있어야 한다.
										  // 이 부분이 생략되면 부모의 기본 생성자가 호출되고 그마저도 없으면 에러난다. 그리고 기본생성자가 호출되면 JVM이 설정한 기본값으로 출력됨
	
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
	
	
}
