package com.kh.chap2.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap2.set.model.vo.Music;

//import com.kh.chap1.list.model.vo.Music;

public class A_HashSet {

	public void method1() {
		Set<String> set = new HashSet<>();  // set은 인덱스 개념이 없어서 iterator 반복자를 통해서 접근한다.
		
		set.add(null);	// null도 하나의 값이기 때문에 중복 저장이 안된다.
		set.add("반갑습니다.");
		set.add(new String("반갑습니다."));  // 저장 안됨
		set.add("여러분");
		set.add(null);
		set.add("안녕하세요.");
		set.add("여러분");  // 여기까지 출력해보면 [안녕하세요., 여러분., 반갑습니다.] 
		set.add(null);
		/*
		 * 저장 순서가 유지되지 않고 중복된 데이터는 제거된다.
		 *  - String 클래스에는 hashCode(), equals() 메소드가 오버라이딩 되어있다.
		 *  - 실제 필드 값이 동일한 경우에 동일 객체로 인식되어서 저장되지 않는다.
		 */
		System.out.println(set);
		
		// Set에 저장된 객체에 접근하는 방법 (set에는 get이 없어)
		// 1. 향상된 for문 사용 (인덱스로 접근하는게 아니기 때문에 가능)
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// 2. HashSet에 저장된 객체들의 ArrayList에 담아서 출력하는 방법
		List<String> list = new ArrayList<>(set);  // set에 저장된 값을 가지고 List로 만들어준다.
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 3. Iterator 반복자를 사용하는 방법
		// - 가져올 객체가 있는지 확인할 때는 hasNext() 메소드를 사용한다.
		// - 하나의 객체를 가져올 때는 next() 메소드를 사용한다.
		
		Iterator<String> iterator = set.iterator();   // alt+shift+l 추출 단축키
		
		while(iterator.hasNext()) {  // 가져올게 3개 있어서 true를 가져오고, 처음 안녕하세요를 반환하고 하나 쓰면 나머지 2개밖에 없어 또 true를 리턴하고 
//			현재 가르키는 여러분을 반환하고 호출하고 하나 더 가져올 수 있어서 true 리턴하고 찍고나면 화살표가 끝으로 간다. 
//			이제 한 번씩 다 가져와서 더 이상 가져올게 없어서 이제 false를 리턴하게 되고 반복문을 종료
			System.out.println(iterator.next());
		}
		
		
	}
	
	public void method2() {
		Set<Music> set = new HashSet<>();
		
		/*
		 * Music 클래스는 hashCode(), equals() 메소드를 오버라이딩 하지 않았기 때문에 중복 제거가 되지 않는다.
		 * 기본적으로 Object 객체에 있는 hashCode(). equals() 메소드를 사용하게 된다.
		 * 객체의 주소값을 가지고 비교하기 때문에 필드의 값과 상관없이 모두 다른 객체로 인식해서 중복이 제거되지 않는다.
		 * Music 클래스에서 hashCode(). equals()를 오버라이딩해서 재정의 해줘야 한다.
		 */
		set.add(new Music("Permission to Dance", "BTS", 1));
		set.add(new Music("Permission to Dance", "BTS", 1)); // 위에거랑 데이터가 같아도 주소값은 다르다 = 다른 객체로 인식 = 중복제거 안해줌
		set.add(new Music("Butter", "BTS", 2));
		set.add(new Music("Ice Cream", "BlackPink", 5));
		set.add(new Music("Ice Cream", "BlackPink", 5));
		set.add(new Music("Die For You", "TheWeeknd", 3));
		set.add(new Music("Die For You", "TheWeeknd", 3));
		set.add(new Music("널 너무 모르고", "헤이즈", 4));
		
		for (Music music : set) {
			System.out.println(music);  // 중복 제거는 안된 채로 출력된다.
		}
	}
}


