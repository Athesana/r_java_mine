package com.kh.chap2;

import com.kh.chap2.bytestream.FileByteStream;
import com.kh.chap2.charstream.FileCharStream;

public class Application {

	public static void main(String[] args) {

//		new FileByteStream().fileSave();  // refresh 이후에 a_byte.txt 파일 만들어져있고 안에 ab 적혀있음
//		new FileByteStream().fileRead();
		
		
//		new FileCharStream().fileSave();
		new FileCharStream().fileRead();
	}

}
