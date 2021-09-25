package com.kh.homework2.com;

import java.util.Stack;

public class Stacks {
	/*
	 * 자료 구조 중 하나인 Stack은  상자에 물건을 쌓아 올리듯이 데이터를 쌓는 자료 구조입니다.
	 * Stack의 가장 큰 특징은 나중에 들어간 것이 먼저 나오는것이다.
	 * Stack은 java.util.Stack을 import하면 사용할 수 있다.
	 * 그래프의 깊이 우선 탐색(DFS)에서 사용
	 * 재귀적(Recursion) 함수를 호출 할 때 사용
	 */
	public void method1() {
		// stack.push = stack에 값 추가
		Stack stack = new Stack();
		stack.push(1);
		stack.push('A');
		stack.push("ASD");
		stack.push(99);
		
		System.out.println(stack);
		
		// stack.pop = stack의 가장 위에 위치한(최근에 들어간) 값을 제거
		stack.pop();
		
		System.out.println(stack);
//		
//		// 원하는 위치의 값을 제거
		stack.remove(1);
		
		System.out.println(stack);
//		
//		// 스택 초기화
		stack.clear();
		
		System.out.println(stack);
		
//		// 스택 사이즈
//		int a = stack.size();
//		System.out.println(a);
//		
//		// 비어있는지 확인
//		boolean b = stack.empty();
//		System.out.println(b);
//		
//		// 특정한 값이 있는지 확인
//		boolean c = stack.contains(1);
//		System.out.println(c);
		
	}
	

}
