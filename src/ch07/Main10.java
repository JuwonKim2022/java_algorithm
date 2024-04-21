package ch07;

import java.util.*;

/*
 * <Tree 말단 노드따기의 가장 짧은 경로>
 * 간선 갯수 당 1
 * BFS로
 */

class Node10{
    int data;
    Node10 lt, rt;
    public Node10(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main10 {

    Node10 root;
    public int BFS(Node10 root) {
        Queue<Node10> Q = new LinkedList<Node10>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Node10 cur = Q.poll();
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
        Main10 tree = new Main10();
        tree.root = new Node10(1);
        tree.root.lt = new Node10(2);
        tree.root.rt = new Node10(3);
        tree.root.lt.lt = new Node10(4);
        tree.root.rt.rt = new Node10(5);
        System.out.println(tree.BFS(tree.root));
    }
}
