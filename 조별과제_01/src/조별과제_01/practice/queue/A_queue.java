package 조별과제_01.practice.queue;

import java.util.LinkedList;
import java.util.Queue;

public class A_queue {
	/*
	 * <자료 구조>
	 * 큐(Queue)
	 *  - 일상생활에서 줄을 서서 기다리는 것, 음식을 주문하는 것과 같은 형태이다.
	 *  - 맨 앞(front)에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가한다.
	 *  - 한 쪽 끝에서 삭제 작업(front)이, 다른 쪽 끝에서 삽입 작업(rear)이 양쪽으로 이루어진다.
	 *  - 삭제연산은 deQueue, 삽입연산을 enQueue라고 부른다.
	 *  - 즉, 가장 오래전에 입력된 데이터를 front라고 하고 가장 최근에 입력된 데이터를 rear라고 한다.
	 *  - 큐를 구현하기 위해서는 배열을 이용하거나 front노트와 rear 노드를 관리하는 '연결리스트'를 이용한다.
	 *  - 구현하는 방법에 따라 선형 큐, 원형 큐, 연결 큐로 구분된다.
	 *  
	 *  - First In First Out(선입선출) 구조
	 *  - 순차적으로 입력된 자료를 순서대로(시간의 순서대로) 처리하는데 많이 사용하는 자료구조이다.
	 *  - 자바에서 Queue는 Collection<E> 인터페이스를 상속받는 인터페이스이므로 별도의 클래스가 없고, 객체생성이 불가능하다.
	 *  - 따라서 데이터 생성을 위해서는 java.util에 있는 LinkedList 클래스를 사용한다.
	 *  - 상황에 따라서 ArrayDeque, PriorityQueue와 같은 큐 인터페이스를 구현하는 라이브러리를 사용하기도 한다.
	 *  
	 *  - 사용분야 : 마트 계산대, 은행 창구 대기 열, 공항 이륙대기 중인 비행기, 프린터 인쇄 목록 등
	 *  
	 *  큐의 메소드
	 *  1. offer() : 맨 끝에 데이터를 추가한다. (반환값이 있다. 삽입 실패하면 false를 반환한다.) 
	 *  1-1. add() : 맨 끝에 데이터를 추가한다. (반환값이 없다. 삽입 성공하면 true, 여유 공간이 없어 삽입 실패하면 IllegalStateException 발생 -> 예외를 throw 해야한다.)
	 *  2. poll() : 첫 번째로 들어온 데이터를 반환하고 해당 데이터를 삭제한다. 삭제할 요소가 없다면 null을 반환한다.
	 *  3. peek() : 첫 번째로 들어온 데이터를 반환한다. poll과 달리 큐에서 데이터를 삭제하지 않는다.
	 *  4. size() : 큐의 현재 size를 확인한다.
	 *  5. element() : 큐의 가장 앞에 있는 head 데이터를 반환한다.
	 *  6. isEmpty() : 큐가 비어있는지 확인한다. 비어있지 않으면 false, 비어있으면 true를 반환한다.
	 *  7. isFull() : 큐가 가득찼는지 확인한다. 데이터를 저장할 위치인 rear가 배열의 크기에 도달하면 true를 반환한다.
	 *  8. remove() : 큐의 첫 번째 값을 제거한다.
	 *  9. clear() : 큐 초기화한다. 큐의 모든 요소를 제거한다.
	 *  
	 * 
	 */
	
	public void method1() {
		
//		자료형 매개 변수를 사용해서, 큐에 들어갈 데이터의 타입을 지정한다.
		Queue<String> q = new LinkedList<>();  //String형의 Queue를 선언한다.
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		q.offer("5");
		
		System.out.println("===Queue 데이터 추가===");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			
		}
		
		System.out.println();
		
	}
	
	
	public void method2() {
		System.out.println("===Queue 데이터 출력===");
		Queue<String> q = new LinkedList<>();
		
		q.add("Hello World1");
		q.add("Hello World2");
		q.add("Hello World3");
		q.add("Hello World4");
		q.add("Hello World5");
		System.out.println("첫 번째 값 출력 : " + q.peek());
		System.out.println();
	}
	
	

	public void method3() {
		System.out.println("===Queue 메소드 활용해보기===");
		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.isEmpty());
		
		q.offer("100");
		q.offer("200");
		q.offer("300");
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.toString());
		System.out.println("큐의 사이즈 : " + q.size());
		System.out.println("큐의 head : " + q.element());
		System.out.println("첫 번째로 들어온 데이터 : " + q.peek());
		System.out.println("첫 번째로 들어온 데이터 반환 : " + q.poll());
		System.out.println(q.toString());
		System.out.println("큐의 현재 head : " + q.element());
		System.out.println("두 번째로 들어온 데이터 반환 : " + q.poll());
		System.out.println("세 번째로 들어온 데이터 반환 : " + q.poll());
		
		System.out.println(q.size());
		System.out.println(q.isEmpty());
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
