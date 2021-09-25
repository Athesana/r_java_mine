package com.kh.homework.one;

import java.util.Scanner;

public class Quick {

	/*
	 * Quick Sort : - 분할 정복(divide and conquer)방법을 통해 주어진 배열을 정렬한다.
	 *               [분할 정복(divide and conquer)이란? --> 어떤 문제를 해결하는 알고리즘에서 원래 문제를
	 *                성질이 똑같은 여러 개의 부분 문제로 나누어 해결하여 원래 문제의 해를 구하는 방식이다.]
	 *                
	 *              - 불안정 정렬이다.
	 *              
	 *              - 다른 원소와의 비교만으로 정렬을 수행하는 비교 정렬에 속한다.
	 *              
	 *              - Merge Sort와 달리 배열을 비균등하게 분할한다.
	 *              
	 *              
	 * 과정 ==> 1. 배열중에서 하나의 원소를 고른다. (이렇게 고른 원소를 피벗(pivot)이라고 한다.)
	 * 
	 *         2. 피벗(pivot)앞에는 피벗보다 작은 값을 가지는 모든 원소들이 정렬하고,
	 *            피벗 뒤에는 피벗보다 값이 큰 값을 가지는 모든 원소들이 정렬하도록 피벗기준으로 배열을 2개로 나눈다.
	 *            (2번 과정을 분할(Divide)이라고 한다. 또한, 분할을 마친 피벗은 더 이상 움직이지 않는다.)
	 *            
	 *         3. 분할된 두 개의 작은 배열에 대해 재귀(Recursion)적으로 이 과정을 반복한다.
	 *            [재귀(Recursion)적 이란? ==> 프로그램의 한 과정에서 자신을 직접 호출하거나 그 자신이 호출한
	 *            별도의 과정으로부터 호출을 받음으로써 그 자신을 사용하는 과정.]
	 *            
	 *            ※ 재귀 호출이 한번 진행될 때마다 최소한 하나의 원소는 최종적으로 위치가 정해지는 것 이므로
	 *               이 알고리즘은 반드시 끝난다는 것을 보장할 수 있다.
	 */
	int A = 0;
	Scanner scanner = new Scanner(System.in);
	
	public void method1(){
		
		
//		System.out.print("원하는 숫자를 입력하여 배열을 만들어 주세요. : ");
//		A = scanner.nextLine();  (원하는 숫자(배열) 스캐너로 받아서 만들어보기 실패..)
		
		int[] arr = {1,8,35,67,17,4,20,23,9,36,6,19,18,3,5,11};
		PrintArray(arr);
		QuickSort(arr, 0, arr.length-1);
		PrintArray(arr);
	}
	
	public static void QuickSort(int[] arr, int start, int end) {
		
		if(start >= end) { // 원소가 한개일 때
			
			return;
			
		}
		int pivot = start; // 피벗값, 첫번째 원소
		int i = start + 1; // 큰 값을 찾을 인덱스
		int j = end; // 작은 값을 찾을 인덱스
		int temp; // 값을 바꿀 임시변수
	
			
		while(i <= j) { // 엇갈릴 때 즉, 큰 값을 찾을 인덱스하고 작은 값을 찾을 인덱스가 서로 엇갈렸을 때
			while(arr[i] <= arr[pivot] && i <= end) { // 피벗값 보다 큰 값을 찾을 때 까지 반복
				i++;
			}
			
			while(arr[j] >= arr[pivot] && j > start) { // 피벗값 보다 작은 값을 찾을 때 까지 반복
				j--;
			}
			
			if(i > j) { // 현재 엇갈린 상태라면 피벗 값과 교체
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			}
			else {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		QuickSort(arr, start, j-1);
		QuickSort(arr, j+1 , end); // 이 두개는 정렬된 값을 제외하고 나머지의 퀵정렬이다.
	}
	
	public static void PrintArray(int[] array) {
		for(int a = 0; a < array.length; a++) {
			System.out.print(array[a] + " ");
		}
		
		System.out.println("");
//		System.out.println("=== 퀵 정렬 ===");
		
	}
}

/*
 * 시간 복잡도
 *   최적의 경우 : T(n) = O(nlog2^n) --> 피벗의 왼쪽, 오른쪽에 같은 수의 원소가 이동하는 경우이다.(피벗이 딱 중앙에 위치하는 경우)
 *     - 각 순환 호출에서는 전체 리스트의 대부분 레코드를 비교해야 하므로 평균 n번 정도의 비교가 이루어진다.
 *       따라서, 최적의 시간 복잡도는 순환 호출의 깊이(횟수) * 각 순환 호출 단계의 비교 연산 = nlog2^n 이(가) 된다.
 *       
 *   최악의 경우 : T(n) = O(n^2) --> 피벗의 왼쪽 또는 오른쪽, 한 쪽으로만 원소가 쏠리는 경우이다.(이미 오름차순으로 정렬 되어있는 경우)
 *     - 최악의 경우는 정렬하고자 하는 배열이 오름차순 정렬되어 있거나 내림차순 정렬되어있는 경우다.
 *     - 각 순환 호출에서는 전체 리스트의 대부분의 레코드를 비교해야 하므로 평균 n번 정도의 비교가 이루어진다.
 *       따라서, 최악의 시간 복잡도는 순환 호출의 깊이(횟수) * 각 순환 호출 단계의 비교 연산 = n^2 이다.
 *    
 *   평균의 경우 : T(n) = O(nlog2^n)
 *   
 *   
 * 공간 복잡도
 *   - 주어진 배열 안에서 교환(swap)을 통해, 정렬이 수행되므로 O(n)이다.
 *   
 * 장점
 *   - 불필요한 데이터의 이동을 줄이고 먼 거리의 데이터를 교환할 뿐만 아니라, 한번 결정된 피벗들이 추후 연산에서 제외되는
 *     특성 때문에 시간 복잡도가 다른 정렬 알고리즘과 비교했을 때도 가장 빠르다.
 *   - 정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않는다.
 * 
 * 단점
 *   - 불안정 정렬(Unstable Sort)이다.
 *   - 정렬된 배열에 대해서는 Quick Sort의 불균형 분할에 의해 오히려 수행시간이 더 많이 걸린다.
 * 
 */
		
