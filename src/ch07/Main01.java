package ch07;

/*
 * 재귀함수 - 반복문의 형태
 * - 자연수 N 재귀함수로 1부터 N까지 출력
 */

public class Main01 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            //System.out.print(n + " "); // 3 2 1 풀력
            DFS(n-1);
            System.out.print(n + " "); // 1 2 3 풀력
        }
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        T.DFS(3);
    }
}
