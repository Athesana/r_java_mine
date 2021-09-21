package com.kh.chap1.file;

import java.io.File;
import java.io.IOException;

public class A_File {

	public void method1() {
		// File 클래스 테스트

		try {
			// 경로를 지정하지 않으면 현재 project 폴더에 파일이 생성된다.
			File file = new File("test.txt"); // 메모리상에만 존재하는 객체
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대 경로 : " + file.getAbsolutePath());
			System.out.println("상대 경로 : " + file.getPath());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("파일 존재 여부 : " + file.exists()); // false였다가 IO패키지 refresh하고 다시 컴파일해보면 true 나옴
			
			
			file.createNewFile(); // 메소드 실행해야만 실제 파일이 만들어진다.
			
			// 존재하는 경로까지 지정해 주면 해당 위치에 파일을 생성한다.
			// 만약 존재하지 않는 경로를 제시하면 IOException이 발생한다.
			
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}  
		
		
		
		
		
	}
	
	
	
}
