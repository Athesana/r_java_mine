package com.kh.chap3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_BufferedStream {
	/*
	 * 보조 스트림
	 *  - 기반 스트림(Input/OutputStream, Reader/Writer)과 연결되어 여러가지 편리한 기능을 제공해주는 스트림을 말한다.
	 *  - 단독으로 외부 매체(파일, 네트워크, 키보드, 모니터 등) 외부 매체와 데이터를 직접 주고 받을 수 없다.
	 *  - 기반 스트림을 먼저 생성하고 보조 스트림을 연결해 주어야 한다.
	 *  
	 * 성능 향상 보조 스트림
	 *  - 기반 스트림의 속도를 향상시켜주는 기능
	 *  - 기반 스트림에 대한 레퍼런스(주소, 객체)가 필요하다.
	 *  - 버퍼라는 공간을 사용해서 속도 향상에 도움을 주게 된다. (버퍼에 데이터를 쌓아 놨다가 한 번에 입/출력 시킴)
	 *  - 기반 스트림에서 제공하지 않는 메소드(newLine(), readLine()) 메소드들을 제공해준다.
	 */
	
	public void fileSave() {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt", true))) {
			
//			FileWriter fw = new FileWriter("c_buffer.txt");
//			BufferedWriter bw = new BufferedWriter(fw);  // writer를 상속하고 있는게 filewriter이기 때문에 매개 변수의 다형성 때문에 fw만 넘겨줘도 된다.
//			<이 2문장을 try() 안에 정리함>
			
			bw.write("안녕하세요\n");
			bw.write("아직도 IO가 어려운가요?");
			bw.newLine(); // 기본 스트림에서 제공하지 않는 메소드(보조 스트림에서 제공), 개행할 때 사용
			bw.write("마상이네욤ㅠㅠ");
			bw.newLine();
			bw.write("넝담~");
			
			// 내부에서 버퍼를 사용하고 있기 때문에 좀 더 빠른 성능을 기대한다. 사용은 크게 다르지 않다.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public void fileRead() {
		
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
			String value = null;
			
			// 기반 스트림에서 제공하지 않는 메소드, 파일에서 한 줄 읽어올 때 사용한다.
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
