package com.kh.dimension.practice;

import java.util.Arrays;
import java.util.Random;

public class DimensionalArray {

	/*
	 * 2차원 배열
	 * 
	 * 	[표현법]
	 * 	 1) 2차원 배열의 선언
	 * 		자료형[][] 배열명;
	 * 		자료형 배열명[][];
	 * 
	 * 	 2) 2차원 배열의 할당
	 * 		배열명 = new 자료형[행 크기][열 크기];
	 * 
	 *   3) 2차원 배열의 선언과 할당을 동시에 진행
	 *   	자료형[][] 배열명 = new 자료형[행 크기][열 크기];
	 * 		자료형 배열명[][] = new 자료형[행 크기][열 크기];
	 * 
	 *   4) 2차원 배열의 초기화
	 *   	4-1) 인덱스를 이용한 초기화 (직접 지정해서 일일히 해주는 것)
	 *   		 배열명[0][0] = 값1;
	 *   		 배열명[0][1] = 값2;
	 *   		 배열명[1][0] = 값3;
	 *   		 배열명[1][1] = 값4;
	 *   
	 *   	4-2) 선언과 동시에 초기화 (중간 [][]은 생략 가능)
	 *   		 자료형[][] 배열명 = new int[][]{{값1, 값2, 값3 ...},{값1, 값2, 값3 ...}, ...};
	 *   		 자료형 배열명[][] = new int[][]{{값1, 값2, 값3 ...},{값1, 값2, 값3 ...}, ...};
	 *   		 자료형[][] 배열명 = {{값1, 값2, 값3 ...},{값1, 값2, 값3 ...}, ...};
	 *   		 자료형 배열명[][] = {{값1, 값2, 값3 ...},{값1, 값2, 값3 ...}, ...};
	 *   	
	 *   	4-3) 반복문을 이용한 초기화(중첩 반복문 이용)
	 *   
	 * 
	 */
	
	
	public void method1() {
		
		int[][] iArray1;  // 메모리(Stack)에 정수형 2차원 배열의 주소를 보관할 공간이 할당된다.(참조변수)
		int iArray2[][];
		int[] iArray3[];
		int[][] arr = {{15, 14, 13, 12, 11},{10, 9, 8, 7, 6},{5, 4, 3, 2, 1}};  //생성과 동시에 초기화 된 배열
//		arr = {{15, 14, 13, 12, 11},{10, 9, 8, 7, 6},{5, 4, 3, 2, 1}};
//		arr = new int[][] {{15, 14, 13, 12, 11},{10, 9, 8, 7, 6},{5, 4, 3, 2, 1}};
		
		iArray1 = new int[3][5]; // 메모리(Heap)에 총 15개의 정수형 데이터를 저장할 수 있는 2차원 배열 생성 -> 배열의 시작 주소를 참조 변수에 전달한다.
		
		// 행 길이 출력
		System.out.println("행의 길이 : " + iArray1.length);
		
		// 각 행별 열의 길이 출력
		System.out.println("1번째 행의 열의 길이 : " + iArray1[0].length);
		System.out.println("2번째 행의 열의 길이 : " + iArray1[1].length);
		System.out.println("3번째 행의 열의 길이 : " + iArray1[2].length);
		
		/*
		 *  1  2  3  4  5 
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 * 
		 * 바깥쪽 for 문 -> 행의 개수만큼 반복(3번)
		 * 안쪽 for 문 -> 열의 개수만큼 반복(5번)
		 */
		int value = 1;
		
		// 값을 초기화
		for(int i = 0; i < iArray1.length; i++) {
			for(int j = 0; j < iArray1[i].length; j++) {
				iArray1[i][j] = value++;
			}
		} 
		
		// 값의 출력
		for(int i = 0; i < iArray1.length; i++) {
			for(int j = 0; j < iArray1[i].length; j++) {
				System.out.printf("%2d ", iArray1[i][j]);
			}
	
			System.out.println();
		} 
		
		System.out.println();
		
		// 생성과 동시에 초기화된 배열의 출력
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}

	public void method2() {
		
		/*
		 * 가변 배열
		 *  - 행은 정해졌으나 각 행에 대한 열의 개수가 정해지지 않은 상태의 배열이다.
		 *  - 2차원 배열은 자료형이 같은 1차원 배열이 여러 개가 하나로 묶인 것, 묶여있는 1차원 배열의 길이가 꼭 같을 필요 없다.
		 * 
		 */
		
		int[][] arr1 = new int[3][];  // 가변 배열 할당 (행의 크기는 3행)
		int[][] arr2 = {{1, 2, 3}, {4}, {5, 6, 7, 8, 9}, {10}};
		
		
		//각 행에 다른 배열을 참조할 수 있도록 할당
		arr1[0] = new int[2];  // 0행은 2열
		arr1[1] = new int[3];  // 1행은 3열
		arr1[2] = new int[5];  // 2행은 5열
		
		System.out.println("===== 가변 배열 =====");
		
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.printf(arr1[i][j] + " ");
			}
		
