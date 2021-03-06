package com.kh.chap3.assiststream.model.vo;

import java.io.Serializable;

public class Member implements Serializable {  // private 필드라도 직렬화 해도 되는지를 명시화하는 역할만한다. -> 바이트로 직렬화, 생성자는 직렬화 안된다.

	private static final long serialVersionUID = 8034257641078435575L; // 뒤의 값은 임의라서 어떤 것이여도 상관없다.
	// 데이터만 직렬화 한다.(생성자, 메소드는 놉) byte 형태로 나열된다. 따라서 역직렬화도 필드 값들만 한다.
	private String id;   // static 적으면 id도 안 넘어간다. = 직렬화가 안된다.
	private transient String pwd;  // transient 안보여주고 싶어서 데이터 저장할 때 직렬화 안했어 
	private String name;
	private transient int age;
	private transient char gender;
	
	public Member() {
		
	}

	public Member(String id, String pwd, String name, int age, char gender) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
