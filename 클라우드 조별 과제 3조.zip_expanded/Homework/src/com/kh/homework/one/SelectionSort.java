package com.kh.homework.one;

import java.util.Arrays;

public class SelectionSort {
	
	/*
	 * ※정렬 알고리즘?
	 * - 정렬 알고리즘은 n개의 숫자가 입력으로 주어졌을 때,
	 *   이를 사용자가 지정한 기준에 맞게 정렬하여 출력하는 알고리즘이다.
	 * 
	 * 
	 * ※선택정렬
	 * - 선택정렬은 이름에 맞게 현재 위치에 들어갈 값을 찾아 정렬하는 배열이다.
	 *   현재 위치에서 저장될 값의 크기가 작은지, 큰지에 따라 
	 *   최소선택정렬(작은 값부터 오름차순) 최대선택정렬(큰 값부터 내림차순)으로 구분할 수 있다.
	 *   
	 * - 해당 위치를 선택하고 그 순서에 넣을 값을 찾는 알고리즘이며,
	 *   입력 배열 이외에 다른 추가 메모리를 요구하지 않는 제자리정렬이다.
	 *     
	 *     
	 * ※ 선택정렬의 실행 과정(기본로직)
	 *   1) 정렬되지 않은 인덱스(위치) 맨 앞의 값부터 그 이후의 배열값 중 가장 작은(큰) 값을 찾아간다.
	 *   2) 가장 작은(큰) 값을 찾으면 그 값을 인덱스의 값과 바꿔준다.
	 *   3) 다음 인덱스에서 위 과정을 반복하여 하나의 값을 고정시킨다.
	 *   
	 * ※ 선택정렬의 시간복잡도
	 * 
	 * - 데이터의 개수가 n개라고 했을 때,
	 *   첫 번째 회전에서의 비교횟수 : 1 ~ (n-1) -> n-1
	 *   두 번째 회전에서의 비교횟수 : 2 ~ (n-1) -> n-2
	 *    ... 
	 *   (n-1) + (n-2) + ... + 2 + 1 -> n(n-1)/2
	 *   
	 *   비교하는 것이 상수 시간에 이루어진다는 가정 하에,
	 *   n개의 주어진 배열을 정렬하는 데 O(n^2)만큼의 시간이 걸린다.
	 *   최선, 평균, 최악의 경우 시간복잡도는 O(n^2)으로 동일하다.
	 *   
	 * ※ 선택정렬의 공간복잡도
	 * 
	 * - 주어진 배열 안에서 교환(swap)을 통해 정렬이 수행되므로 O(n)이다.
	 *  
	 * ※ 선택정렬의 장단점
	 * - 장점
	 *   : 알고리즘이 단순하다.
	 *     정렬을 위한 비교횟수는 많지만, 실제로 교환하는(값을 재정렬 시키는) 횟수는 적기 때문에
	 *     많은 교환이 일어나야 하는 자료상태에서는 비교적 효율적이다.
	 *     
	 *     배열 안에서 교환하는 제자리 정렬 이므로, 다른 메모리 공간을 필요로 하지 않는다.
	 * - 단점
	 *   : 시간복잡도가 O(n^2)으로 비효율적이다.
	 *     여러 정렬 알고리즘의 시간복잡도를 비교하였을 때,
	 *     Run-time이 길어 단순(구현이 간단한)하지만 비효율적인 방법이다.
	 *     
	 *     불안정 정렬(Unstable Sort)이다.
	 *   
	 * 
	 */
	
