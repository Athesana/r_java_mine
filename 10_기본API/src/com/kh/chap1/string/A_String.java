package com.kh.chap1.string;

import java.util.StringTokenizer;

public class A_String {
	
	public void method1() {
		// 문자열 리터럴(1,2)과 new 문(3,4)으로 생성되는 문자열 비교하기
		// str1, str2와 같이 리터럴로 값을 초기화하면 StringPool 영역에 값이 저장된다.
		// StringPool 영역에 중복되는 값이 존재할 수 없다. 기본에 존재하는 값이 있을 경우는 존재하는 값의 주소값을 전달해준다.
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));  // 참조변수라서 주소비교를 한다.true
//		-> 리터럴 값은 한 번 메모리 영역에 저장이 되면 동일한 리터럴을 사용하면 기존 만들어진 것의 주소값을 넘겨준다.
		System.out.println("str1 == str3 ? " + (str1 == str3));  // false
		System.out.println("str3 == str4 ? " + (str3 == str4));  // false
//		-> new 키워드를 사용하면 동일한 문자열을 가지고 있어도 새로 heap영역에 객체를 생성하고 그 객체가 해당 문자열을 가질 수 있게 만들어준다.
		
		// 문자열의 동등비교는 ==를 사용하지 않고 equals를 활용한다.
		// eqauls() => String 클래스에서 이미 오버라이딩 되어 있다. 문자열 데이터가 동일하면 true.
		System.out.println("str1.equals(str2) ? " + str1.equals(str2)); // true
		System.out.println("str1.equals(str3) ? " + str3.equals(str3)); // true
		System.out.println("str2.equals(str3) ? " + str3.equals(str4)); // true
		
		// hashCode() => String 클래스에 이미 오버라이딩 되어 있다. 문자열 데이터가 동일하면 동일한 해시코드를 갖도록.
		// 나중에 컬렉션에서 문자열은 알아서 정렬이나 중복제거할 때 사용한다.
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		System.out.println("str3.hashCode() : " + str3.hashCode());
		System.out.println("str4.hashCode() : " + str4.hashCode());
		
		// 문자열 객체의 실제 주소값에 대해서 알고싶으면 이 정적 메소드 사용하기. (1,2는 같고 3, 4는 다르다)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		//toString() => String 클래스에 이미 오버라이딩 되어있다. toString 안 쓰고 참조값만 써도 결과가 같다. 
		// why? 오버라이딩? 내부적으로 print 메소드 안에서 toString을 받아서 객체의 문자열을 출력해줘서 참조값만 넘겨도 된다.
		System.out.println(str1.toString());  // hello
		System.out.println(str2);  // hello
		System.out.println(str3);  // hello
		System.out.println(str4);  // hello
		
	}
	
	public void method2() {
		
		//String 클래스가 제공하는 메소드 사용해보자!
		String str = "Hello World!";
		
		// 1. charAt(int index) : 전달받은 index 위치의 하나의 문자만 추출해서 리턴한다.
		char ch = str.charAt(3);  // l
		System.out.println(ch);
		System.out.println();
		
		// 2. concat(String str) : 매개변수로 문자열을 받는다. 
		//			전달받은 str 문자열과 원본 문자열을 하나로 합쳐진 새로운 문자열을 생성해서 리턴. 원본 문자는 수정 못하니까!
		String str2 = str.concat("!!!!!");  // 기존 문자열 + !!!!! 붙인 형태가 된다.
		System.out.println(str);  // Hello World! 원본값은 안 변했음
		System.out.println(str2);  // Hello World!!!!!!
		System.out.println();
		
		// 3. substring(int beginIndex) : 문자열의 beginIndex 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴한다.
		//	  substring(int beginIndex, int endIndex) : 문자열의 beginIndex 위치에서부터 endIndex-1 까지의 새로운 문자열 생성해서 리턴
		
		String str3 = str.substring(6);  // World!, 원본은 변하지 않음
		String str4 = str.substring(2, 6);  // llo  
		
		System.out.println(str3);
		System.out.println(str); // 원본은 안 변했음
		System.out.println(str4);
		
		
		// 4. replace(char oldChar, char newChar) : 문자열에서 old 문자를 new 문자로 변경된 새로운 문자열을 생성해서 리턴한다.
		String str5 = str.replace('l', 'c');  // l을 c로 바꿔라.
		System.out.println(str5);  // Hecco Worcd!
		System.out.println(str);  // String은 불변 객체니까 뭔 짓을 해도 안 바뀌고 있음.
		
		// 5. toUpperCase() / toLowerCase() : 문자열을 모두 대/소문자로 변경한 새로운 문자열을 생성해서 리턴한다.
		System.out.println(str.toUpperCase());  // HELLO WORLD!
		System.out.println(str.toLowerCase());  //hello world!
		System.out.println(str); //Hello World!
		
		// 6. trim() : 문자열의 앞뒤에 공백이 있으면 제거하고 새로운 문자열을 생성해서 리턴한다.
		str = " java ";
		System.out.println(str.trim());  //'java'
		System.out.println(str);  //' java '
		
		// 7. toCharArray() : 문자열의 문자들을 문자 배열에 담아서 해당 배열의 주소값을 리턴한다.
		str = "Hello";
		char[] arr = str.toCharArray();
		 
		System.out.println(arr[0]);  // H출력
		System.out.println();

		// 8. valueOf([기본 자료형, 문자 배열, 객체]) : 정적메소드, 입력받은 값들을 문자열로 변경해서 리턴한다.
		String str6 = String.valueOf(true);    // 정적 메소드=클래스멤버라서 객체로 접근하는게 아니고 클래스로 접근하세요. static 호출하려면 -> 클래스명.
		String str7 = String.valueOf(arr);  // Hello
		String str8 = String.valueOf(3.141592F);
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
		System.out.println();
		
		
	}
	
	public void method3() {
		// 구분자를 이용하여 문자열 분리
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 1. String 클래스 split 메소드 이용하는 방법
		// split(String regex) : 입력받은 구분자로 문자열을 분리해서 문자열의 배열로 담아서 리턴한다.
		String[] strArr = str.split(",");   //alt + shift + l 단축키 사용되는
		System.out.println("strArr.length : " + strArr.length);  // strArr.length : 6
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		// 2. StringTokenizer 객체를 이용하는 방법
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("분리 후 문자열의 개수 : " + st.countTokens());
		
		// <1> for문을 통한 출력
//		int length = st.countTokens();  // 현재 남아있는 토큰의 갯수를 리턴해주는 거(5 -> 4-> 3...이렇게 감소함)
		
//		i = 0, 1, 2, / c = 6, 5, 4, /둘 다 3이 될 때 조건식에 부합하지 않아서 for문 탈출해버려. 우리가 원하는 결과가 안 나옴
//		for(int i = 0; i < length; i++) {  // length 대신에 st.countTokens로 들어가면 점점 줄어드는 숫자보다 작아지니까 맞물릴 때 조건에 안 맞아서 FOR문 탈출
//			System.out.println(st.nextToken());
//		}
		
		// <2> while문을 통한 출력(주로 객체 출력할 때 사용)
		while(st.hasMoreTokens()) {   // 토큰 가지고 있는지 확인하고 있으면 true, 없으면 false
			System.out.println(st.nextToken());
		}
		
		
		
		
	}
	
}
