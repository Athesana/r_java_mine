package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
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
	
	public void outputChar(int num, char c) {
		
		for(int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		
		
	}
	
	public char alphabette() {
//		<내가 푼 것 - 각각 출력밖에 못함>
		
//		char c1 = ((char)((int)(Math.random() * 26) + 65));
//		char c2 = ((char)((int)(Math.random() * 26) + 97));
//		
//		System.out.print(c1);
//		System.out.print(c2);
		
		
		int num = 0;
		
		while(true) {
			num = (int)(Math.random() * 58 + 65);
			
			if (num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z'){
				break;
			}
			
		}
		
		return (char)num;
		

	}
	
	public String mySubstring(String str, int index1, int index2) {
		String result = null;
		
		if(!str.equals("")) {

			result = str.substring(index1, index2);
		
		}
		
		return result;
		
	}
	
}
