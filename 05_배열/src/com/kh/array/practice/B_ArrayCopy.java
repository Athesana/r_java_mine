package com.kh.array.practice;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * 배열의 복사
	 * 
	 *  - 얕은 복사 : 배열의 주소만을 복사
	 *  			origin이나 copy나 하나의 배열을 가지고 하는거니까 수정이나 복사해도 원본 배열의 값이 바뀐다. 
	 *  			원본을 수정하든 카피를 수정하든 하나의 배열만 수정된다.
	 *  - 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사
	 *  	1) 반복문을 통한 복사
	 *  	2) System.arraycopy() 메소드를 이용한 복사
	 *  		: 복사하고자 하는 배열의 인덱스와 개수를 지정하고 싶을 때 사용, 복사되는 배열을 미리 생성해서 전달해야 한다.
	 *  	3) Arrays.copyOf() 메소드를 이용한 복사
	 *  		: 복사하고자 하는 배열의 크기를 다시 지정해서 복사하고 싶을 때 사용, 복사되는 배열을 미리 생성하지 않고 배열의 크기를 전달해서 생성한다.
	 *   	4) 배열명.clone() 메소드를 이용한 복사
	 *   		: 원본 배열을 통째로 복사할 때 사용, 시작 인덱스 지정할 수 없고, 복사본 배열의 크기도 지정할 수 없다.
	 */

	public void method1() {
		// 얕은 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin;  //copy는 사실 origin의 주소값만을 가지고 있다.
		
			/*
			 * 향상된 for문
			 * 
			 * [표현법]
			 * 		for(타입변수 : 배열){
			 * 		..수행문장..
			 * 		}
			 * 
			 *  - 배열의 갯수(목록)만큼 반복을 하는데 값을 하나씩 꺼내다가 타입변수에 저장해주고 for문 안에 수행문장을 반복한다.
			 *  - 배열에서 순차적으로 꺼낸 항목을 저장할 변수 선언과 콜론(:) 그리고 배열을 나란히 작성한다.
			 *  - for 문이 처음 실행될 때 배열에서 가져올 첫 번째 갑싱 존재하면 해당 값을 변수에 저장 후 수행문장을 실행한다.
			 *  - 수행문장을 실행하면 다시 배열에서 가져올 값이 존재하면 해당 값을 변수에 저장 후 수행문장을 실행하고 다음 값이 없으면 for문 종료
			 */
			System.out.println("원본 배열 출력");
			for(int value : origin) {
				System.out.print(value + " ");
			}
			
			System.out.println("\n복사본 배열 출력");
			for(int value : copy) {
				System.out.print(value + " ");
			}
		
			copy[3] = 44;  // copy => 1, 2, 3, 44, 5 이렇게 바뀜
		
			System.out.println("\n원본 배열 출력");
			for(int value : origin) {
				System.out.print(value + " ");
			}
			
			System.out.println("\n복사본 배열 출력");
			for(int value : copy) {
				System.out.print(value + " ");
			}
		
			System.out.println("\norigin의 주소 값 : " + origin.hashCode());
			System.out.println("copy의 주소 값 : " + copy.hashCode());
			
	}
	
	
	public void method2() {
		// 1. for 문을 이용한 깊은 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];   
		// 초기 값이 0으로 들어가 있는 5개 값을 가질 수 있는 새로운 배열 생성됐다.
		// copy 배열은 새로운 배열을 참조, origin의 값을 copy 배열 안에 값을 복사해줄 것
		
		// 반복문을 통해서 origin에 있는 값들을 copy에 대입한다.
		// 향상된 for문은 value 안에 index 변수를 지정해줘야 한다. 코드 복잡! 일반 for문이 나을 때는 그냥 일반 for문 활용
//		int index = 0;
//		for(int value : origin) {
//			copy[index] = value;
//
//			index++;
//		}
		
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("\n원본 배열 출력");
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for(int value : copy) {
			System.out.print(value + " ");
		}
		
		
		
		copy[3] = 44;  // copy => 1, 2, 3, 44, 5 이렇게 바뀜
		
		System.out.println("\n원본 배열 출력");
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for(int value : copy) {
			System.out.print(value + " ");
		}
	
		System.out.println("\norigin의 주소 값 : " + origin.hashCode());
		System.out.println("copy의 주소 값 : " + copy.hashCode());
		
		
		
		
	}

	
	public void method3() {
		// 2. System 클래스에서 제공하는 System.arraycopy() 메소드를 이용한 깊은 복사
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];  //copy는 사실 origin의 주소값만을 가지고 있다.
		
//		System.arraycopy(원본 배열명, 복사를 시작할 인덱스, 복사본 배열명 , 복사본 배열의 복사 시작 위치, 복사할 길이);
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		System.out.println("\n원본 배열 출력");
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for(int value : copy) {
			System.out.print(value + " ");
		
		}
	
		System.out.println("\norigin의 주소 값 : " + origin.hashCode());
		System.out.println("origin의 길이 : " + origin.length);
		System.out.println("copy의 주소 값 : " + copy.hashCode());
		System.out.println("copy의 길이 : " + copy.length);
		
		
	}

	
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드를 이용한 깊은 복사
		int[] origin = {1, 2, 3, 4, 5};
		
		//Arrays 클래스는 배열을 이용할 때 필요한 메소드들을 제공한다.
		//Arrays.copyOf(원본 배열명, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 10);
		
		
		System.out.println("\n원본 배열 출력");
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for(int value : copy) {
			System.out.print(value + " ");
		
		}
	
		System.out.println("\norigin의 주소 값 : " + origin.hashCode());
		System.out.println("origin의 길이 : " + origin.length);
		System.out.println("copy의 주소 값 : " + copy.hashCode());
		System.out.println("copy의 길이 : " + copy.length);
		
		
	}
	
	
	public void method5() {
		// 4.clone()메소드를 이용한 깊은 복사
		// 원본 배열을 통째로 복사해서 새로운 배열을 생성(시작 인덱스 지정X, 복사본 배열 크기 지정X)
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("\n원본 배열 출력");
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println("\n복사본 배열 출력");
		for(int value : copy) {
			System.out.print(value + " ");
		
		}
	
		System.out.println("\norigin의 주소 값 : " + origin.hashCode());
		System.out.println("origin의 길이 : " + origin.length);
		System.out.println("copy의 주소 값 : " + copy.hashCode());
		System.out.println("copy의 길이 : " + copy.length);
		
		
				
				
	}
	
}





