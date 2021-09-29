package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		
		System.out.print("1번 : ");
		sample.printLottoNumbers();
		
		System.out.println();
		
		System.out.print("2번 : ");
		sample.outputChar(10,'a');
		
		System.out.println();
		
		System.out.println("3번 : " + sample.alphabette());
		
		System.out.println("4번 : " + sample.mySubstring("apple", 2, 4));
		
		
		
		
	}

}
