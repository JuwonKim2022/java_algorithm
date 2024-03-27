package ch00;

import java.util.Scanner;

/*
 * 버블 정렬
 * - N개 숫자입력 오름차순 정력, 버블정렬로
 * - 이웃한 것끼리 비교해서 교환 - 맨 뒤에 큰수 정렬
 */

public class Main06 {
    public int[] sol(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main06 T = new Main06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.sol(n, arr)) System.out.print(x+" ");
    }
}
