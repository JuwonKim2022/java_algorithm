package ch06;

import java.util.*;

/*
 * <결정 알고리즘>
 * N개의 곡,DVD녹화 시 라이브에서의 순서 그대로 유지, 한 노래 쪼개기 불가능
 * 사업자는 최대한 DVD 낭비 줄이려 함, M개의 DVD에 모든 동영상 녹화, DVD길이(녹화 가능한 길이) 최소화, M개의 DVD는 모두 같은 크기
 *
 * 곡수, DVD수, 각 노래 분수
 * 출력은 DVD분
 */

class Main09 {
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            }else {
                sum += x;
            }
        }
        return cnt;
    }

    public int sol(int n, int m, int[] arr) {
        int answer = 0;
        //배열 반복문 대신 stream 쓰기
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid-1;
            }else {
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.sol(n, m, arr));
    }
}
