package com.kh.control.practice;

import java.util.Scanner;

public class D_While {

	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * 	[초기식]
	 * 
	 *  while(조건식){
	 *  	.. 반복적으로 실행될 코드..
	 *  
	 *  	[증감식, 분기문]
	 *  }
	 *  
	 * - 조건식이 true일 경우 해당 실행 코드를 실행한다.
	 * - 조건식이 false일 경우 해당 반복문을 종료한다.
	 * 
	 */
	
	public void method1() {
		// 1부터 랜던값(1 ~ 10)까지의 합계
		
		int sum = 0;
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 발생시킬 수 있다.
		 * 
		 * Math.random() 호출 시 -> 0.0 ~ 0.999999999 까지 랜덤값을 발생시킨다. (0.0 <= 랜덤값 < 1.0)
		 * 
		 */
//	1번	int random = Math.random(); // Math.random()호출 시 랜덤값이 double 타입이라 int 변수에 대입이 안된다.
//	2번	int random = (Math.random() * 10 + 1); // 1.0~10.999999 값을 뽑아낼 수 있다.
//	3번  int 형태로 형변환 해주기
		int random = (int) (Math.random() * 10 + 1); // 1~10
//		
//		System.out.println(random);

		
		int i = 1;
		
		while(i <= random) {
			sum += i;
			
			i++;
		}
	
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
		
	}
	
	public void method2() {
		// 사용자에게 계속 문자열을 입력 받고 그 문자열을 출력
		// 단, "exit" 문자열을 입력하면 프로그램을 종료한다.
		
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
//	1번	while(true) {
//			System.out.print("문자열을 입력해주세요. : ");
//			
//			str = scanner.nextLine();
//			
//			System.out.println(str);
//			
//			if(str.equals("exit")) {
//				break;
//			}
//		}
//		System.out.println("프로그램이 종료되었습니다.");
//		
//	2번
		
		while(!str.equals("exit")) {
			System.out.print("문자열을 입력해주세요. : ");
			
			str = scanner.nextLine();
			
			System.out.println(str);
			
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}

	public void method3() {
		// 사용자가 입력한 단의 구구단을 출력하기
		// 단, 2~9 사이의 정수값이 아니면 "2~9 사이의 정수를 입력해야 합니다." 출력
		// ex)
		// 2~9 사이의 정수를 입력하세요. : 2
		// == 2단 ==
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		
//		<내가 푼거 ㅡㅡ>
//		int i = 2;
//		int j = 1;
//		Scanner scanner = new Scanner(System.in);
//		
//		while(i < 10) {
//			System.out.println("2 ~ 9 사이의 정수를 입력하세요.");
//			i = scanner.nextInt();
//			
//				System.out.printf("==== %d단 ====" , i);
//				
//				i++;
//			
////			for(int j = 1; i < 10; j++)
////				System.out.printf("%d * %d = %d " , i , j , (i*j));
//				
//		break;
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2 ~ 9 사이의 정수를 입력하세요. : ");
		num = scanner.nextInt();
		
		if(num >= 2 && num <= 9) {
		//구구단 출력
			int i = 1;
			System.out.printf("==== %d단 ====\n" , num);
			
			while(i <= 9) {
				System.out.printf("%d * %d = %d\n" , num, i, (num * i) );
				
				i++;
			}
		} else {
			System.out.println("2 ~ 9 사이의 정수를 입력해야 합니다.");
		}
		
	}
	
}
