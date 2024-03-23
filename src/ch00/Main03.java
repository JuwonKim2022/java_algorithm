package ch00;
import java.util.*;

public class Main03 {
    public int sol(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves) {
            for(int i=0; i<board.length; i++) {
                if(board[i][pos-1]!=0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp==stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.sol(board, moves));
    }
}
