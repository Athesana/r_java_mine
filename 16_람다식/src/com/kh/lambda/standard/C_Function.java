package com.kh.lambda.standard;

import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.lambda.standard.model.vo.Student;

public class C_Function {

	/*
	 * Function
	 * 	- Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	 * 	- 주로 매개값을 리턴 값으로 매핑(타입 변환)하는 역할을 한다. 
	 * 	- T : 매개변수의 타입으로 지정, R : 리턴 타입으로 지정 되는 2개의 매개 변수를 받는다.
	 */
	
	public void method1() {
		Student student = new Student("이산아", 20, "여자", 80, 90);
//		Function<Student, String> function = (Student s) -> {
//			return "1";
//		};
		
		Function<Student, String> function = s -> s.getName();
		System.out.println("넌 이름이 뭐니? : " + function.apply(student));
		
		System.out.println("[수학점수] : ");
		printInt((s -> {return s.getMath();}), student);
		
		System.out.println("[영어점수] : ");
//		printInt(s -> s.getEnglish(), student);
		printInt((s) -> s.getEnglish(), student);
		
		System.out.println("[평균점수] : ");
		printInt((s) -> (s.getEnglish() + s.getMath()) / 2, student);
		
	}
	
	public void printInt(ToIntFunction<Student> function, Student student) {
		System.out.println(function.applyAsInt(student));
		
	}
	
	
	
}
