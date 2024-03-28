package ch00;

import java.util.Scanner;

/*
 * 삽입 정렬
 * - N개 숫자입력 오름차순 정력, 삽입정렬로
 * - index0그래도 두고 1부터 돈다. 큰값 우측으로
 * - 좌측이 우측보다 크지 않으면 break
 */

public class Main07 {
    public int[] sol(int n, int[] arr) {
        for(int i=1; i<n; i++) {
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.sol(n, arr)) System.out.print(x+" ");
    }
}
