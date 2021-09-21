package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		int menu = 0;
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		
		System.out.print("메뉴 번호를 입력하세요. : ");
		menu = scanner.nextInt();

		switch(menu) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
			
		case 2 :
			System.out.println("수정 메뉴입니다.");
			break;
			
		case 3 :
			System.out.println("조회 메뉴입니다.");
			break;
			
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
			
		case 9 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		
	}
	
	public void practice2() {
		
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요. : ");
		i = scanner.nextInt();
		
		if ((i > 1) && (i % 2 == 0)) {
			System.out.println("짝수다.");
		} else if (i % 2 == 1) {
				System.out.println("홀수다.");
		} else 
			System.out.println("양수만 입력해주세요.");
		
		
		}

	public void practice3() {
		
		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double dsum1 = 0;
		double dsum2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		d1 = scanner.nextDouble();
		
		System.out.print("영어 점수 : ");
		d2 = scanner.nextDouble();
		
		System.out.print("수학 점수 : ");
		d3 = scanner.nextDouble();
		
		dsum1 = d1 + d2 + d3;
		dsum2 = (d1 + d2 + d3)/3;
		
		
		if (((d1 >= 40) && (d2 >= 40) && (d3 >= 40)) && (dsum2 >= 60)) {
			System.out.println("국어 점수 : " + d1);
			System.out.println("영어 점수 : " + d2);
			System.out.println("수학 점수 : " + d3);
			System.out.println("합계 : " + dsum1);
			System.out.println("평균 : " + dsum2);
			System.out.println("축하합니다, 합격입니다!");
		} else {
				System.out.println("불합격입니다.");
		}
		
		
	}
	
	public void practice4() {
		
		System.out.println(" 1 ~ 12 사이의 정수 입력 : ");
		
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.printf("%d 월은 겨울입니다.", month);
			break;
		
		case 3: case 4: case 5:
			System.out.printf("%d 월은 봄입니다.", month);
			break;
		
		case 6: case 7: case 8:
			System.out.printf("%d 월은 여름입니다.", month);
			break;
		
		case 9: case 10: case 11:
			System.out.printf("%d 월은 가을입니다.", month);
			break;
		
		default :
			System.out.printf("%d 월은 잘못 입력된 달입니다.", month);
		}
		
	}
	
	public void practice5() {
		
	
		
		String id = "";
		int password = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		id = scanner.nextLine();

		System.out.print("비밀번호 : ");
		password = scanner.nextInt();
		
		String id2 = "";
		id2 = "ismoon";
		int password2 = 1234;
		boolean result = false;
		
		
		if (id2.equals(id) != true) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (password != password2) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("로그인 성공");
		}

	}
	
	public void practice6() {
		
		System.out.print("회원 등급을 입력하세요.(관리자, 회원, 비회원 중 택 1) : ");
		String member = "";
		String authority = "";
		Scanner scanner = new Scanner(System.in);
		
		member = scanner.nextLine();
		
		switch(member) {
		case "관리자" : 
			authority = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
			break;
			
		case "회원" : 
			authority = "게시글 작성, 게시글 조회, 댓글 작성";
			break;
		
		case "비회원" : 
			authority = "게시글 조회";
			break;
	
			default :
				System.out.println("잘못 입력했습니다.");
				
			return;
		}
		
		System.out.printf("%s의 권한은 %s 입니다.", member, authority);
		
		
	}

	public void practice7() {
		
		double height = 0.0;
		double weight = 0.0;
		double BMI = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요. : ");
		height = scanner.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요. : ");
		weight = scanner.nextDouble();

		
		
		BMI = weight / (height * height);

		
		if (BMI < 18.5) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("저체중");
		} else if ((BMI >= 18.5) && (BMI < 23)) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("정상");
		} else if ((BMI >= 23) && (BMI < 25)){
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("과체중");
		} else if ((BMI >= 25) && (BMI < 30)){
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("비만");
		} else if (BMI >= 30) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("고도비만");
		}

}

	public void practice8() {
		
		int num1 = 0;
		int num2 = 0;
		String str = "";
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("피연산자 1 입력 : ");
		num1 = scanner.nextInt();
		
		System.out.print("피연산자 2 입력 : ");
		num2 = scanner.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		str = scanner.next();
		
		
		
		if(str.equals("+"))
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		
		if(str.equals("-"))
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		
		if(str.equals("*"))
			System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		
		if(str.equals("/"))
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		
		if(str.equals("%"))
			System.out.printf("%d % %d = %d\n", num1, num2, num1%num2);
		
		else System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		
		return;
	}

	public void practice9() {
		
		double mx = 0.0;
		double fx = 0.0;
		double homework = 0.0;
		double att = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		mx = scanner.nextDouble();
		System.out.print("기말 고사 점수 : ");
		fx = scanner.nextDouble();
		System.out.print("과제 점수 : ");
		homework = scanner.nextDouble();
		System.out.print("출석 횟수 : ");
		att = scanner.nextDouble();
		
		double result1 = 0.0;
		double result2 = 0.0;
		double result3 = 0.0;
		double result4 = 0.0;
		double result5 = 0.0;
		
		result1 = mx * 0.2;
		result2 = fx * 0.3;
		result3 = homework * 0.3;
		result4 = (att / 20) * 20;
		result5 = result1 + result2 + result3 + result4;
		
		System.out.println("=========== 결과 ==========");

		System.out.printf("중간 고사 점수(20) : %.1f\n", result1);
		System.out.printf("기말 고사 점수(30) : %.1f\n", result2);
		System.out.printf("과제  점수(30) : %.1f\n", result3);
		System.out.printf("출석 점수(20) : %.1f\n", result4);
		System.out.printf("총점 : %.1f\n", result5);
		
		if((result5 >= 70) && (att >= 14)){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
		
	}

	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		
		char function = '\u0000';
		Scanner scanner = new Scanner(System.in);
		ConditionPractice mine = new ConditionPractice();
		
		
		do { 
		
			System.out.println();
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수 / 홀수");
			System.out.println("3. 합격 / 불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. Pass / Fail");
			System.out.println("Q(q) : 프로그램 종료");
			System.out.println();
			
			function = scanner.nextLine().charAt(0);
			
			switch(function) {
			case '1':
				mine.practice1();
				break;
			case '2':
				mine.practice2();
				break;
			case '3':
				mine.practice3();
				break;
			case '4':
				mine.practice4();
				break;
			case '5':
				mine.practice5();
				break;
			case '6':
				mine.practice6();
				break;
			case '7':
				mine.practice7();
				break;
			case '8':
				mine.practice8();
				break;
			case '9':
				mine.practice9();
				break;
				
			case 'Q':
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default :
				System.out.println("번호를 다시 입력하세요.");
					
			}
			
		} while(true);
		
		
		
		
	}
}

