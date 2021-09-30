package com.kh.object;

import com.kh.object.practice.NonStaticSample;
import com.kh.object.practice.StaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		
		System.out.print("1번 : ");
		sample.printLottoNumbers();
		
		System.out.println();
		
		System.out.print("2번 : ");
		sample.outputChar(10,'a');
		
		System.out.println();
		
		System.out.println("3번 : " + sample.alphabette());
		
		System.out.println("4번 : " + sample.mySubstring("apple", 2, 4));
		
		// StaticSample 구간
		
//		ss.toUpper();
//		<StaticSample 클래스의 필드인 value를 "apple"로 초기화 후 출력하는 역할>
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
//		<toUpper 메소드를 실행해서 출력하는 역할>
		StaticSample.toUpper();
		System.out.println("대문자 : " + StaticSample.getValue());
		
//		<valueLength>
		System.out.println(StaticSample.valueLength());
		
//		<Concat>
		System.out.println(StaticSample.valueConcat(null));
//		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));
		
//		<setChar>
		StaticSample.setChar(0, 'C');
		System.out.println("J를 C로 바꾸기 : " + StaticSample.getValue());
		
		
		
		
		
	}

}
