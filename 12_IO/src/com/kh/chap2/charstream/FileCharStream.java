package com.kh.chap2.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {

	public void fileSave() {
		System.out.println("fileSave() 호출");
		
		// try-with-resource 문을 통해서 자동으로 사용한 리소스를 자동으로 close() 시킨다. 
		// try() 소괄호 안에 리소스를 선언한다. 여러 개는 세미콜론으로 선언 (finally ~ close 안해도 됨)
		// FileWriter를 사용해서 파일을 생성하고 데이터를 문자 단위로 저장한다.
		try(FileWriter fw = new FileWriter("b_char.txt", true)) {
			
			fw.write("산아야! IO 재밌니?ㅋㅋ");
			fw.write("혼자서도 하실 수 있습니다.");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});  
//			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'}, 1, 3);  //1번 인덱스부터 3개만 추출
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("fileSave() 종료");
		}
		
	}
	
	
	public void fileRead() {
		System.out.println("fileRead() 호출");
		
		// FileReader를 사용해서 파일에서 데이터를 문자 단위로 읽어온다. 리소스를 선언. 읽어올 파일이 없으면 filenotfoundexception 발생
		try (FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;
			
			while((value = fr.read()) != -1) {
				System.out.print((char) value);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("fileRead() 종료");
		}
		
		
	}
}
