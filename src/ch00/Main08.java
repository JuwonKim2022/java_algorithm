package ch00;

import java.util.Scanner;

/*

 * 캐시메모리 사용 규칙 : LRU 알고리즘(가장 최근에 사용하지 않은 것)

 * - 정렬로 좌측이 가장 최근 사용, 우측이 사용한지 가장 오래됨

 * - 없는 숫자 작업 들어오면 : Cache Miss 뜨며 가장 좌측에 들어감

 * - 있는 숫자 작업 : 좌측으로 그 숫자 들어오고 Cache Hit

 */

public class Main08 {
    public int[] sol(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for(int x : arr) {
            int pos = -1;
            for(int i=0; i<size; i++) {
                if(x == cache[i]) pos = i;
            }
            if(pos == -1) {
                for(int i=size-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }else {
                for(int i=pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {

        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.sol(s, n, arr)) System.out.print(x+" ");
    }
}
