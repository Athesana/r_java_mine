package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Filtering {

	/*
	 * 필터링
	 * 	- 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 * 		distinct() : 중복을 제거하는 메소드, Stream의 경우 Object.equals()가 true를 리턴하면 동일 객체로 판단한다.
	 * 		filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다. (요소 별로 람다식을 태워서 하나하나 판단한다.)
	 */
	
	// 중복 제거
	public void method1() {
		List<String> names = Arrays.asList("이산아", "이몽룡", "성춘향", "이산아", "성춘향", "변사또");
		Stream<String> stream = names.stream();
		
		stream.forEach(str -> System.out.print(str + " "));
		
//		stream.forEach(str -> System.out.print(str + " "));
		// 이미 최종 처리 메소드 forEach로 closed 된 스트림은 다시 호출하려고 하면 에러 발생한다. (컬렉션(배열)로부터 다시 스트림을 얻어와야 한다.)
		
		System.out.println();
		names.stream().distinct().forEach(str -> System.out.print(str + " "));
//		distinct() = 중간 처리 메소드들은 메소드를 실행하고, 그 요소를 가지고 새로운 스트림을 만들어서 리턴해준다. 리턴값이 new stream임
//		그래서 메소드들을 이어서 사용할 수 있는 것이다. 
//		a.k.a 스트림 파이프라인이라고 한다 = 어떤 한 단계에서 처리되서 나온 결과값이 다음 연산(작업)의 입력으로 사용 되는 것

	}
	
	
	// 필터링
	public void method2() {
		List<String> names = Arrays.asList("이산아", "이몽룡", "성춘향", "이산아", "성춘향", "변사또", "이순신");
		
		names.stream().filter(name -> name.startsWith("이")).forEach(name -> System.out.println(name));
		
		System.out.println();
		
		names.stream().distinct().filter(name -> name.startsWith("성")).forEach(name -> System.out.println(name));
		
	}
	
	
	
}
