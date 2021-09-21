package com.kh.chap2._class;

/*
 * 클래스에서 사용 가능한 접근 제한자
 * 
 * 1. public
 *  - 동일한 패키지뿐만 아니라 다른 패키지에서도 아무런 제약 없이 사용할 수 있다.
 * 2. default
 *  - 클래스 선언 시에 public을 생략했다면 default 접근 제한자을 가진다.
 *  - 동일한 패키지에서는 아무런 제약 없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없도록 접근이 제한된다.
 */

public class Person {

	private String name;
	private int age;
	
	// Phone 클래스는 접근 제한이 default라서 같은 패키지 안에 있기 때문에 Person 안에서 Phone은 객체로써 생성 가능 
//	private Phone phone = new Phone();  // 가능하다 -> phone을 정해놓고 값만 바뀐다.
	private Phone phone;  // -> 값이 바뀔 때마다 phone 객체를 새로 만들어서 값이 나온다.
	
	
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public int getAge() {
//		return age;
//	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	
	//두번째 방법
	public void setPhone(String name, String color, String brand) {
		this.phone = new Phone();
		
		phone.setName(name);
		phone.setColor(color);
		phone.setBrand(brand);
	}
	
	
//	public String whoAreYou() {
//	return "안녕하세요. 저는 " + this.name + "입니다. 나이는 " + this.age + "세 입니다."; //-> getter 역할해서 getter메소드 생략가능
//	}

	
	public void whoAreYou() {
		
		System.out.println("안녕하세요. 저는 " + this.name + "입니다. 나이는 " + this.age + "세 입니다.");
		System.out.println("저는 " + phone.getBrand() + " 브랜드의 " + phone.getColor() + " 색상의 " + phone.getName() + "을 가지고 있습니다.");
//		return ; //-> getter 역할해서 getter메소드 생략가능
	}

	
}
