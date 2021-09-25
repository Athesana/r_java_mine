package com.kh.homework;

import java.util.Arrays;

import com.kh.homework.one.BubbleSort;
import com.kh.homework.one.HeapSort;
import com.kh.homework.one.Quick;
import com.kh.homework.one.SelectionSort;
import com.kh.homework.one.Sort;
import com.kh.homework.one.ShellSort;

public class Application {

	public static void main(String[] args) {
	
		System.out.println("셸 정렬");		
		new ShellSort().shellSort();
		
		System.out.println("삽입 정렬");		
		new Sort().method1(); 
		new Sort().method2(); 
		
		System.out.println("퀵 정렬");	
		new Quick().method1(); // 퀵 정렬
		
		System.out.println("선택 정렬");	
		new SelectionSort().selectionSort();
		
		System.out.println("힙 정렬");
		new HeapSort().method1();
		new HeapSort().method2();
		
		
		System.out.println("버블 정렬");
		new BubbleSort().method1();
		new BubbleSort().method2();
		
	}
}

