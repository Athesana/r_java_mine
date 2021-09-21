package com.kh.chap1.encapsulation;

public class Student {
	
	//필드부(*필드*, 인스턴스 변수, 멤버 변수)
	//캡슐화를 적용시키기 위해 접근 제한자를 private으로 변경
	
	private int id;  //학번
	private String name;  //이름
	private int age;  //나이
	private String address;  //주소
	private String gender;  //성별
	private int mathScore;  //수학점수
	private int engScore;  //영어점수
	
	//생성자부
	//메소드부
	
	/*
	 * 1)getter 메소드
	 *  - 외부에서 접근이 가능해야 하기 때문에 접근 제한자를 public으로 사용한다.
	 *  - 하나의 필드의 값을 외부로 반환해 주는, 전달하는 기능을 하는 메소드이다.
	 *  - 메소드 명은 getXXX와 같이 붙여준다. (XXX = 필드 이름; 낙타 표기법으로 작성해야 한다.)
	 *  - getter 메소드는 필드에 담겨있는 값을 반환하는 역할만 하기 때문에 전달되는 매개 값이 없다.
	 *  - getter 메소드는 값을 반환해야 하기 때문에 반환하고자 하는 값의 자료형(타입)을 반환형에 써줘야한다.
	 *  
	 * 2)setter 메소드
	 *  - 검증된 유효한 값만 데이터(필드)로 저장할 수 있도록 하는 역할
	 *  - 외부에서 접근이 가능해야 하기 때문에 접근 제한자를 public으로 사용한다.
	 *  - 하나의 필드의 값을 수정하는 기능을 하는 메소드
	 *  - 메소드명은 setXXX와 같이 붙여준다. (XXX = 필드 이름; 낙타 표기법으로 작성해야 한다.)
	 *  - setter 메소드는 해당 필드의 값을 수정하기 때문에 전달되는 매개 값이 필요하다.
	 *   (단, 매개 값을 수정하려는 필드의 자료형과 동일해야 한다.)
	 *  - 필드에 대해서 값을 수정하는 메소드이므로 반환값이 없다.
	 */
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {   // 전달받은 값의 자료형과 필드의 자료형과 같아야 그 값을 넘겨줘서 필드의 값이 수정됨
		this.id = id;			  // 클래스 안에서 객체는 자기 자신을 this라고 표시함 = 필드의 값, 객체 본인의 주소 값
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address.substring(0, 3);   // 원하는 글자 갯수만 보여주게 하고 싶을 때! 0에서부터 3개 글자만 잘라서 추출
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		//검증하는 조건 추가 가능
		if(mathScore <= 0 ) {
			this.mathScore = 0;
		} else {
			this.mathScore = mathScore;
		}
	}

	public int getEngScore() {
		
		return engScore;
	}

	public void setEngScore(int engScore) {
		
		if(engScore <= 0 ) {
			this.engScore = 0;
		} else {
			this.engScore = engScore;
		}
	}
	
	public String information() {
		String info = null;
		
		//private 필드들이지만 클래스 내부에서는 직접 접근이 가능
		info = "학번 : " + this.id + ", 이름 : " + this.name + ", 수학 점수 : " + this.mathScore + ", 영어 점수 : " + this.engScore;
		
		return info;
		
	}
	
	
	
	
	
	
}
