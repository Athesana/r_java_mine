package com.kh.team;

public class Deque {
	
	/*
	 * Deque(덱 / 데크)
	 *   - 덱은 Double-Ended-Queue의 줄임말로 큐의 양쪽에 데이터를 넣고 뺄 수 있는 형태의 자료구조를 의미한다.
	 *     (하나의 자료구조에 큐(Queue)와 스택(Stack)을 합쳐 놓은 형태라고 생각하면 된다.)
	 *   - Deque의 앞쪽으로 데이터를 넣고 뒤쪽에서 빼면, 큐(Queue)처럼 사용할 수 있고, Deque의 앞쪽으로 넣고
	 *     다시 앞쪽에서 빼면 스택(Stack)처럼 사용할 수 있다.
	 *   - 덱은 양쪽으로 입출력이 모두 가능하지만 이 중에 한쪽으로만 입력이 가능하도록 설정한 덱을 스크롤(Scroll)
	 *     이라고 하며, 한쪽으로만 출력할 수 있도록 설정한 덱을 셸프(Shelf)라고 한다.
	 *     ※ 한 마디로 큐의 앞과 뒤에 모두 데이터의 삽입과 삭제가 가능한 데이터 저장 방식이다.
	 *     
	 * 
	 * [ 사용법 ]
	 * 
	 * 
	 *   {Deque 생성}
	 *     - 자바에서의 Deque은 인터페이스로 구현되어 있다.
	 *       Deque<String> duque1 = new ArrayDeque<>();
	 *       Deque<String> duque2 = new LinkedBlockingDeque<>();
	 *       Deque<String> duque3 = new ConcurrentLinkedDeque<>();
	 *       Deque<String> linkedList = new LinkedList<>();
	 *     ※ 위와 같이 ArrayDeque/LinkedBlockingDeque/ConcurrentLinkedDeque/Linkedlist 등의 클래스가 있다.
	 *     
	 *     
	 *   {Deque 값 추가}
	 *     - Deque에 값을 추가할 수 있는 메소드
	 *       {
	 *       deque.addFirst(); // Deque의 앞쪽에 데이터를 삽입, 용량 초과시 Exception
	 *       deque.offerFirst(); // Deque의 앞쪽에 데이터를 삽입 후 ture, 용량 초과시 false
	 *       
	 *       deque.addLast(); // deque의 뒤쪽에 데이터를 삽입, 용량 초과시 Exception
	 *       deque.add(); // addLast와 동일
	 *       deque.offerLast(); // deque의 뒤쪽에 데이터를 삽입 후 true, 용량 초과시 false
	 *       deque.offer(); // offerLast와 동일
	 *       
	 *       deque.push(); // addFirst와 동일
	 *       deque.pop(); // removeFirst와 동일
	 *       }
	 *     ※ addFirst, offerFirst 메소드는 Deque의 앞쪽에 데이터를 넣는다.
	 *     ※ addFirst는 Deque의 용량 초과시 예외가 발생되며, offerFirst는 용량 초과시 false를 리턴한다.
	 *     ※ addLast, add, offerLast, offer 메소드는 Deque의 뒤쪽에 데이터를 넣는다.
	 *     ※ add로 시작하는 메소드는 용량초과시 예외가 발생하며 offer로 시작하는 메소드는 용량 초과시 false를 리턴한다는 차이가 있다.
	 *     ※ push와 pop 메소드는 각각 addFirst, removeFirst 메소드와 동일하고, Deque을 스택(Stack)으로 사용할 때 쓰인다.
	 * 
	 * 
	 *   {Deque 값 제거}
	 *     - Deque에 값을 제거할 수 있는 메소드
	 *       {
	 *       deque.removeFirst(); // deque의 앞에서 제거, 비어있으면 예외
	 *       deque.remove(); // removeFirst와 동일
	 *       deque.poll; // deque의 앞에서 제거, 비어있으면 null 리턴
	 *       deque.pollFirst(); // poll()과 동일
	 *       
	 *       deque.removeLast(); // deque의 뒤에서 제거, 비어있으면 Exception
	 *       deque.pollLast(); // deque의 뒤에서 제거, 비어있으면 null 리턴
	 *       }
	 * 	   ※ removeFirst, remove, poll, pollfirst 메소드는 Deque의 앞쪽에서 데이터를 꺼낸다.
	 *     ※ remove로 시작하는 메소드는 Deque이 비어있을 때 예외를 발생시킨다.
	 *     ※ poll로 시작하는 메소드는 Deque이 비어있을 때 null을 리턴한다.
	 *     ※ removeLast, pollLast 메소드는 Deque의 뒤쪽에서 데이터를 꺼낸다.
	 *       마찬가지로 remove로 시작하는 메소드는 Deque이 비어있을 때 예외를 발생시키며, poll로 시작하는
	 *       메소드는 Deque이 비어있을 때 null을 리턴한다.
	 *       
	 *     - 특이한 메소드로 Deque에서 데이터를 찾아서 제거하는 메소드가 있다.
	 *       {
	 *       // Deque의 앞쪽에서 찾아서 첫 번째 데이터를 삭제
	 *       deque.removeFirstOccurrence(Object o);
	 *     
	 *       // Deque의 뒤쪽에서 찾아서 첫 번째 데이터를 삭제
	 *       deque.removeLastOccurrence(Object o);
	 *     
	 *       // removeFirstOccurrence 메소드와 동일
	 *       deque.remove(Object o);
	 *       }
	 *     ※ removeFirstOccurrence 메소드는 Deque의 앞쪽에서 인자와 같은 엘리먼트를 찾아서 제거한다.
	 *       만약 Deque에 이자와 같은 엘리먼트가 없으면 Deque에는 아무일도 일어나지 않는다.
	 *     ※ removeLastOccerrence 메소드는 반대로 Deque의 뒤쪽에서 인자와 같은 엘리먼트를 찾아서 제거한다.
	 *       역시 Deque에 인자와 같은 엘리먼트가 없으면 Deque에는 아무일도 일어나지 않는다.
	 * 
	 * 
	 *   {Deque 값 확인}
	 *   
	 *     - Deque에서 값을 확인할 수 있는 메소드
	 *       {
	 *       deque.getFirst(); // 첫 번째 엘리먼트를 확인, 비어있으면 예외
	 *       deque.peekFirst(); // 첫 번째 엘리먼트를 확인, 비어있으면 null 리턴
	 *       deque.peek(); // peekFirst와 동일
	 *       
	 *       deque.getLast(); // 마지막 엘리먼트를 확인, 비어있으면 예외
	 *       deque.peekLast(); // 마지막 엘리먼트를 확인, 비어있으면 null 리턴
	 *       
	 *       deque.contain(Object o); // Object 인자와 동일한 엘리먼트가 포함되어 있는지 확인
	 *       deque.size(); // Deque에 들어있는 엘리먼트의 개수
	 *       }
	 *     ※ getFirst, peekFirst, peek 메소드는 Deque의 맨 앞쪽에 있는 엘리먼트를 리턴한다.
	 *     ※ get으로 시작하는 메소드는 Deque이 비어있을 때 예외를 발생시키고, peek로 시작하는 메소드는
	 *       Deque이 비어있을 때, null을 리턴한다. 이 메소드들은 엘리먼트를 확인만하고 Deque에서 제거하지 않는다.
	 *     ※ getLast, peekLast 메소드는 Deque의 맨 마지막에 있는 엘리먼트를 리턴한다.
	 *     ※ get으로 시작하는 메소드는 Deque이 비어있을 때 예외를 발생시키고, peek으로 시작하는 메소드는
	 *       Deque이 비어있을 때, null을 리턴하며 이 메소드들은 엘리먼트를 확인만하고 Deque에서 제거하지 않는다.
	 * 
	 * 
	 *   {Deque 순회}
	 *     - for 문과 iterator를 이용해 Deque에 저장되어 있는 값들을 순회할 수 있다.
	 *       [
	 *       // for 문을 이용한 순회
	 *       for (String elem : deque1) {
	 *       	System.out.println(elem);
	 *       }
	 * 
	 *       // iterator를 이용한 순회
	 *       iterator<String> iterator = deque1.iterator();
	 *       while(iterator.hasNext()) {
	 *       	String elem = iterator.Next();
	 *       	System.out.println(elem);
	 *       }
	 *       
	 *       // 역순순회
	 *       iterator<String> reverseiterator = deque1.descendingiterator();
	 *       while(reverseiterator.hasNext()) {
	 *       	String elem = reverseiterator.next();
	 *       	System.out.println(elem);
	 *       }
	 *       ]
	 * 
	 *     ※ for 문과 iterator를 이용해서 Deque의 앞쪽에서부터 하나씩 엘리먼트들을 순회할 수 있다.
	 *     ※ 반대로 descendingiterator를 이용해서 뒤쪽부터 역순으로 순회할 수도 있다.
	 *     
	 * 
	 *  ★ Deque을 이용하면 스택도 만들 수 있고, 큐도 만들 수 있어서 편하다.
	 */
	
}
