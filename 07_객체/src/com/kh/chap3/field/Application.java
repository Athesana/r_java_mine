package com.kh.chap3.field;

// protected, deafult 접근 제한자 확인을 위한 Applicaiton.java
public class Application {

	public static void main(String[] args) {
	
		A_Field fieldTest = new A_Field();
		
//		public -> 어디서든 도트 연산자를 통해서 필드에 직접 접근이 가능하다. 다른 프로젝트는 노노!
		 System.out.println(fieldTest.publicField);
				
//		protected -> 같은 패키지 내에 존재하거나 상속 구조에서만 접근이 가능하다. -> 필드 직접 접근 가능
		 System.out.println(fieldTest.protectedField); 
				
//		default -> 같은 패키지 내에서만 접근이 가능하다. -> 필드 직접 접근 가능
		System.out.println(fieldTest.defaultField);  
				
//		private - > 같은 클래스 내에서만 접근이 가능하다. -> 같은 클래스 내가 아니라서 접근 불가능
//		System.out.println(fieldTest.privateField); 
		
	}

}
