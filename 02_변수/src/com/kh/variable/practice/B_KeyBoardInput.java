package com.kh.variable.practice;

import java.util.Scanner;

public class B_KeyBoardInput {

	public void inputByScanner() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int age = 0;
		double height = 0;
		char gender = '\u0000';
		
		System.out.println("당신의 이름은 무엇입니까?");
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (문자열)
		 * scanner.next() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전의 값만 읽어온다.
		 * scanner.nextIn() : 정수를 입력받을 때 사용한다.
		 * scanner.nextDouble() : 실수를 입력받을 때 사용한다.
		 * ... 그 밖에 byte, Boolean 등의 (참조형이 아닌)기본 자료형을 입력받을 때도 마찬가지로 nextXXX()로 입력받으면 된다.
		 */
		
		//입력이 완료되면 해당 값을 변수에 대입한다.
		//대입구문이 없으면 입력한 값을 눈으로 확인할 수 없다.
		name = scanner.nextLine();
		
		System.out.println("당신의 나이는 몇 살입니까?");
		age = scanner.nextInt();	//나이는 정수형으로만 입력해야 한다.
		
		System.out.println("당신의 키는 몇 입니까?(소수점 첫째 자리까지 입력하세요.)");
		height = scanner.nextDouble();
		
		System.out.println("당신의 성별은 무엇입니까? (M/F)");
		
//		scanner.nextXXX() 메소드 뒤에 scanner.nextLine()메소드를 사용하게 된다면 버퍼에 남아있는 '엔터'를 빼주기 위해서 
//		scanner.nextLine() 메소드를 한 번 더 써야한다.
//		기본 자료형 다음에 nextLine 사용하려면 scanner.nextLine() 한 번 더 사용해야 한다.
		scanner.nextLine();
		
//		scanner.nextChar()가 없다. 문자를 호출하는 메소드가 없어서 문자열 형태로 만들어 준다.
//		scanner.nextLine()을 통해서 문자열을 읽어오고 String 클래스에서 제공해주는 charAt() 통해서 원하는 문자를 뽑아낸다.
		
//문자열 경우에는 new 없이 클래스 생성 가능 String이라는 클래스 안에 line.charAt이라는 메소드를 만든 것
//charAt은 문자열 중에 내가 원하는 순서에 있는 글자 하나만 뽑아내는 메소드. 제일 앞의 문자부터 0으로 시작해서 1씩 증가하면서 위치가 지정된다.
		String line = scanner.nextLine();
		gender = line.charAt(0);
		
		
//		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세, 키는 " + height + "cm, 성별은 " + gender + " 입니다.");
		System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c 입니다.\n", name, age, height, gender);
		
		
		
	}
	
}
