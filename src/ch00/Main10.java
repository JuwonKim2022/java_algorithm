package ch00;

import java.util.*;

/*
 * <장난꾸러기>
 * N명의 학생, 키 작은 순서로 반 학생 정렬, 작은 키부더 1번~N번, 철수 짝궁보다 키가 큼
 * 철수 앞자리 가고 싶어서 짤궁이랑 자리 바꿈
 * 철수와 철수 짝궁 받은 번호 출력
 *
 * 배열 복사, 정렬하기
 */

public class Main10 {
    public ArrayList<Integer> sol(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);;
        for(int i=0; i<n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int x : T.sol(n, arr)) System.out.print(x + " ");
    }
}