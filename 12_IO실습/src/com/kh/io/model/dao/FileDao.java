package com.kh.io.model.dao;

import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
		StringBuilder sb = new StringBuilder();
		
		while(true){

			// "파일에 저장할 내용을 반복해서 입력하시요("exit을 입력하면 내용 입력 끝):"
			
			// 값을 Scanner로 입력 받고 해당 입력 값이 "exit"일 경우 반복문을 빠져나간다. 아닐 경우, sb에 추가
			
			
		}
		
		
		// "저장하시겠습니까? (y/n)"
		
		// 입력 받은 값이 대문자이든 소문자이든 상고나없이 "y"이면,
		// 저장할 파일명을 입력 받음
//		
//		try { // BufferedWriter와 FileWriter 스트림 사용
//			
//			  // "입력 받은 파일명.txt" 파일에 해당 sb 데이터 출력
//			
//		      // "입력받은 파일명.txt 파일에 성공적으로 저장하였습니다." 콘솔창 출력
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			// 열었던 스트림 close
//		}
//		
		// 입력 받은 값이 y가 아니면 "다시 메뉴로 돌아갑니다." 출력하고 메뉴로.
		
		
	}
	
	public void fileSave() {
		
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}