package leeseolhui.stack_queue;

//크레인 인형뽑기(카카오)

import java.util.Scanner;
import java.util.Stack;

public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves){
        Stack<Integer> basket = new Stack<>();
        int count = 0;

        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                int doll = board[j][moves[i]-1];
                if(doll!=0 && !basket.isEmpty() && doll==basket.peek()){
                    board[j][moves[i]-1] = 0;
                    basket.pop();
                    count += 2;
                    break;
                }
                if(doll!=0 && basket.isEmpty()) {
                    basket.push(doll);
                    board[j][moves[i]-1] = 0;
                    break;
                }
                if(doll!=0 && doll != basket.peek()){
                    basket.push(doll);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
