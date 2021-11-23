package com.kh.lambda.standard;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.lambda.standard.model.vo.Student;

public class E_Predicate {

	/*
	 * Predicate
	 * 	- Predicate 함수적 인터페이스는 매개변수와 boolean 리턴 값이 있는 testXXX() 메소드를 가지고 있다.
	 * 	- 이 메소드들은 매개 값을 조사해서 true, false를 리턴하는 역할을 한다.
	 */
	
	public void method1() {
	
		Student student1 = new Student("이산아", 20, "여자", 80, 70);
		Student student2 = new Student("이몽룡", 20, "남자", 100, 90);
		
		Predicate<Student> predicate = (s) -> {
			return s.getGender().equals("여자");
		};
		
		
		System.out.println("이산아는 여자입니까?" + predicate.test(student1));
		System.out.println("이몽룡은 여자입니까?" + predicate.test(student2));
		
		
		IntPredicate intPredicate = i -> i > 100;
		
		System.out.println(intPredicate.test(100));
		System.out.println(intPredicate.test(101));
		
		
	}
	
}
