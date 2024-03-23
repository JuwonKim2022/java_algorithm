package ch00;

/*
 * 후위식 연산
 * 첫 줄에 후위연산식, 연산식 길이 50 안 넘음
 * 예)352+*9- : 12
 *
 * 숫자면 스택에 푸시
 * 기호 나오면 : 숫자 두 개 빼고 기호 처리 -> 결과값 다시 푸시
 */

import java.util.*;

public class Main04 {
    public int sol(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //탐색
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x-48);
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') {
                    stack.push(lt+rt);
                }else if(x=='-') {
                    stack.push(lt-rt);
                }else if(x=='*') {
                    stack.push(lt*rt);
                }else if(x=='/') {
                    stack.push(lt/rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
