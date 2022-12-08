package leeseolhui.stack_queue;

//크레인 인형뽑기(카카오)

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Code03 {
    public static void main(String[] args){
        ArrayList<Stack<Integer>> boards = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            boards.add(new Stack<>());
            for(int j=0; j<n; j++){
                if(board[j][i]==0) continue;
                boards.get(i).push(board[j][i]);
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(boards, moves));
    }

    public static int solution(ArrayList<Stack<Integer>> boards, int[] moves){
        Stack<Integer> basket = new Stack<>();
        basket.push(boards.get(moves[0]-1).pop());

        for(int i=1; i<moves.length; i++){
            int doll = boards.get(moves[i] - 1).pop();
            if (!basket.isEmpty()) {
                int a = basket.pop();
                if (a != doll) {
                    basket.push(a);
                    basket.push(doll);
                }
            }
        }
        return basket.capacity();
    }
}
