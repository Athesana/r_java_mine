package com.kh.chap2.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileByteStream {

	public void fileSave() {
		// FileOutputStream을 사용해서 파일을 생성하고 데이터를 바이트 단위로 저장한다.
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a_byte.dat", true);  // append 허용 = true = 기존파일에 이어서 작성, 기본값은 false = 덮어쓴다; 
			// 예외처리하면 파일이 없어도 파일을 만들어 준다.
			
			fos.write(97);  // a 문자가 저장
			fos.write('b');  // b 문자가 저장
			fos.write(10);  // 줄바꿈 문자가 저장
			//fos.write('한'); // 1byte단위로 문서 파일로 저장하기 때문에 한글은 깨진다.
			
			byte[] arr = {'a', 'b', 'c', 'd'};
			fos.write(arr);
			fos.write(arr, 1, 2); // 1번에서 인덱스에서 2개까지 들어간다. bc가 붙음
			
			fos.flush(); // 버퍼에 남아있는 것 비워주는 역할
			
			// 위의write() 메소드 실행 시 IOException이 발생했을 경우 해당 close()가 실행되지 않는다.
			// 따라서 예외가 발생하든, 발생하지않든 반드시 실행하는 구문이기 때문에 finally {} 안에서 close() 메소드를 실행시킨다.
//			fos.close();
			                                                                                                           
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 다 이용했으면 닫아주는 close() 꼭 작성 (try문 안에 있으면 예외가 발생했을 때 catch문으로 가버리기 때문에 close는 실행 안됨, 
				// 근데 close는 꼭 사용해야 하는 애니까 finally에 넣고 이 마저도 예외가 발생할 수 있어서 한 번 더 try~catch 작성)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public void fileRead() {
		//FileInputStream을 사용해서 파일에서 데이터를 *바이트 단위*로 읽어온다.
		
		FileInputStream fis = null;
		
		try {
			// 파일이 존재히지 않으면 FileNotFoundException 예외가 발생(자동으로 생성해 주지 않는다.)
			fis = new FileInputStream("a_byte.dat");
			
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지 데이터를 읽어오면 된다. 
			 */
//			byte[] arr = new byte[100];
//			
//			System.out.println(fis.read());  // -> 97
//			System.out.println((char) fis.read());  // -> a(형변환)
//			System.out.println(fis.read(arr)); // 47, 읽어오는 갯수, read 호출할 때마다 그 다음순서부터 다 읽어온다. 마지막에는 -1(읽어오는 값이 없으면)을 리턴
//			System.out.println(fis.read()); // -1이 리턴, 더 이상 읽어올게 없기 때문에 
//			System.out.println(Arrays.toString(arr));
			
			
			int value = 0;
			
			//read() 메소드가 두번 호출되서 정상적으로 우리가 원하는 값 출력이 불가능, read는 호출될 때 마다 그 다음 값을 출력한다.
//			while(fis.read() != -1) {
//				System.out.print((char) fis.read());
//			}
//			
			//while을 통해서 -1이 나올 때까지 반복문을 돌린다.
			while((value = fis.read()) != -1) {
				System.out.print((char) value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();  // close는 finally문 안에서!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
