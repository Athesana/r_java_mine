package com.kh.chap1;

import com.kh.chap1.encapsulation.Student;

public class Application {
	
	/*
	 * 추상화와 캡슐화
	 * 
	 * 1. 추상화
	 *  - 프로그램에서 사용할 객체들이 가진 공통의 특성을 파악하고 불필요한 특성들을 제거하는 과정
	 *  - 최종적으로 선정된 속성들을 가지고 어떤 자료형, 어떤 변수명으로 사용할지 정리해서 코드로 작성한다.
	 * 2. 캡슐화
	 *   - 추상화를 통해서 정의된 속성들과 기능을 하나로 묶어서 관리하는 기법 중 하나
	 *   - 클래스의 가장 중요한 목적인 데이터 접근 제한을 원칙으로 외부로부터 데이터의 직접 접근을 제한하고 
	 *     대신에 데이터를 간접적으로 처리하는 메소드들을 클래스 내부에 작성하여 제공하는 방법
	 * 	 - 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것을 말한다.
	 *   - how? 외부에서 객체의 내부를 알지 못하며 객체가 노출해서 제공하는 필드나 메소드만 이용 가능
	 */

	public static void main(String[] args) {
		// 변수만 가지고 프로그램에서 필요한 객체를 만들어 보자!
		// 이산아 학생의 객체 만들기
		String name = "이산아";
		int age = 20;
		int id = 1001;
		int mathScore = 90;
		
		// 홍길동 학생의 객체 만들기
		String name2 = "홍길동";
		int age2 = 400;
		int id2 = 1002;
		int mathScore2 = 30;
		
//		// 클래스를 만들고나서 객체 만들기 위해서 new 연산자 통해서 Heap 영역에 생성해야 한다.
//		Student lee = new Student();    // 인스턴스(객체) 생성
//		Student hong = new Student();
//		
//		// 필드에 직접 접근해서 값을 '초기화'
//		lee.id = 1001;
//		lee.name = "이산아";   // . 도 도트연산자라고 한다. 기능에 접근 가능
//		lee.age = 20;
//		lee.address = "경기도 시흥시";
//		lee.gender = "여자";
//		lee.mathScore = 50;
//		lee.engScore = 90;
//		
//		hong.id = 1002;
//		hong.name = "홍길동";
//		hong.age = 400;
//		hong.address = "서울 특별시";
//		hong.gender = "남자";
//		hong.mathScore = 80;
//		hong.engScore = 60;
//		
//		// 필드에 직접 접근해서 값을 출력
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d입니다.\n", lee.name, lee.mathScore, lee.engScore);
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d입니다.\n", hong.name, hong.mathScore, hong.engScore);
//		
//		필드에 직접 접근하면 값이 변경되버릴 수도 있다.
//		
//		Student lee = new Student();
//		
//		int leeId = lee.getId();  // lee라는 객체에서 여기에서 getId를 호출하는 중!
//		// getId를 통해서 필드의 id 값을 전달 받기 -> 초기화 안된 상태에서는 0으로 나옴
//		System.out.println(leeId);
//		
//		lee.setId(20);   // setter로 값을 변경해줬음
//		
//		leeId = lee.getId();
//		
//		System.out.println(leeId);   // 잘 변경됐는지 확인하기 위해 getter로 한 번 더 값을 가져와서 출력해 본다.
		
		Student lee = new Student();
		Student hong = new Student();
		
		// 캡슐화 작업으로 인해 접근을 막았다면, 간접적으로 접근을 할 수 있도록 메소드를 제공하낟. <각각의 필드에다가 초기화 작업을 해보자!>
		lee.setId(1001);
		lee.setName("이산아");
		lee.setAge(20);
		lee.setAddress("경기도 시흥시");
		lee.setGender("여자");
		lee.setMathScore(-50);
		lee.setEngScore(-90);
		
		
		hong.setId(1002);
		hong.setName("홍길동");
		hong.setAge(400);
		hong.setAddress("서울 특별시");
		hong.setGender("남자");
		hong.setMathScore(80);
		hong.setEngScore(50);
		
		
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d입니다. 주소는 %s 입니다.\n", lee.getName(), lee.getMathScore(), lee.getEngScore(), lee.getAddress());
		
		//위에처럼 쓰기 너무 귀찮아서 메소드를 하나 만들 거야. information() 위에서 만들은 printf 정보를 만들어서 그걸 반환한다.
		System.out.println(lee.information());
		System.out.println(hong.information());
		
		
	}

	
	
}
