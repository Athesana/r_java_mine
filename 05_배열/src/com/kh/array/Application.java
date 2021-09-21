package com.kh.array;

import com.kh.array.practice.C_ArraySort;
import com.kh.array.practice.D_BubbleSort;

public class Application {

	public static void main(String[] args) {
		
//		new A_Array().method1();
//		new A_Array().method2();
//		new A_Array().method3();
//		new A_Array().method4();
		
//		new B_ArrayCopy().method1();
//		new B_ArrayCopy().method2();
//		new B_ArrayCopy().method3();
//		new B_ArrayCopy().method4();
//		new B_ArrayCopy().method5();
		
		
//		new C_ArraySort().method1();
//		new C_ArraySort().method2();
		
		D_BubbleSort bs = new D_BubbleSort();
		int[] arr = new int[] {1, 8, 35, 67, 17, 4, 20, 23, 9, 36, 6, 19, 18, 3, 5, 11} ;
		
		bs.bubbleSort(arr);
		
		
	}

}
