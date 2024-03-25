package ch00;

import java.util.*;

/*
 * 공주 구하기
 * 왕자 N명 : 다음 방법으로 구하러 갈 왕자 결정
 *  - 나이 순으로 1번부터 N번까지 + 시계바향으로 원형 앉기 + 번호 외치면 그 사람 빠지고 이어서
 *
 *  -- 큐 이용
 *  1. offer() 넣음
 *  2. poll() 뺌
 *  3. peek() 출구 바로 앞에 거 확인만
 *  4. size() 큐 갯수
 *  5. contains()
 */

public class Main02 {
    public int sol(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for(int i=1; i<=n; i++) Q.offer(i);
        while(!Q.isEmpty()) {
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size()==1) answer = Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.sol(n,  k));
    }
}

