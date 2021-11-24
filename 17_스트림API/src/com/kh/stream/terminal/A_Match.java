package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class A_Match {
	/*
	 * 매칭
	 * 	- 최종 처리 메소드이다. 결과를 true, false로 리턴한다.
	 *  - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 기능이다.
	 *  - allMatch()
	 *  	: 모든 요소들이 매개 값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
	 *  - anyMatch()
	 *  	: 최소한 한 개의 요소가 매개 값으로 주어진 Predicate의 조건을 만족하는지 조사한다. (하나라도 만족하면 true, false려면 모두 만족하지 않아야 한다.)
	 *  - noneMatch()
	 *  	: 모든 요소들이 매개 값으로 주어진 Predicate의 조건을 만족하지 않는지를 조사한다.
	 */
	
	public void method1() {
		boolean result = false;
		int[] values = {2, 4, 6};
		
		result = Arrays.stream(values).allMatch(value -> value % 2 == 0);
		System.out.println(result);  // true를 반환한다.
		
		result = Arrays.stream(values).anyMatch(value -> value % 3 == 0);
		System.out.println(result);  // true를 반환한다.
		
		result = Arrays.stream(values).noneMatch(value -> value % 5 == 0);
		System.out.println(result);  // true를 반환한다. (모든 요소들이 조건을 만족하지 않아야 true, 하나라도 만족하면 false)
		
	}
	
	
	public void method2() {
		Boolean result = false;
		List<Student> list = Arrays.asList(
				new Student("이산아", 29, "여자", 80, 70),
				new Student("이몽룡", 20, "남자", 50, 60),
				new Student("성춘향", 17, "여자", 100, 100)
		);
		
		// 나이가 20살 이상인 학생들이 모두 여자인지 확인하시오.
		result = list.stream().filter(student -> student.getAge() >= 20).allMatch(student -> student.getGender().equals("여자"));
		
		System.out.println("20살 이상인 학생들은 모두 여자입니까? " + result);
		
		// 여학생들 중에 평균이 70점 이상인 학생이 한 명이라도 존재하는지 확인하시오.
		
		result = list.stream().filter(student -> student.getGender().equals("여자")).anyMatch(student -> (student.getEnglish() + student.getMath()) / 2 >= 70);
		
		System.out.println("여학생들 중에 평균이 70점 이상인 학생이 한 명이라도 있나요? " + result);
		
		
	}

	
	
}
