package com.kh.homework.one;

public class Sort {
	// 삽입 정렬
	public void method1() {	
		/*
		 * 삽입 정렬
		 * 삽입 정렬은 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법이다.
		 * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
		 * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
		 * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다. 
		 * 
		 * 시간 복잡도 O(N) ~ O(N^2) 역순에 가까울수록 비효율적(일일이 값을 비교해서 하기 떄문에 더 많은 수행을 하게 된다.)
		 */
		
//		int[] arr = {2, 5, 7, 1, 3};
		int[] arr = {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11};
		
		for(int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int num = i - 1;
			
			// 타겟 이전 원소가 타겟 숫자보다 크기 직전까지 모든 수를 뒤로 한 칸씩 밀어낸다.
			while(num >= 0 && target < arr[num]) {
				arr[num+1] = arr[num];
				num--;
			}

			arr[num + 1] = target;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// 상세 설명
/*	
    처음 주어진 배열에서
	포문을 i = 1 부터 시작한다.
	타겟은 arr[1] = 5가 되고 num는 0이된다
	배열의 5부터 아래숫자들이랑 비교 시작

	while문에서 두 조건을 모두 만족해야 실행되는데
	첫 조건은 num = 0으로 만족하지만 두번째 조건에서 타겟숫자 = 5가 arr[0] = 2보다 크므로
	while문이 실행되지 않고 바로 빠져나와 arr[num + 1] = target; 이 실행된다.
	arr[num + 1]은 target 즉, arr[1] = 5 가 되고 결과적으로 아무런 변화가 없다.

	그 다음 for문은 i = 2이고 타겟넘버는 7 num는 1이 된다.
	타겟넘버 7이랑 아래숫자들이랑 비교 시작
	7이 5보다 크므로, 바로 whlie문을 빠져나와 아무런 변화가 없다.

	다음 for 문이 실행되면 타겟넘버는 1이 되고, num는 2가 된다. while문의 조건을 모두 만족하기 때문에
	반복적으로 실행되기 시작한다.
	* 첫 while문 실행
	arr[3] = arr[2] -> 2, 5, 7, 7, 3
	num--; -> num = 1
	* 두번째 while 문 실행
	arr[2] = arr[1] -> 2, 5, 5, 7, 3
	num--; -> num = 0
	* 세번째 while 문 실행
	arr[1] = arr[0] -> 2, 2, 5, 7, 3
	num--; -> num = -1

	num가 0보다 작아지므로 whlie문을 빠져나오고 밑에 실행문을 실행한다.
	arr[0] = target = 1 -> 1, 2, 5, 7, 3

	그다음 for문 숫자3도 마찬가지로 하게되면 1, 2, 3, 5, 7 로 정렬된다.
*/
	
	
	
	// 버블 정렬
	public void method2() {
		/*
		 * 버블 정렬
		 * 버블 정렬은 두 개의 인접한 원소를 비교하여 정렬하는 방식이다.
		 * 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
		 * 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
		 * 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
		 * 
		 * 시간 복잡도 O(N * (N-1)/2) 많은시간이 소요된다.
		 */
		
		int[] arr = {2, 5, 7, 1, 3};
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
