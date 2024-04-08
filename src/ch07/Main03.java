package ch07;

/*
 * 팩토리얼
 * - 자연수 N 입력되면 N! 구하는 프로그램 작성
 */

public class Main03 {
    public int DFS(int n) {
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        System.out.println(T.DFS(5));
    }
}
