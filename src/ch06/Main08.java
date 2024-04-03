package ch06;

import java.util.*;

/*
 * <이분 검색>
 * 임의의 N개의 수,숫자 오름차순
 * 한개의 수 M 주어지면 이분 검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램
 * 중복 허용 안됨
 *
 * 3 32
 * 23 87 65 12 57 32 99 81
 */

class Main08 {
    public int sol(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;

        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(arr[mid]==m) {
                answer = mid+1;
                break;
            }
            if(arr[mid] > m) {
                rt = mid-1;
            }else {
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.sol(n, m, arr));
    }
}
