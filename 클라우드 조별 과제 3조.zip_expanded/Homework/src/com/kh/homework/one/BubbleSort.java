package com.kh.homework.one;

import java.util.Arrays;

public class BubbleSort {

	/* [정렬 알고리즘]
	 *  <버블 정렬>
	 * 
	 *  1) 정의
	 *  - 두 개의 인접한 원소(레코드)를 검사하여 정렬하는 방법이다.
	 *  - 인접한 두 개의 레코드 키 값을 비교하여 그 크기에 따라 레코드 위치를 서로 교환하는 오름차순 정렬 방식
	 *  
	 *  - 레코드가 N개면, N-1번 회전하며 오름 차순으로 정렬된다.
	 *  - 1회전 시, 첫 번째와 두 번째 레코드를 비교하고, 두 번째와 세 번재 레코드를 비교, 세 번째와 네 번째 레코드를 비교...
	 *    마지막-1 번째 레코드와 마지막 레코드를 비교하여 작은 값이 앞으로, 큰 값이 뒤로 위치하게 정렬한다.
	 *  - 마지막으로 정렬된 레코드는 가장 큰 값이다.
	 *  - 정렬된 레코드는 그 다음 회전 정렬에서 제외된다.
	 *  - 2회전 하면 두 번째로 값이 큰 레코드가 끝에서 두번째 자리에 정렬되고, 3회전 부터는 정렬에서 제외된다.
	 *  - 나머지도 같은 방식으로 진행된다.
	 *  - 점차 비교 대상이 줄어드는 방식이다.
	 * 
	 *  -> 시간 복잡도가 상당히 느린 편이지만, 코드가 단순하기 때문에 자주 사용된다.
	 *  -> 그러나 비교할 데이터의 수가 많아질수록 성능이 저하된다.
	 *  
	 *  장점)
	 *  - 구현이 매우 간단하다.
	 *  - 소스 코드가 직관적이다.
	 *  - 안정 배열, 제자리 배열이다. (다른 메모리 공간을 필요로 하지 않는다.)
	 *  
	 *  단점)
	 *  - 특정 레코드가 최종 정렬 결과에 맞는 위치에 있더라도 교환이 일어날 수 있고, 
	 *    교환되지 않더라도 배열의 원소 갯수만큼 비교가 일어나기때문에 속도가 느리다.
	 * 
	 * 예시)
	 *  [8, 3, 7, 5, 4, 2]
	 * 1회전 : 3 8 7 5 4 2 
	 *		  3 7 8 5 4 2
	 * 		  3 7 5 8 4 2 
	 * 		  3 7 5 4 8 2
	 *        3 7 5 4 2 8
	 *        
	 * 2회전 : 3 7 5 4 2 8    
	 *        3 5 7 4 2 8
	 *        3 5 4 7 2 8 
	 *        3 5 4 2 7 8 
	 *        
	 * 3회전 : 3 5 4 2 7 8 
	 *        3 4 5 2 7 8 
	 *        3 4 2 5 7 8 
	 *        
	 * 4회전 : 3 4 2 5 7 8 
	 *        3 2 4 5 7 8
	 *        
	 * 5회전 : 2 3 4 5 7 8 
	 * 
	 */

	/*
	 *  2) 코드
	 */

	//첫 번째 방법

	public void method1() {
		
		int[] arr = new int[] {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
		int temp = 0;
		
		//outer루프 회전마다 요소 하나의 최종 위치가 확정
		for(int i = 0; i < arr.length - 1; i++) { 
		// 정렬 완료된 원소에 대해서 비교할 필요가 없기 때문에 'arr.length - i', why? 뒤에서부터 집합의 크기를 하나씩 감소하기 때문
			for(int j = 1; j < arr.length - i; j++) {  
			
			//arr[j]위치와 arr[j-1]의 값의 크기를 비교해서 앞쪽의 값이 크기가 크다면 뒤로 바꿔주는 교환 작업을 반복한다.
				if(arr[j] < arr[j-1]) {      
					temp = arr[j-1];		 
					arr[j-1] = arr[j];		
					arr[j] = temp;			 
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	
	
	// 두 번째 방법(연산 수행 횟수까지 카운트해보자)
	
	public static void method2() {

        int[] arrays = {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};

        System.out.println(Arrays.toString(bubbleSort(arrays)));
    }

    static int[] bubbleSort(int[] arr) {
        // 임시 저장용도
        int temp = 0;
        // 연산 횟수 카운트 용도
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
        		// 점차 실행 될때마다 마지막 항은 제일 큰 값이므로 연산하지 않는다.
            for (int j = 1; j < arr.length - i; j++) {
                // 이전 인덱스가 현재 인덱스보다 값이 큰 경우, 교환이 발생한다.
                if (arr[j - 1] > arr[j]) {
                    // temp에 이전 인덱스 값 저장한다.
                    temp = arr[j - 1];
                    // 현재 값 이전 인덱스로 교환한다.
                    arr[j - 1] = arr[j];
                    // 이전 값 현재 인덱스로 교환한다.
                    arr[j] = temp;
                }
                
                // 연산 횟수 카운트
                count++;
            }
        }

        System.out.println("연산 수행 횟수는 : " + count);
        return arr;
    }
	


	/*
	 *  3) 시간 복잡도(특정 알고리즘이 어떤 문제를 해결하는데 걸리는 시간)
	 *  - 최악 시간 복잡도 : O(n²) 비교, O(n²) 교환
	 *  - 평균 시간 복잡도 : O(n²) 비교, O(n²) 교환
	 *  - 최선 시간 복잡도 : O(n²) 비교, O(1) 교환
	 *  - (n-1) + (n-2) + (n-3) + .... + 2 + 1 => n(n-1)/2
	 *  
	 *  - 버블 정렬은 중간에 정렬이 완료되었더라도 마지막 회차까지 2개의 요소를 비교하기 떄문에 O(n²) 최악, 평균, 최선 모두 복잡도가 똑같다.
	 *  
	 * 삽입 정렬이나 선택 정렬과 같은 시간복잡도를 갖지만, 바로 옆 요소와 자리 교환을 하면서 정렬하기 때문에 거품 정렬의 교환 횟수가 평균적으로 더 많기 때문에
	 * 실질적으로는 삽입, 선택 정렬보다 더 많은 시간이 걸린다. 가장 비효율적인 방법.
	 */
	
	
	/*
	 *  4) 공간 복잡도(작성한 프로그램이 얼마나 많은 공간(메모리)를 차지하느냐를 분석하는 방법)
	 * - 공간 복잡도 : O(1) 
	 *   주어진 배열 안에서 교환(swap)을 통해 정렬이 수행된다.
	 */
		
	
	
	
}
