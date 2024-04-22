package ch07;

import java.util.*;

/*
 * <경로탐색 - 인접행렬>
 *  1에서 갈 수 있는 경우의 수 구하기
 */

public class Main12 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS12(int v) {
        if(v==n) answer++;
        else {
            for(int i=1; i<=n; i++) {
                if(graph[v][i]==1 && ch[i]==0) {
                    ch[i] = 1;
                    DFS12(i);
                    ch[i]=0; //백한거 0으로 풀어줌
                }
            }
        }
    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1]=1;
        T.DFS12(1);
        System.out.println(answer);
    }
}