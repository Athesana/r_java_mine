package com.kh.first;

import com.kh.first.practice.ValuePrinter;
// import -> 단축키 ctrl + shift + o 자동으로 정리해준다. (없으면 추가, 불필요하면 삭제)
// ctrl + . 오류난 곳으로 자동으로 이동, 여러 곳이면 가장 가까운 곳부터 차례대로 보여줌
// ctrl + 1 문제를 해결하는 방법을 알려줌

/*
	주석(Comment)
	- 소스 코드와는 무관하고 코드로 인식되지 않는다.
	- 주로 코드에 대한 설명을 작성할 때 사용한다.
 */

// 한 줄 주석
// 추가로 주석 작성

/**
 * 	도큐먼트 주석
 *  - 도큐먼트 주석은 javadoc.exe API 도큐먼트를 생성하는데 사용된다.
 * @author ssskd
 *
 */

//클래스 명은 클래스 파일명과 동일해야 한다.
//클래스 안에는 여러 개의 메소드를 가질 수 있고 메소드 안에 소스코드를 작성한다.

public class Application {

		// main 메소드는 프로그램의 시작점으로
		// java.exe가 Application.class를 실행시킬 때 실행되는 메소드이다.
	
	public static void main(String[] args) {
		// ctrl + F11 하면 자동 실행 console
		// 1. 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
		// [표현법]
		//  클래스명 사용할이름 = new 클래스명();
		
		// 방법 1) import문을 사용하지 않고 클래스 생성
		// com.kh.first.practice.ValuePrinter printer = new com.kh.first.practice.ValuePrinter();
		
		// 방법 2) import 문을 사용하여 클래스 생성
		ValuePrinter printer = new ValuePrinter();
		
		// 2. 클래스를 생성 -> 메소드를 호출(실행)
		// [표현법]
		//  사용할이름.호출할메소드명();
		
		printer.printTest();
	}
	
}






