package com.kh.homework2.com;

import java.util.ArrayList;
/*
 * ※ 그래프
 * 
 * 다양한 객체(혹은 노드)들의 연관성을 표현한 자료구조이다.
 * 
 * 1. 무방향 그래프
 * - 노드가 상호연결만 되어있는 형태라고 볼 수 있다.
 *   그 연결선을 간선(edge)이라 하는데, 특정 방향성을 가지지 않아 양방향으로 이동할 수 있다.
 *   예를 들어 노드 A,B를 잇는 간선 G가 있는데, 그 G는 G(A,B)와 G(B,A)가 동일하다고 보면 된다.
 *   ' A ' <----G----> 'B'
 * 
 * 2. 방향 그래프
 * - 연결된 노드에 특정 방향성을 가진 엣지가 있는 경우를 의미한다.
 *   무방향 그래프에서는 A - B 가 연결되어 있으면 양방향으로 이동할 수 있었는데,
 *   방향 그래프에선 엣지가 갖고있는 방향성이 제시되있음에 따라 이동이 정해진다.
 *   
 *   'A' ----G---> 'B' 인 경우, G(A,B)는 있으나, G(B,A)는 가질 수 없다.
 *   
 * 
 * ※ 가중치
 * - 가중치란 노드간 연결에 부여되는 각 경로의 강도이다.
 * - 가중치 그래프는 노드 연결에 가중치가 부여된 형태의 경우를 의미하며, 네트워크라고도 부른다.
 *   1,2번 같은 단순 방향 그래프에서 노드간 연결에 1이라는 일정한 가중치를 가진다면,
 *   가중치 그래프에선 간선마다 들어가는 가중치가 달라질 수 있다.
 *   쉽게 생각하면 노드 간 이동 경로마다 드는 비용의 값이 다르다.
 *   그래서 여러 노드를 통해 경로를 정할 시, 가장 효율적인 이동방법을 계산할 수 있다.
 * 
 */

// 그래프 구현
// 1 -- 2 -- 3
// |    |
// 4 -- 5

// 1번 노드의 인접 정점 : 2, 4
// 2번 노드의 인접 정점 : 1, 3, 5
// 3번 노드의 인접 정점 : 2
// 4번 노드의 인접 정점 : 1, 5
// 5번 노드의 인접 정점 : 2, 4

// 리스트 형태로 구현 (참고용)


public class AdjacencyList {
	 // vertex 번호와 가중치를 저장하는 Node 클래스
    private static class Node{
        private int vertex;
        private int weight;

        public Node(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }

        public int getVertex(){
            return this.vertex;
        }

        public int getWeight(){
            return this.weight;
        }
    }
    
    // 아래부터 인접리스트 구현 내역
    private ArrayList<ArrayList<Node>> adList;
    private int size;

    public AdjacencyList(int initSize){
        this.adList = new ArrayList<ArrayList<Node>>();
        this.size = initSize;
        for(int i=0; i < initSize+1; i++){
            this.adList.add(new ArrayList<Node>());
        }
    }

    // 아래는 가중치 그래프를 기반으로 진행.
    // 만약 가중치가 없다면 weight를 단순히 1로 전달해도 된다.
    // 양방향 혹은 무방향 그래프인 경우 아래 활용
    public void put(int vertex_x, int vertex_y, int weight){
        this.adList.get(vertex_x).add(new Node(vertex_y, weight));
        this.adList.get(vertex_y).add(new Node(vertex_x, weight));
    }

    // 단방향 그래프인 경우 아래 활용
    public void putSingleDirect(int vertex_x, int vertex_y, int weight){
        this.adList.get(vertex_x).add(new Node(vertex_y, weight));
    }

    // 전체 Graph 가져오기
    public ArrayList<ArrayList<Node>> getGraph(){
        return this.adList;
    }

    // 특정 vertex의 list 정보 가져오기
    public ArrayList<Node> getVertex(int idx){
        return this.adList.get(idx);
    }

    // 특정 vertex X와 vertex Y의 관계 반환
    public int getWeight(int vertex_x, int vertex_y){
        return this.adList.get(vertex_x).get(vertex_y).getWeight();
    }

    // vertex가 0번 혹은 1번부터 시작할 수 있으니 startIdx를 가져온다.
    public void printGraph(int startIdx){
        StringBuilder sb = new StringBuilder();
        for(int i=startIdx; i <= this.size; i++){
            sb.append("정점 ").append(i).append("의 인접 정점 리스트");
            for(int j=0; j < this.adList.get(i).size(); j++){
                sb.append(" -> ").append(this.adList.get(i).get(j).getVertex());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
