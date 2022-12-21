package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code23 {
    public static int answer = 0;
    public static int[][] board = new int[8][8];
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<8; i++){
            for(int j=1; j<8; j++){
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        DFS(1,1);
        System.out.println(answer);
    }

    public static void DFS(int x, int y){
        if(x==7 && y==7){
            answer++;
        }else{
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<1 || ny<1 || nx>7 || ny>7) continue;
                if(board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }
}
