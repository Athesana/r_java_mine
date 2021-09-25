package com.kh.homework2.com;

import java.util.TreeSet;

/*
 *  Tree구조 - 이진 검색 트리라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스. 
 *  		- 중복된 데이터의 저장을 허용하지 않고 정렬된 위치에 저장하므로 저장순서를 유지하지도 않는다.
 *  
 *  이진 검색 트리 - 여러개의 노드가 서로 연결된 구조로 노드당 최대 2개의 노드를 연결할 수 있다.
 *  			- 왼쪽 자식노드는 부모보다 작아야하며 오른쪽 자식노드는 부모보다 커야한다.
 *  			- 검색과 정렬에는 유리하지만 노드의 추가 삭제에 시간이 걸린다.
 *  			- 중복된 값을 저장하지 못한다.
 *  
 * 					     A
 *	       				/ \
 *	      			   B   E 
 *	      		      /\   /\
 * 	       		     C  D F  G  
 * 
 *  시작이 되는 노드를 root라고 하는데 여기서는 A에 해당하며 위 아래로 연결된 노드를 부모-자식 노드라고한다.
 *  B는 C,D의 부모노드이며 C,D는 B의 자식노드이다.	 
 */


public class Tree {

	public void treeSet() {
		
		TreeSet set = new TreeSet();
		int score[] = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50))); // set.headSet() - 객체보다 낮은값을 불러옴
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));  // set.tailSet() - 객체보다 높은값을 불러옴
	}
	
	
/* 1. set이라는 이름으로 TreeSet를 생성
 * 2. score라는 8자리로 구성된 배열을 생성
 * 3. for문을 이용해 TreeSet에 값을 추가
 * 4. set.headSet과 set.tailSet 메소드를 이용하여 지정된 값보다 크고 작은값들의 객체를 불러온다.
 *    검색 트리로 구성하면 다음과 같음
 * 					     80
 *	       				/  \
 *	      			 *50  	95
 *	      		     /  \   / \
 * 	       		    35  65	   100
 *   			   / \   
 *   			 10   45	    
 *   					  				 
*/
	
}