package com.kh.chap3.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap3.map.model.vo.Snack;

public class A_Hashmap {

	public void method1() {
		
		Map<String, Snack> map = new HashMap<>();
		
		// 저장 순서 유지 안된다.
		// 키 값 중복 안된다. 중복된 키 값으로 저장하면 기존에 있던 값(value)을 덮어쓴다.
		// value 값은 중복되어도 잘 저장된다.
		// map은 데이터를 저장할 때 put 메소드 사용한다.
		
		map.put("다이제", new Snack("초코맛", 1200));
		map.put("칸초", new Snack("바나나맛", 250));
		map.put("허니버터칩", new Snack("꿀맛", 500));
		map.put("칸초", new Snack("초코맛", 250));
		map.put("꼬북칩", new Snack("오리지널", 1200));
		map.put("꼬북칩", new Snack("초코맛", 1200));
		
		System.out.println(map);
		
		// Map 컬렉션에서 키 값에 해당하는 value를 가져오는 메소드
		Snack snack = map.get("다이제");
		
		System.out.println(snack);
		System.out.println();
		
		// Map 컬렉션에 담겨있는 Entry 객체들의 개수를 가져오는 메소드
		System.out.println("개수 : " + map.size());
		System.out.println();
		
		// 키 값에 해당하는 Entry 객체를 삭제하는 메소드
		map.remove("칸초");
		System.out.println(map);
		System.out.println(map.isEmpty()); // 칸초 지웠어도 아직 엔트리 3개 남아있어서 false 나옴
		System.out.println();
		
		// Map 컬렉션에 담겨있는 모든 Entry 객체를 삭제하는 메소드
		map.clear();
		System.out.println(map);    //{} 엔트리만 삭제되고 비어있는 모양
		System.out.println(map.isEmpty()); // true
		System.out.println();

		
	}
	
	
	
	
	public void method2() {
		
		Map<String, Snack> map = new HashMap<>();
		
		map.put("다이제", new Snack("초코맛", 1200));
		map.put("칸초", new Snack("바나나맛", 250));
		map.put("허니버터칩", new Snack("꿀맛", 500));
		map.put("꼬북칩", new Snack("오리지널", 1200));
		map.put("나초", new Snack("짠맛", 600));
		
		// Map은 인덱스의 개념이 없어서 일반 반복문 사용 불가능, 향상된 for문도 사용 불가능
//		for(Entry<String, Snack> i : map) {
//		}
		
		// List랑 Map 구조가 달라서 ArrayList에 담아서 출력하는 것도 사용할 수 없다.
//		List<Entry<String, Snack>> list = new ArrayList<>(map);
		
		// 1. keySet() 이용하는 방법
		// - keySet() 메소드는 Map 컬렉션에 있는 키 값들만 Set 컬렉션에 담아서 반환한다. (키는 셋으로 가져오고 겟으로 벨류값 나오게 하기)
		// - 반환된 Set 컬렉션에서 반복자를 얻어서 반복 처리를 할 수 있다.
		Set<String> keySet = map.keySet();  // KEY의 타입은 String 타입으로 고정
		Iterator<String> iterator = keySet.iterator(); 
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
		
		System.out.println();
		
		// Set으로 변경하게 되면 반복자 사용하지 않고 아래와 같이 향상된 for 문을 통해서도 출력이 가능하다.
		for(String key : keySet) {
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
		
		System.out.println();
		
		// 2. entrySet() 이용하는 방법
		// - entrySet() 메소드는 Map 컬렉션에 있는 Entry 객체(key와 value 쌍으로 이루어진 객체)를 Set 컬렉션에 담아서 반환
		// - 반환된 Set 컬렉션에서 반복자를 얻어서 반복 처리를 할 수 있다.
		
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		Iterator<Entry<String, Snack>> it = entrySet.iterator();
		
//		while(it.hasNext()) {
//			Entry<String, Snack> entry = it.next();
//			
//			System.out.println("key : " + entry.getKey());
//			System.out.println("value : " + entry.getValue());
//		}
		
		// Set으로 변경하게 되면 반복자 사용하지 않고 아래와 같이 향상된 for 문을 통해서도 출력이 가능하다.
		for(Entry<String, Snack> entry : entrySet) {
			System.out.println("key : " + entry.getKey()); 
			System.out.println("value : " + entry.getValue());
		
		
		}
	
	}
}
