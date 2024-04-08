package ch07;

/*
 * 재귀함수 - 이진수 출력
 * - 10진수 N 입력되면 2진수로 변환하고 출력. 재귀함수로 출력
 */

public class Main02 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        T.DFS(11);
    }
}
