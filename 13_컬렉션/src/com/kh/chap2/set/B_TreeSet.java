package com.kh.chap2.set;

import java.util.Set;
import java.util.TreeSet;

import com.kh.chap2.set.model.vo.Music;

public class B_TreeSet {
	
	public void method1() {
		TreeSet<String> ts = new TreeSet<>();
		
		// 중복제거, 저장 순서 유지 안됨(단, 객체를 오름차순으로 정렬한다.)
		ts.add("하하하");
//		ts.add(null);  NullPointerException 발생
		ts.add("나나나");
		ts.add("가가가");
//		ts.add(null);
		ts.add("다다다");
		ts.add("다다다");
//		ts.add(null);
		ts.add("하하하");
		
		System.out.println(ts);
		System.out.println();
		
		for(String str : ts) {
			System.out.println(str);
		}
		
	
	}

	public void method2() {
		
		Set<Music> set = new TreeSet<>();
		
		// 중복제거 : equals(), hashCode() 메소드를 가지고 판단해서 중복을 제거한다.
		// 저장 순서는 유지되지 않지만, 우리가 재정의한 compareTo()라는 추상 메소드에 의해 오름차순으로 정렬된다. 
		// Set객체에 객체를 add할 때 애초에 어떠한 정렬 기준으로 정렬 시킬지 Comparabel 인터페이스를 구현하지 않으면, ClassCastException 발생 
		set.add(new Music("Permission to Dance", "BTS", 1));
		set.add(new Music("Permission to Dance", "BTS", 1));
		set.add(new Music("Butter", "BTS", 2));
		set.add(new Music("Ice Cream", "BlackPink", 5));
		set.add(new Music("Ice Cream", "BlackPink", 5));
		set.add(new Music("Die For You", "TheWeeknd", 3));
		set.add(new Music("Die For You", "TheWeeknd", 3));
		set.add(new Music("널 너무 모르고", "헤이즈", 4));
		
		for (Music music : set) {
			System.out.println(music);
		}
		
	}
	
}
