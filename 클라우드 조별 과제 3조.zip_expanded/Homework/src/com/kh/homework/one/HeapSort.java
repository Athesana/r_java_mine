package com.kh.homework.one;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {
	/*
	 * 힙 정렬 : 힙 트리를 통해 정렬하는 방법
	 * 
	 * - 힙 : 최솟값/최댓값을 빠르게(부모노드 vs 자식노드) 찾기 위해 완전이진트리 형태로 만들어진 자료 구조.
	 * 
	 * - 완전이진트리 
	 * 
	 *  ex) {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11}
	 * 
	 *      ->				1
	 *      				/\
	 *      			  8    35
	 *      		     /\     /\
	 *      		   67 17  4   20
	 *      		 /\   /\  /\   /\
	 *     		    23 9 36 6 19 18 3 5
	 *     			/
	 *     		   11
	 *     		
	 * 
	 * 				-> 최대 힙(max heap)			 -> 최소 힙(min heap)
	 * 						67								1
	 *      				/\							    /\
	 *      			  36   20						 6      3
	 *      		     /\     /\					    /\      /\
	 *      		   23 35  19   8				  9   8    18  4
	 *      		 /\   /\  /\   /\			    /\   /\    /\   /\
	 *     		    11 9 17 6 4 18 3 5			  11 23 36 17 35 19 20 5
	 *     			/							  /
	 *     		   1							 67
	 * 	  			:  부모노드 >= 자식노드			 :  부모노드 =< 자식노드
	 * 
	 * 
	 *  - 알고리즘의 과정 : 최대/최소힙 만들기 -> 만들어진 힙을 배열에 정렬 
	 *  
	 *  - 만들어진 힙을 배열에 입력하는 과정 
	 *  	1. root 노드의 값(최대값/최소값)을 배열에 입력 
	 *  	2. 가장 아래의 값을 root 노드 자리로 옮긴 후 다시 최대/최소힙 만들기 
	 *  	3. 새로운 root 노드의 값을 배열에 입력
	 *  	..(반복)
	 *  
	 *  
	 *  - 시간복잡도 : O(n*logn)   (n : 배열 크기) (최선, 평균, 최악 모두 동일)
	 *  - 공간복잡도 : O(n)
	 */
	
	
	
	/*
	 * 시간복잡도와 공간복잡도
	 * 
	 *  - 시간복잡도 : 알고리즘을 수행하는데 이루어지는 연산 횟수
	 * 
	 *  - 공간복잡도 : 프로그램 실행~완료까지 필요로 하는 자원 공간의 양
	 */
	
	
	
//	 1. 우선순위 큐 자료구조 이용
	public void method1() {
		
		int[] arr = new int[] {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
		
		// 기존 배열 출력
		System.out.println("기존 배열");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		// 정렬되지 않은 배열 -> 힙 구조로 변경
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// 힙에서 우선순위가 가장 높은 노드(루트노드) 뽑아 배열에 입력하기 (정렬)
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		
		System.out.println("우선순위 큐 사용 후");
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}
	
	
	
//	 2. 부모노드의 인덱스와 자식노드의 인덱스 간의 상관 관계 이용
//		 			     67
//	       				 /\
//	       			  36   20
//	       		     /\      /\
//	       		   23 35  19    8
//	       		  /\   /\  /\   /\
//	      		 11 9 17 6 4 18 3 5
//	      		/
//	      	   1
//		
//		인덱스  번호  0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15
//	    값(노드)    67 36 20 23 35 19  8 11  9 17  6   4   18  3   5   1
//		
//		
//		왼쪽 자식노드의 인덱스 = 부모노드 인덱스 * 2 + 1       
//		오른쪽 자식노드의 인덱스 = 부모노드 인덱스 * 2 + 2
//		부모노드 인덱스 = (자식노드 인덱스 - 1) / 2
	
	public void method2() {
		
		int[] arr = new int[] {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
		
		// 기존 배열 출력
		System.out.println("기존 배열");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		// 정렬되지 않은 배열 -> 최대힙	 구조로 변경
		heapify(arr, arr.length);
		
		
		System.out.println("최대힙 구조로 변경 후");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		// 만들어진 최대힙 구조를 배열의 마지막 자리부터 입력
		for(int i = arr.length - 1; i >= 0; i--) {
			swap(arr, 0, i);
			
			System.out.println("루트 노드를 마지막 인덱스의 값과 변경 후");
			System.out.println(Arrays.toString(arr));
			
			heapify(arr, i);			
			
		}
		
		System.out.println("힙 정렬 후");
		System.out.println(Arrays.toString(arr));
				
	}	
	
//	배열 -> 최대힙 구조로 변경하는 메소드
	public void heapify (int[] arr, int index) {
		
		for(int i = 1; i < index; i++) { // i = 0 : root 노드
			int child = i; 
			while(child > 0) {
				int parent = (child - 1) / 2;
				
				if(arr[child] > arr[parent]) {
					
					swap(arr, child, parent);
					
					System.out.println("최대힙 변경중..");
					System.out.println(Arrays.toString(arr));
					
				}
				child = parent;
			}
		}
	}
	
//	배열의 값끼리 자리 바꾸는 메소드
	public void swap(int[] arr, int i, int j) {
		
		int tmp = arr[i];
		
		arr[i] = arr[j];
		arr[j] = tmp;
		
		
	}
		
		
		
	}

