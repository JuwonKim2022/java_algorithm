package ch00;

import java.util.Scanner;

/*
 * 선택 정렬
 * - N개 숫자입력 오름차순 정력, 선택정렬로
 */

public class Main05 {
    public int[] sol(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {

        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.sol(n, arr)) System.out.print(x+" ");
    }
}