			System.out.println();
		}
		
		System.out.println("===== 가변 배열(생성과 동시에 초기화 =====");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.printf(arr2[i][j] + " ");
			}
		
			System.out.println();
		}
		
	}
	
	public void method3() {
		// random값 응용하기 : 1부터 10사이의 랜덤 값을 3행 3열의 2차원 배열에 넣어보자.
		// 단, random값은 중복을 제거해서 2차원 배열에 대입하시오.
		
		Random r = new Random();
		
		int[][] iArray3 = new int[3][3];
		

		
		for(int i = 0; i < iArray3.length; i++) {
			for(int j = 0; j < iArray3[i].length; j++) {
				iArray3[i][j] = 0;				
			}
		}

		int num = 0;
		boolean condition = false;
		
		
		for(int i = 0; i < iArray3.length; i++) {
			for(int j = 0; j < iArray3[i].length; j++) {
				
				num = r.nextInt(10);
		
				if(!(i == 0 && j == 0)) {
					for(int k = 0; k < iArray3.length; k++) {
						int l = 0;
						while(l < iArray3.length) {
							if(num == iArray3[k][l]) {
								num = r.nextInt(10);
								condition = true;
							} else {
								condition = false;
							}
							l++;
							if(condition == true) {
								k = 0;
								l = 0;
							}
						}
					}
				
				}
				iArray3[i][j] = num;
				
				System.out.printf(iArray3[i][j] + " ");
			}
			System.out.println();
		}
		
	
	}

	public void method4() {
		// random값 응용하기 : 1부터 10사이의 랜덤 값을 3행 3열의 2차원 배열에 넣어보자.
		// 단, random값은 중복을 제거해서 2차원 배열에 대입하시오.
		
		int num = 3;
		int[][] array = new int[3][3];
//		ArrayList list = new ArrayList();
//		if(!list.contains(array[i]))
//			list.add(array[i]);
		
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				array[i][j] = (int)(Math.random() * 10);
				
			}
		}
		
		
				
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print(array[i][j] + " ");
				
			}
			
			System.out.println();	
		}
			
		
		
		
	}

	public void method5() {
	
		int sum = 0;
		int num[][] = new int[3][3];
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				num[i][j] = ++sum;
//				System.out.printf("%2d ", num[i][j]);
			}
//			System.out.println();
		}
		Random random = new Random();
		for(int i = 0; i < num.length; i++) {
			int ran1 = random.nextInt(3);
			int ran2 = random.nextInt(3);
			int temp = num[0][0];
			num[0][0] = num[ran1][ran2];
			num[ran1][ran2] = temp;
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void method6() {
		// <강사님 풀이>
		
		// STEP 1. 1차원 배열을 이용해서 먼저 중복 제거 된 랜덤 값을 추출
		
		int[] arr = new int[9];
		int[][] newArr = new int[3][3];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1); 
			
			// STEP 2. 중복 제거
			// 이제부터 중복 제거를 해보자. 이전 값들과 비교해서 이미 나와 있는 값이라면 다시 반복문을 돌려서 다른 숫자가 나오게 하자.
			// 내가 어느 위치에 있는 값을 비교할 것이냐에 따라 비교해야 하는 숫자의 갯수가 유동적으로 달라진다.
			// 0의 위치에서는 비교할 필요가 없다. 2번째 인덱스 = a[1]에 있는거라면 1번만 비교하면 된다.
			// i값 감소시켜서 브레이크로 가장 가까운 for문 나와서 다시 첫번재 for문으로 가서 i++를 증가 시킨 인덱스 위치,
			// 즉, 인덱스i 값은 이전과 동일하다. 빠졌던 그 빈 위치에 다른 랜덤 값을 넣어준다.
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					
					break;  // 브레이크가 없으면 발견이 되도 나머지 숫자에 대해서도 불필요한 반복을 수행하기 때문에
				}
			}
		}
//		System.out.println(Arrays.toString(arr));  // 배열의 주소 값이 아닌 배열의 내용을 출력하는 메소드
//		여기까지 완료 했으면 이제 
//		STEP 3. 3행 3열의 2차원 배열에 랜덤 값을 대입
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++]; // arr 1차원 배열의 값을 index로 지정하고 후위연산자로 하나씩 증가하면서 대입, 전위는 놉!
			}
		}
//		STEP 4. 3행 3열의 2차원 배열 출력
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
//				System.out.print(newArr[i][j] + " ");
				System.out.printf("%2d", newArr[i][j]);
			}
			
			System.out.println();
		}
		
	}
	
}