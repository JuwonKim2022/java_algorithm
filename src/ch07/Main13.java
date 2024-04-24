package ch07;

import java.util.*;

/*
 * <경로탐색 - 인접리스트>
 *  1에서 갈 수 있는 경우의 수 구하기
 *  인접행렬은 갯수 많으면 비효율적
 */

public class Main13 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS13(int v) {
        if(v==n) answer++;
        else {
            for(int nv : graph.get(v)) {
                if(ch[nv]==0) {
                    ch[nv] = 1;
                    DFS13(nv);
                    ch[nv]=0; //백한거 0으로 풀어줌
                }
            }
        }
    }

    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<m; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS13(1);
        System.out.println(answer);
    }
}
