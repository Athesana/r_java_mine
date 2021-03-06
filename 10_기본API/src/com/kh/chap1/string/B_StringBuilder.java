package com.kh.chap1.string;

public class B_StringBuilder {

	public void method1() {
		//StringBuilder의 기본생성자를 통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
		//StringBuilder의 생성자에 정수 값 임의로 적어서 전달해주면 해당 크기만큼의 버퍼가 지정된다.
		//StringBuilder의 생성자에 문자열을 전달해주면 문자열 크기 + 16의 버퍼(수용량)가 생성된다.
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(30);
		StringBuilder sb2 = new StringBuilder("Hello");
		
		System.out.println("sb의 문자열 길이 : " + sb.length());  // 0
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); // 16
		System.out.println("sb1의 문자열 길이 : " + sb1.length());   // 0
		System.out.println("sb1의 버퍼의 크기 : " + sb1.capacity());  // 30
		System.out.println("sb2의 문자열 길이 : " + sb2.length()); // 5
		System.out.println("sb2의 버퍼의 크기 : " + sb2.capacity());  // 21 (문자열 크기 5 + 16 버퍼)
		
	}
	
	public void method2() {
		//StringBuilder를 이용한 문자열 변경
		
		String str = "안녕하세요. ";
		StringBuilder sb = new StringBuilder("안녕하세요. ");
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(sb));
		
		//기존 문자열 뒤에 입력된 문자열 추가하기
		//<기존 방식들>
		str += "저는 이산아 입니다.";
//		str = str + "저는 이산아 입니다."; 
		sb.append("저는 이산아입니다.");
		
		System.out.println("str : " + str);
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());  // 17
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());  // 23
		System.out.println(System.identityHashCode(str)); // 주소 값이 변경됨
		System.out.println(System.identityHashCode(sb));  // 주소 값 변경되지 않았음, append는 내부에서 하는거
		System.out.println();
		
		sb.append("여러분 조금만 힘내세요~!");
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());  // 31
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());  //48
		System.out.println(System.identityHashCode(sb));  // 주소 값 변경되지 않았음
		System.out.println();
		
		// StringBuilder는 문자 중간에 삭제 가능, delete(int start, int end) : start에서 end까지의 인덱스에 해당하는 문자열을 삭제
		sb.delete(2, 5);
		System.out.println("sb : " + sb); // 안녕. 저는 이산아입니다. 여러분 조금만 힘내세요~!
		System.out.println("sb의 문자열 길이 : " + sb.length());  // 28 
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());  // 48 (늘어나지 않고, 부족할 때만 늘어남) 
		System.out.println(System.identityHashCode(sb));  // 주소 값 변경되지 않았음
		System.out.println();
		
		// insert(int offset, String str) : 문자열의 offset 위치부터(1부터 시작해서) 전달받은 문자열을 추가한다.
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println("sb : " + sb); // 안ㅎㅎㅎ녕. 저는 이산아입니다. 여러분 조금만 힘내세요~!
		System.out.println("sb의 문자열 길이 : " + sb.length());  // 31
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());  // 48
		System.out.println(System.identityHashCode(sb));  // 주소 값 변경되지 않았음
		System.out.println();
		
		// reverse() : 문자열의 순서를 역으로 바꾼다.
		sb.reverse();
		
		System.out.println("sb : " + sb);  //!~요세내힘 만금조 분러여. 다니입아산이 는저 .녕ㅎㅎㅎ안
		System.out.println("sb의 문자열 길이 : " + sb.length());  // 31
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());  //48
		System.out.println(System.identityHashCode(sb));  // 주소 값 변경되지 않았음
		System.out.println();
		
		// * 메소드 체이닝 - 여러 개 메소드 연결해서 사용할 수 있다.
		StringBuilder sb2 = new StringBuilder("Java Program");
		
		
		// 아래와 같이 메소드를 이어서 쓸 수 있다.
		// 왜냐면 우리가 사용했던 아래의 메소드들은 반환형 StringBuilder이고 실제 반환되는 결과값이 해당 객체의 주소 값이 반환되기 때문에 가능하다.
		// 이렇게 메소드를 이어서 사용할 수 있는 것을 메소드 체이닝이라고 한다.
		sb2.append("API").delete(4, 11).reverse();
		
		System.out.println("sb2 : " + sb2);
		
		
		
	}
	
	
}
