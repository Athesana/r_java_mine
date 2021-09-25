package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void method1() {
		
		int[] arr = new int [10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}	
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method2() {
		
		int[] arr2 = new int[10];
		
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr2.length - i;
			}
			
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i] + " ");
			}
				
	}
	
	public void method3() {
		
		int size = 0;
		int[] arr3 = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요 : ");
		size = scanner.nextInt();
		
		arr3 = new int[size];
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1;
		}
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}
	
	public void method4() {
		
		String[] sArray = new String[5];
//		String[] sArray = {"사과", "귤", "포도", "복숭아", "참외"};
		
		sArray[0] = "사과";
		sArray[1] = "귤";
		sArray[2] = "포도";
		sArray[3] = "복숭아";
		sArray[4] = "참외";
		
		System.out.println(sArray[1]);
		
	}
	
	public void method5() {
		
		String origin = null;
		char search = '\u0000';
		
		char[] arr = null;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		origin = scanner.nextLine();
		
		System.out.print("검색할 문자를 입력하세요 : ");
		search = scanner.nextLine().charAt(0);

		arr = new char[origin.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = origin.charAt(i); 
		}
	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.print(i + " ");
				
				count++;
			}
		}

		System.out.println();
		System.out.println(search + "의 개수 : " + count);
	
	}

	public void method6() {
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = scanner.nextInt();
		
		if (num >=0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
		
	}
	
	public void method7() {
		
		int size = 0;
		int sum =0;
		int[] yourarr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		size = scanner.nextInt();
		
		yourarr = new int[size];
		
		for(int i = 0; i < yourarr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			yourarr[i] = scanner.nextInt();
		}
		
		
		for(int i = 0; i < yourarr.length; i++) {
			System.out.print(yourarr[i] + " ");
			sum += yourarr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}
	
	public void method8() {
		
		int count = 0;
		int[] iArray = null;
		Scanner scanner = new Scanner(System.in);
				

		while(true) {
			System.out.print("정수를 입력하세요. : ");
			int inum = scanner.nextInt();
			
			if(inum % 2 != 0 && inum >= 3) {
				iArray = new int[inum];
			
			
				for(int i = 0; i < iArray.length; i++) {
					if(i <= iArray.length /2) {
						count++;
					} else {
						count--;
			
					}
				
					iArray[i] = count;
					System.out.print(iArray[i] + " ");
				}
		
				break;
		
			} else {
			
				System.out.println("다시 입력하세요.");
			
			}
	
		}
		
	}
	
	public void method9() {
		
		int[] iarr = new int[10];
		
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(iarr[i] + " ");
		}
		
	}
	
	public void method10() {
		
		int[] iarr = new int[10];
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(iarr[i] + " ");
		}
		
		System.out.println();
		Arrays.sort(iarr);
		System.out.println("최대값 : " + iarr[9]);
		System.out.println("최소값 : " + iarr[0]);
	}
	
	public void method11() {
		
		int[] iarr = new int[10];
		
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(iarr[i] == iarr[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for(int i = 0; i < iarr.length; i++) {
			
			System.out.print(iarr[i] + " ");
		}
		
	}
	
	public void method12() {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
		
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
					
				}
			}
		
		}
		
		for(int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto);
			System.out.print(lotto[i] + " ");
		}
		
	}
	
	public void method13() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요.(-포함) : ");
		String rn = scanner.nextLine();
		
		char[] cnum = new char[rn.length()];
		
		for(int i = 0; i < cnum.length; i++) {
			cnum[i] = rn.charAt(i);
		}	
			
		char[] copy = new char[cnum.length];
		
		for(int i = 0; i < copy.length; i++) {
			
			if(i < 8) {
				copy[i] = cnum[i];
			
			} else {
				copy[i] = '*';
			}
			
			System.out.print(copy[i]);
		}

	}
	
	
	
}
