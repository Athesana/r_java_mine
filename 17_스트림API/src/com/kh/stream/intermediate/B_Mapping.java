package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class B_Mapping {

	/*
	 * 매핑
	 * 	- 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다.
	 * 		- mapXXX()			: 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다.
	 * 		- flatMapXXX() 		: 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성한다.
	 * 		- asDoubleStream()	: IntStream, LongStream -> DoubleStream으로 변환해서 리턴해주는 메소드
	 * 		- asLongStream()	: IntStream, LongStream -> LongStream으로 변환해서 리턴해주는 메소드
	 * 		- boxed()			: int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성한다.
	 */
	
	// mapXXX()
	public void method1() {
		List<Student> list = Arrays.asList(
				new Student("이산아", 20, "여자", 80, 70),
				new Student("이몽룡", 20, "남자", 50, 60),
				new Student("성춘향", 20, "여자", 100, 100)
		);
		
//		list.stream().map((student) -> {
//			return student.getName();
//		}).forEach((name) -> {System.out.println(name);});
		
		list.stream().map(student -> student.getName())
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		double avg = list.stream().mapToInt(student -> student.getMath()).average().getAsDouble();
		
		System.out.println("수학 점수의 평균 : " + avg);
		
	}
	
	// flatMapXXX()
	public void method2() {
		List<String> list = Arrays.asList("Java11 Lambda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(str -> System.out.println(str));
		
		System.out.println();
				
		list.stream()
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(str -> System.out.println(str));
		
	}
	
	
	// asDoubleStream(), asLongStream(), boxed()
	public void method3() {
		int[] array = {1, 2, 3, 4, 5};
		
		Arrays.stream(array).asDoubleStream().forEach(value -> System.out.println(value));
		// 바꿔도 원본 배열에는 영향을 미치지 않는다.
		
		System.out.println();
		
		Arrays.stream(array).boxed().forEach(value -> System.out.println(value.intValue()));
//		기존의 정수 값이 타입 파라미터가 Integer인 객체로 랩핑되어서 바뀐다.
		
	}
	
	
	
}