	/*
	 * ※시간복잡도와 공간복잡도
	 * 
	 * - 차이점
	 *   프로그램의 실행이 얼마나 오래걸리는가? ->시간복잡도(time complexity)
	 *   얼마나 많은 메모리를 사용하는가? -> 공간복잡도(space complexity)
	 * 
	 * - 복잡도를 분석하는 이유
	 *   실행하기 전에 구현할 알고리즘을 결정한다.
	 *   실제 실행시키지 않고 주어진 코드에서 병목현상을 찾을 수 있다.
	 *   
	 * 1) 공간복잡도
	 *    주어진 알고리즘을 실행시키기 위해 필요한 공간(space)는 2 가지로 분류할 수 있다.
	 *    - 알고리즘과 무관한 부분
	 *      : 알고리즘의 특성과는 무관한 부분으로 프로그램 코드를 저장하기 위한 공간,
	 *        프로그램을 수행하기 위해 시스템이 필요로 하는 공간 등이 이에 포함된다.
	 *    - 알고리즘과 밀접한 부분
	 *      : 알고리즘의 특성과 밀접한 관계가 있는 부분으로서, 문제를 해결하기 위해 필요로 하는 공간을 의미한다.
	 *        즉, 변수를 저장하기 위한 공간, 순환 프로그램, recursion stack 등이 이에 포함된다.
	 *    -> 일반적으로 알고리즘의 공간복잡도를 분석할 때는 밀접한 부분의 것을 계산하게 된다.
	 *       즉, 알고리즘이 문제를 해결하기 위해 반드시 필요한 부분만을 계산함으로써 주어진 알고리즘의 공간복잡도를 계산한다.
	 *  
	 * 2) 시간복잡도
	 *    시간복잡도는 알고리즘을 구성하는 명령어들이 몇 번이나 실행되는지 센 결과(frequency count)와
	 *    각 명령어의 실행시간(execution time)을 곱한 합계를 의미한다.
	 *    그러나, 각 명령어의 실행시간은 특정 하드웨어 또는 프로그래밍 언어에 따라 값이 달라질 수 있기 때문에
	 *    알고리즘의 시간복잡도는 명령어의 실행횟수만을 고려하게 된다.
	 *    
	 *    이와 같이 알고리즘을 이루는 명령어들의 실행 횟수를 계산하여
	 *    알고리즘의 시간복잡도를 구하는 일을 알고리즘의 분석(analysis of algorithm)이라고 한다.
	 *    또한, 알고리즘의 분석은 일반적으로 공간복잡도보다 시간복잡도를 통해 이루어진다.
	 * 
	 */
	
	
	
// ※ 코드 실행 과정
//	
//	int[] arr = {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
	
//	1) 첫 번째 바깥for문 -> arr[0]값인 '1'과 비교
// 	첫 번째 안쪽 for문 -> arr[0] = 1 과 j(0+1)위치의 값 비교. 0 과 8.
//	arr[0] > arr[j(=1)] 가 성립하지 않으므로 값이 변경되지 않고 다시 반복문 실행
//	...
//	arr[0] > arr[j(=15)] 까지 비교하여 첫 번째 안쪽 for문 종료 (정렬 실행 없음으로 syso값 출력 X)
//  
	
//	두 번째 안쪽 for문 -> arr[1] = 8과 arr[j]값의 비교
//	arr[1] > arr[5] 성립하여 정렬.
//	...
//	반복하여 arr[1]의 값은 j<arr.length(=15)까지 비교하여 if문(arr[1]의 값이 > arr[j]값인 경우)을 통해 정렬한다.
//	arr[1] 값의 if문 성립으로 정렬 수행 -> int[] arr = {1, '4', 35, 67, 17, '8', 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
//	정렬값에서 다시 if문 성립되는 값을 찾아 정렬 수행-> int[] arr = {1, '3', 35, 67, 17, 8, 20, 23, 9, 36, 6, 19, 18, '4', 5, 11};
//	
	
//	이렇게 진행되는 위치별 값의 정렬과정을 확인해보고 싶으면
//	System.out.println(i + "위치 값의 정렬 " + Arrays.toString(arr)); 라는 출력문을 입력.
//	if문에 해당될 때 마다 값의 최솟값이 변경되어 정렬되는 배열의 출력값을 확인할 수 있다.
//	
//	정렬하여 값이 바뀌지 않더라도 1번 연산당 count가 증가하기 때문에
//	0번째 값 정렬을 위한 연산 15번 ... 14번째 값 정렬을 위해 연산 1번 까지 총 120번을 수행한다.
//	하지만 실제 교환되는 횟수는 연산수보다 훨씬 적다.
//	
	
	
	public void selectionSort() {
		int[] arr = {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
		
		int temp = 0;
		int count = 0;
		
		System.out.println("초기 배열 : " + Arrays.toString(arr));
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;   
//					System.out.println(i + "위치 값의 정렬 " + Arrays.toString(arr));
				}
				System.out.print("");
				count++;
			}
		}
		System.out.println("연산 반복 횟수 : " + count);
		for(int i = 0; i < arr.length; i++) { 
//			System.out.print(arr[i]+ " "); // arr[0] 부터 arr[15]까지 정렬된 값 확인
		}
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
	}

}
