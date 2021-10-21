package com.kh.inherit;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

		//ing
		//3명의 학생 정보를 기록할 수 있게 객체 배열 할당(Student[])
		//위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력
		
		//최대 10명의 사원 정보를 기록할 수 있게 배열을 할당(Employee[])
		//사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		//입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체를 생성
		//한 명씩 추가 될  때마다 카운트함
		
		//계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체를 추가
		//'n'일 경우 더 이상 그만 입력 받도록
		
		//배열에 담긴 사원들의 정보를 모두 출력
		
		Student[] student = new Student[3];
		
		
		
		// Student 객체 생성
	
		// Employee 객체 생성
		Employee employee = new Employee("박보검", 28, 180.3, 72.0, 100000000, "영업부");
		
		//출력구문
		
		System.out.println(employee.information());
	
	}

}
