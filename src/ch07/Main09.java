package ch07;

import java.util.*;

/*
 * <Tree 말단 노드따기의 가장 짧은 경로>
 * 간선 갯수 당 1
 * DFS로(BFS가 정답)
 */

class Node09{
	int data;
	Node09 lt, rt;
	public Node09(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Main09 {
    Node09 root;
    public int DFS09(int L, Node09 root) {
        if(root.lt==null && root.rt==null) {
            return L;
        }else {
            return Math.min(DFS09(L+1, root.lt), DFS09(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        Main09 tree = new Main09();
        tree.root = new Node09(1);
        tree.root.lt = new Node09(2);
        tree.root.rt = new Node09(3);
        tree.root.lt.lt = new Node09(4);
        tree.root.rt.rt = new Node09(5);
        System.out.println(tree.DFS09(0, tree.root));
    }
}
