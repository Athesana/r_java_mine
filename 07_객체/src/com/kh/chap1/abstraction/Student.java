package com.kh.chap1.abstraction;

/*
 * 클래스의 구조
 * 
 * [접근 제한자] [예약어] class 클래스명 {  // class에서 접근 제한자는 public, dafault만 가능
 *    1) 필드부 (객체의 속성을 정의)	   // 필드에서 접근 제한자는 4가지 모두 가능, 예약어는 static, final이 가능
 * 		[접근 제한자] [예약어] 자료형 필드명 [=초기값(생략가능)];
 * 		...
 * 
 *    2) 생성자부
 * 		[접근 제한자] 클래스명([매개변수]) {
 * 		... 필드를 초기화하거나, 객체를 사용할 준비 ...
 * 		}
 * 
 *    3) 메소드부 (객체의 기능을 정의)	// 메소드에서 접근 제한자 4가지 모두 가능
 * 		[접근 제한자] [예약어] 반환형 메소드명([매개변수]) {
 * 		... 기능 구현 코드; ...
 * 		[return] [반환값];
 * 		}
 * }
 * 
 *  - 접근 제한자 : 외부에서 접근할 수 있는 범위를 제한할 수 있다.
 * 				private(-) < default(~) < protected(#) < public(+)
 * 				private으로 갈수록 접근 제한이 강화된다.
 */


public class Student {

	// 필드부 -> 내가 프로그램에서 필요한 속성들만 추출 = 추상화
	public int id;
	public String name;
	public int age;
	public String address;
	public String gender;
	public int mathScore;
	public int engScore;
	
	// 생성자부
	
	// 메소드부
	
	
	
	
	
	
	
}
