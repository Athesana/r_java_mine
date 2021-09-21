package com.kh.chap4.constructor;


/*
 * 생성자
 * 
 * [표현법]
 * 
 * 		[접근 제한자] 클래스명([매개변수]) {
 * 		... 필드를 초기화하거나, 객체를 사용할 준비 ...
 * 		}
 * 
 * - 생성자는 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다.(필드 초기화 or 객체 사용할 준비)
 * - 생성자 작성 시 주의사항
 * 	 생성자 명은 반드시 클래스 명과 동일해야 한다.
 * 	 반환형이 존재하지 않는다. (메소드와 헷갈리지 않게 주의해서 사용 할 것)
 *   매개 변수가 있는 생성자를 작성하게 되면 기본 생성자를 JVM이 자동으로 만들어주지 않는다.
 *   (즉, 기본 생성자는 항상 기본으로 작성하는 습관을 들여야 한다.)
 */

public class User {

	private String id;
	
	private String pwd;
	
	private String name;
	
	private int age;
	
	private char gender;
	
//	=====여기까지는 필드=======
	
	// 객체 생성의 목적으로만 사용되고 존재하는 생성자로써 매개변수가 없는 기본 생성자
	public User() {
		System.out.println("기본 생성자 호출");   
	}
	
//	 생성자를 private으로 선언하면 외부에서 절대로 객체를 생성할 수 없다.
//	  클래스 내부에서만 생성자를 호출할 수 있고, 객체를 생성할 수 있다.
//	private User() {
//		
//	}
	
	// 매개 변수가 있는 생성자(아이디, 패스워드, 이름)
	// 객체 생성과 동시에 전달된 값들을 매개변수로 받아서 필드를 초기화하는 목적으로 사용된다.
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	// 매개 변수가 있는 생성자(아이디, 패스워드, 이름, 나이, 성별)
	public User(String id, String pwd, String name, int age, char gender) {
		//클래스 내에서 문자열 매개 변수 3개를 가지는 생성자가 존재하기 때문에 this(...)를 통해서 생성자 호출이 가능하다.
		this(id, pwd, name);  // <-기본 생성자 호출, ()매개변수가 있는 생성자한테 그대로 다시 전달해서 이미 만들어져있는 로직을 수행하고
		 					  // 위치는 항상 첫 라인에 적어야 한다. 
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;    // 위에 3개는 중복되어서 이미 값이 초기화 되어있다. 초기화 안된 나머지 2개 매개 변수만 여기에서 초기화
		this.age = age;
		this.gender = gender;
	}

//	======여기부터는 메소드======
	
	public String information() {
//		this(); (X) // 생성자 안에서만 호출할 수 있기 때문에 메소드 와서 첫줄에 적는다고 해도 에러가 발생한다.
		return this.id + ", " + this.pwd + ", " + this.name + ", " + this.age + ", " + this.gender;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
