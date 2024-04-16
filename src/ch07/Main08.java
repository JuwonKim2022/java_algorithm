package ch07;

import java.util.*;

/*
 * <송아지 찾기1(BFS : 상태트리탐색)>
 * 송아지 잃어버림, 편수 위치와 송아지 위치 수직선상 좌표 주어지면
 * - 송아지 제자리
 * - 현수는 스카이 콩콩 타고 가는데 한 번의 점프로 앞으로1. 뒤로1, 앞으로5 이송
 * 최소 몇 번의 점프로 송아지까지 갈 수 있나 구하는 프로그램
 */

public class Main08 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                int x = Q.poll();
                // 1번 방법 : if(x==e) return L;
                for(int j=0; j<3; j++) {
                    int nx = x + dis[j];
                    if(nx==e) return L+1; //2번 방법
                    if(nx>=1 && nx<=10000 && ch[nx]==0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s,e));
    }
}
