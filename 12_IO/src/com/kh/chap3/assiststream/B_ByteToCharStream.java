package com.kh.chap3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_ByteToCharStream {

	// 기반 스트림이 Byte 스트림이고    ==> System.in -> 사용자로부터 입력받을 때, System.out -> 콘솔에 출력할 때
	// 보조 스트림이 Char 스트림인 경우에 사용한다.
	
	public void input() {
		// System.in을 InputStreamReader를 사용해서 문자 기반으로 변경하고 사용자로부터 입력을 받고 출력해보자!
		// 아래와 같이 보조 스트림 여러 개를 사용하는 것도 가능하다.
		
//		<STEP3> try() 괄호 안으로 넣기
//		close();가 수행이 제대로 되게 하기 위해서 try-with-resource 문으로 바꿔주는 것
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String value = null;	// 사용자로부터 입력받기 위해 변수 선언
			
			System.out.println("문자열 입력 : ");
			value = br.readLine();
			
//			<STEP1>
//			InputStreamReader isr = new InputStreamReader(System.in);
//			BufferedReader br = new BufferedReader(isr);
//			
//			br.read();
			
//			<STEP2>
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("value : " + value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void output() {
		//System.out을 OutputStreamWriter를 사용해서 문자 기반으로 변경하고 콘솔에 출력한다.
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			bw.write("사나야 IO가 어렵니?");
			bw.newLine();
			bw.write("앞으로 Oracle, JDBC, HTML, CSS, ... 가 남아 있어요^^");
			bw.newLine();
			bw.write("힘내자");
			bw.close();  // 1. finally 블록에서 처리하는 방법 2. try-with-resource로 처리하는 방법
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
