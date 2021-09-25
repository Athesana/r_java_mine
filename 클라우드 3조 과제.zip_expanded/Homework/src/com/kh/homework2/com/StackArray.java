package com.kh.homework2.com;

// 배열로 스택 구현
// 멤버 변수에 top, size, []stack을 지정해 준다. 
// 생성자로 멤버변수들을 초기화 해주면서 stack배열을 size만큼 초기화 해준다.
public class StackArray {
	int top;    //인덱스
    int size;    //스택 배열의 크기
    int [] stack;
    public StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        stack[++top] = item;
        System.out.println(stack[top] + " Push!");
    }
    public void pop() {
        System.out.println(stack[top] + " Pop!");
        int pop = stack[top];
        stack[top--] = 0;
    }
    public void peek() {
        System.out.println(stack[top] + " Peek!");
    }
    
    public void method1() {
    	StackArray stack = new StackArray(10);
    	stack.push(1);
    	stack.push(2);
    	stack.push(4);
    	stack.push(8);
    	
    	stack.pop();
    	stack.peek();
    }
}

