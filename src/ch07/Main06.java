package ch07;

import java.util.*;

/*
 * <이진트리 순회(넓이우선탐색 : 레벨탐색)>
 *      1       - level 1
 *    2   3     - level 2
 *  4  5 6  7   - level 3
 *
 *  - 큐 통해서 레벨 탐색
 */

class Node706{
    int data;
    Node706 lt, rt;
    public Node706(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main06 {
    Node706 root;
    public void BFS(Node706 root) {
        Queue<Node706> Q = new LinkedList<Node706>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size(); //Q 원소 몇 개 있나?
            System.out.print(L + " : ");
            for(int i=0; i<len; i++) {
                Node706 cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main06 tree = new Main06();
        tree.root = new Node706(1);
        tree.root.lt = new Node706(2);
        tree.root.rt = new Node706(3);
        tree.root.lt.lt = new Node706(4);
        tree.root.rt.rt = new Node706(5);
        tree.root.lt.lt = new Node706(6);
        tree.root.rt.rt = new Node706(7);
        tree.BFS(tree.root);
    }
}

