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

        for(int pos : moves){
            for(int j=0; j<board.length; j++){
                if(board[j][pos-1]!=0){
                    int doll = board[j][pos-1];
                    board[j][pos-1]=0;
                    if(!basket.isEmpty() && doll==basket.peek()){
                        count += 2;
                        basket.pop();
                    }
                    else basket.push(doll);
                    break;
                }
            }
        }
        return count;
    }
}
