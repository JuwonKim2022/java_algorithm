package ch07;

import java.util.*;

/*
 * <그래프와 인접행렬>
 *  첫 줄에 정점의 수 N , 간선의 수 M
 *  다음 줄부터 M줄에 걸쳐 연결정보 주어짐
 *  - 총 가지수 출력
 *
 *  1. 무방향 그래프
 *  2. 방향 그래프
 */

class Node11{
    int data;
    Node11 lt, rt;
    public Node11(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main11 {
    Node11 root;
    public int BFS(Node11 root) {
        Queue<Node11> Q = new LinkedList<Node11>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Node11 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) {
                    return L;
                }
                if(cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if(cur.rt != null) {
                    Q.add(cur.rt);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main11 tree = new Main11();
        tree.root = new Node11(1);
        tree.root.lt = new Node11(2);
        tree.root.rt = new Node11(3);
        tree.root.lt.lt = new Node11(4);
        tree.root.rt.rt = new Node11(5);
        System.out.println(tree.BFS(tree.root));
    }
}
