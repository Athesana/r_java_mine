package com.kh.chap1.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.chap1.list.compare.ArtistASending;
import com.kh.chap1.list.compare.TitleASending;
import com.kh.chap1.list.model.vo.Music;

public class A_ArrayList {

	public void method1() {
		//ArrayList의 생성, 저장, 출력 테스트
		
		/*
		 *  ArrayList
		 *   - ArrayList를 생성하면 내부적으로 10개의 객체를 저장할 수 있는 공간이 생성된다.
		 *   - 저장 순서가 유지되고 인덱스를 통해서 관리된다.
		 *   - 객체만 저장이 가능, null 값 저장 가능
		 *   - 중복되는 객체의 저장 허용
		 *   
		 */
		
		List list = new ArrayList(); // heap 영역에 arraylist 객체가 생성됨. 데이터는 없음
		
		System.out.println("list.isEmpty() : " + list.isEmpty()); // 저장된 데이터가 없으면 true가 나옴
		
		list.add("안녕하세요.");
		list.add(3.14);  // AutoBoxing 적용
		list.add(LocalDateTime.now());
		
		System.out.println("list : " + list);  // [안녕하세요., 3.14, 2021-09-10T09:42:12.412957]
		System.out.println("Size : " + list.size());  // 3
		
		
		for(int i = 0; i < list.size(); i++) {  // 인덱스라서 0번부터 시작
			// 인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용
			System.out.println(list.get(i));
		}
		
//		// 제네릭스(타입 지정)하지 않으면 list에서 값을 꺼내서 대입하기 위해서 해당 자료형에 맞게 형변환 해줘야 한다. (단점)
//		String str = (String) list.get(0);  
//		int num = (int) list.get(3);
		
		
		
		System.out.println();
		
		// 객체의 중복 저장 허용, add는 맨 끝에 저장
		list.add("안녕하세요."); 
		System.out.println("list : " + list);
		
		// 원하는 인덱스 위치에 객체를 추가해보자. 그 위치부터는 하나씩 뒤로 밀려서 인덱스가 바뀐다.
		list.add(2, 1234500);
		System.out.println("list : " + list);
		
		// 값이 바뀌는게 아니라 새로 추가가 되고 하나씩 또 밀린다. 계속 추가의 역할만 한다.
//		list.add(2, false);
		list.set(2, false);    set : // 해당하는 인덱스 위치의 객체를 변경한다.
		System.out.println("list : " + list);
		
		list.remove(2);
		System.out.println("list : " + list);
		
		// 저장된 객체를 삭제할 때는 remove() 메소드를 사용한다. index거나 object거나 
		// 앞에서부터 찾아서 발견하면 지우고 나머지는 확인X 지우지 않는다. 처음에 확인되는 동일한 객체만 지운다.
		list.remove("안녕하세요.");
		list.remove(3.14);
//		list.remove(Integer.valueOf(1));  **강의 다시 듣기
		System.out.println("list : " + list);
		System.out.println("list.isEmpty() : " + list.isEmpty());  // 현재 List 객체에 값이 있느냐? 비어있으면 true, 있으면 false
		
		//저장된 객체를 모두 삭제할 때는 clear() 메소드를 사용한다.
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list.isEmpty() : " + list.isEmpty());  
		
		
	}
	
	public void method2() {
		
		/*
		 * 리스트 정렬
		 *  - 기본 자료형, 문자열의 경우에는 Comparable 인터페이스가 내부적으로 구현되어 있어서 Collections.sort() 메소드를 통해서 정렬 가능
		 *  - 사용자가 작성하는 클래스의 객체도 Collections.sort()를 통해서 정렬이 가능하게 하고 싶다면 Comparable 인터페이스를 구현해야 한다.
		 * 
		 * 제네릭스(<>)를 사용하는 이유
		 *  - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다.
		 *  - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환을 하지 않아도 된다.
		 */
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();   // Integer 객체만 전달 가능
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("mango");
		list.add("grape");
		
		list2.add(7);
		list2.add(1);
		list2.add(8);
		list2.add(10);
		list2.add(3);
		list2.add(2);
		
		
		System.out.println(list);
		System.out.println(list2);
		
		// 오름차순으로 정렬해보자.
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		// 내림차순으로 정렬해보자.
		Collections.reverse(list);
		Collections.reverse(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		
	}
	
	public void method3() {
		
		// Music 객체를 list에 담아서 출력하고 정렬해보기
		
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("Permission to Dance", "BTS", 1));
		list.add(new Music("Butter", "BTS", 2));
		list.add(new Music("Ice Cream", "BlackPink", 5));
		list.add(new Music("Die For You", "TheWeeknd", 3));
		list.add(new Music("널 너무 모르고", "헤이즈", 4));
		
		// 그냥 저장된 순서대로 출력
		for(Music music : list) {
			System.out.println(music);
		}

		System.out.println();
		
		//오름차순
		Collections.sort(list);  // 원래는 Comparable 인터페이스가 내부적으로 구현하지 않아서 오류가 난다. music 클래스에서 implements Comparable<Music> 써줘야 한다.
								 // 이렇게 쓰거나 music 메소드에서 조건문 등호 < > 를 바꾸면 reverse 사용 안해도 역순으로 정렬할 수 있다.
		for(Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		//내림차순
//		Collections.reverse(list);
//		
//		for(Music music : list) {
//			System.out.println(music);
//		}
		
		//타이틀대로 정렬해보자!
		
		Collections.sort(list, new TitleASending());
		
		for(Music music : list) {
			System.out.println(music);
		}
		
		
		System.out.println();
		
		Collections.sort(list, new ArtistASending());
		
		for(Music music : list) {
			System.out.println(music);
		}
		
		
	}

	
}
	

