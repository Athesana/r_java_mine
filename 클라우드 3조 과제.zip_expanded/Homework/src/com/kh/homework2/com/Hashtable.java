package com.kh.homework2.com;

import java.util.LinkedList;

public class Hashtable {
	/*
	 * Hashtable 
	 * 		- key, value의 쌍으로 구성된 데이터를 저장하는 Map을 구현한 자료구조
	 * 		- 입력된 데이터를 Hashing을 통해 매핑하여 저장
	 * 		- key, value가 한 쌍으로 존재하기 때문에 삽입/삭제/검색 등의 평균적인 시간 복잡도는 O(1)에 수렴(빠른 속도)
	 * 		- 상호 간에 순서/상관관계가 없는 데이터를 저장하기에 적합
	 * 
	 * 
	 * - Hashing(해싱) : 입력한 key값을 해시 함수를 통해 배열의 인덱스로 사용할 hash값(Hash Code)으로 매핑하는 과정
	 * 
	 * - Hash Function(해시 함수) : 연산을 통해 데이터를 분류하여 고유한 인덱스 값을 반환하는 역할
	 * 							 1. Division Method : key값을 테이블의 크기로 나눈 나머지를 인덱스로 사용
	 * 							 2. Digit Folding : key값의 각 자리수를 합산한 값을 인덱스로 사용(문자열은 ASCII 코드로 변환하여 합산)
	 * 							 3. Multiplication Method : 숫자로 된 key값 k, 0~1 사이의 실수인 A, 2의 제곱수인 m을 넣은 식으로 연산한 결과를 인덱스로 사용
	 * 														(h(k) = (kA mod1) x m) (2진수 연산에 최적화된 컴퓨터를 고려한 해시 함수.)
	 * 							 4. Universal Hashing : 여러개의 해시 함수를 만든 후, 무작위로 해시 함수를 선택하여 해싱하는 방법
	 * 
	 * - Hash Collision(해시 충돌) : 서로 다른 key값이 해시 함수를 통해 연산된 결과가 동일할 경우 발생
	 * 							  1. Separate Chaining(분리 연결법) : 하나의 인덱스에 Linked List를 선언하고 이 리스트에 여러개의 value값 저장
	 * 			  				  2. Open Addressing(개방 주소법) : 사용하지 않은 빈 인덱스를 찾아 데이터를 저장
	 * 
	 * Hashtable vs HashMap ?
	 * 	- Hashtable은 동기화를 지원하여 Thread-Safe하므로 멀티 스레드 환경에 적합
	 *  - Hashtable은 key와 value에 null값을 저장할 수 없음
	 */
	
	
	// 이름의 첫번째 알파벳으로 인덱스를 정하는 해시함수를 통해 전화번호부를 Hashtable에 저장하기
	// 단, 해시 충돌 발생 시 Separate Chaining으로 해결
		// 이름, 전화번호로 구성된 Contacts 클래스 만들기
		public class Contacts{
			String key; // 이름
			String value; // 전화번호
			public Contacts(String key, String value) {
				this.key = key;
				this.value = value;
			}
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
			
		}

		// Contacts 클래스로 Linked List 선언
		private LinkedList<Contacts>[] data;
		
		public Hashtable(int size) {
			this.data = new LinkedList[size];
		}
		
		// 이름의 첫번째 알파벳으로 해시코드 지정
		int getHashCode(String key) {
			int hashCode = key.charAt(0);
			return hashCode;
		}
		
		// 해시 함수로 Division Method 사용 (테이블의 크기 = 알파벳의 갯수인 26) 
		int getIndex(int hashCode) {
			return hashCode % 26;
		}
		
		// 데이터 검색 메소드
		Contacts searchContacts(int index, String key) {
	        LinkedList<Contacts> indexedList = data[index];

	        for (Contacts contacts : indexedList) {
	            if (contacts.key == key) {
	            	return contacts;
	            }
	        }

	        return null;
	    }
		
		// 해시 테이블에 데이터 입력
	    public void put(String key, String value) {
	        int hashCode = getHashCode(key);
	        int index = getIndex(hashCode);
	        // 입력받은 key값으로 얻은 인덱스에 Linked List 생성
	        if (data[index] == null) {
	            data[index] = new LinkedList<Contacts>();
	            data[index].add(new Contacts(key, value));
	        }
	        else { // 해시 충돌 발생 시(첫번째 알파벳이 같을 경우), 해당 인덱스에 존재하는 Linked List에 데이터 추가 저장
	        	Contacts searched = searchContacts(index, key);

	            if (searched != null) {
	            	searched.value = value;
	            } else {
	            	data[index].add(new Contacts(key, value)); 
	            	}
	        }
	    }
	    
	    // 해시 테이블에서 데이터 추출
	    public String get(String key) {
	        int hashCode = getHashCode(key);
	        int index = getIndex(hashCode);

	        Contacts searched = searchContacts(index, key);

	        if (searched == null) { 
	        	return "검색 결과가 없습니다.";
	        } else {
	        	return searched.value;
	        	}
	    }
	
	    public void method() {
	    	Hashtable ht = new Hashtable(26);
	    	ht.put("Amy", "010-0000-0000");
			ht.put("Penny", "010-1234-5678");
			ht.put("Alice", "010-1111-1111");
			ht.put("Billie", "010-8765-4321");
			ht.put("Blair", "010-0000-0000");
			
			System.out.println("Amy " + ht.get("Amy"));
			System.out.println("Penny " + ht.get("Penny"));
			System.out.println("Alice " + ht.get("Alice"));
			System.out.println("Billie " + ht.get("Billie"));
			System.out.println("Blair" +  ht.get("Blair"));
	    }
	    
	    
	    
}
