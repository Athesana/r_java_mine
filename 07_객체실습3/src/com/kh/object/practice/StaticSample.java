package com.kh.object.practice;

public class StaticSample {
/* 
 * <접근 제한자의 종류>
 * 
 * private = 비공개 
 * default = 패키지 공개
 * protected = 상속 공개
 * public =  완전 공개
 * 
 * <내가 푼 것 - 하지만 문제에서 각 메소드에서 출력문은 조냊하지 않고, 테스트 출력은 main 함수에서 value에 접근하여 출력하라고 해서 정상 작동이지만 다르게 생각해야한다.>
	private static String value = "";
	
	public static void toUpper() {
		String str = new String("Java");
		System.out.println(str.toUpperCase());
		
	}
*/	
	private static String value;
	
	
	public static String getValue() {
		return value;
	}
	
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {
		value = value.toUpperCase();
	}
	
	
	public static void setChar(int index, char c) {
		
		char[] cArr = value.toCharArray();
		
		cArr[index] = c;
		
		value = String.valueOf(cArr);
	
	}
	
	
	public static int valueLength() {
		return value.length();
		
	}	
	
	public static String valueConcat(String str) {
		return value.concat("PROGRAMMING");
//		return value + str;
	}
	
	
	
}	
