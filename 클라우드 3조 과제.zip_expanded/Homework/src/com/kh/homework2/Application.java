package com.kh.homework2;

import com.kh.homework2.com.A_queue;
import com.kh.homework2.com.AdjacencyArray;
import com.kh.homework2.com.Hashtable;
import com.kh.homework2.com.StackArray;
import com.kh.homework2.com.Stacks;
import com.kh.homework2.com.Tree;



public class Application {

	public static void main(String[] args) {
		
		System.out.println("큐(Queue)");
		System.out.println();
		new A_queue().method1();
		new A_queue().method2();
		new A_queue().method3();
		System.out.println();
		
		System.out.println("스택(Stack)");
		System.out.println();
		new Stacks().method1();
		new StackArray(10).method1();
		System.out.println();
		
		System.out.println("트리(Tree)");
		System.out.println();		
		new Tree().treeSet();
		System.out.println();
		
		System.out.println("해시테이블(Hashtable)");
		System.out.println();
		Hashtable ht = new Hashtable(26);
		ht.method();
		System.out.println();
		
		System.out.println("그래프(Adjacency)");
		System.out.println();
		int initSize = 5;
        AdjacencyArray adArray = new AdjacencyArray(initSize);

        adArray.put(1, 2, 1);
        adArray.put(1, 4, 1);
        adArray.put(2, 3, 1);
        adArray.put(2, 5, 1);
        adArray.put(4, 5, 1);

        adArray.printGraph();
		

	}

}
