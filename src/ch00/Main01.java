package ch00;

import java.util.*;

/*
 * 여러 개의 쇠막대기 레이저로 절단 (여러 개 겹쳐서 수직으로 레이저 절단)
 * - 자신보다 긴 막대기 위에만 올라가기 가능
 * - 끝점은 겹치지 않도록
 *
 * -- 여는 괄호 : push
 * -- 닫는 괄호
 *      1) 바로 앞이 여는 괄호 = 레이저 -> 바로앞 여는 괄호 팝, answer = 나머지 여는 괄호 갯수
 *     2) 바로 앞이 닫는 괄호 -> 앞에 여는거 팝 + 갯수1 추가
 *
 */

public class Main01 {
    public int sol(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='(') {
                stack.push('(');
            }else {
                stack.pop();
                if(str.charAt(i-1)=='(') {
                    answer += stack.size();
                }else {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}

