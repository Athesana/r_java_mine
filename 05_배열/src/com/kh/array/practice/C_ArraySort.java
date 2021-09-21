package com.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {

	public void method1() {
		
		int[] arr = {2, 5, 7, 1, 3};
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println();

		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		// 내림차순으로 정렬
//		1. for문을 사용해서 원본 배열(오름차순으로 정렬 된)의 값을 반대로 새로운 배열에 대입한다.
//		2. 아래와 같이 작성하는 방법이 있으나 추후 설명 후 다시 기재
		Integer[] integerArray = {2, 5, 7, 1, 3};
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		System.out.println();
		System.out.println(Arrays.toString(integerArray));
	}

	public void method2() {
		
		String[] strArray = {"apple", "orange", "banana", "메론", "레몬"};
		
		// 오름차순으로 정렬 (유니코드 기준)
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		
		
		// 내림차순으로 정렬
		Arrays.sort(strArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(strArray));
		
	}
	
	/*
	 *  과제)
	 * 		<정렬 알고리즘 정리>
	 * 
	 * 삽입정렬, 버블정렬, 선택정렬, 퀵정렬, ...
	 * 
	 * 시간 복잡도, 공간 복잡도 각각 정리하기
	 * 
	 * 1) 정의 2) 코드(실행되는 것) 3) 시간복잡도 어느 정도인지 4) 공간복잡도 정리
	 * 
	 * 
	 */
	
}
