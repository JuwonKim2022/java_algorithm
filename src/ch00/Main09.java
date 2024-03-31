package ch00;

import java.util.*;

/*
 * <중복 확인>
 * N명의 학생, 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라 함
 * 중복 숫자 있으면 D 출력
 * N명 모두 다른 숫자면 U 출력
 */

public class Main09 {
    public String sol(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) return answer = "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.sol(n, arr));
    }
}
