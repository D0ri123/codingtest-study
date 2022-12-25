package leeseolhui.dfs_bfs;

//토마토

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Fruit{
    public int x, y;
    public Fruit(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Code25 {
    public static int answer = Integer.MIN_VALUE;
    public static int m, n; // m은 상자의 가로칸 수, n은 상자의 세로칸 수
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};
    public static int[][] board, days;
    public static Queue<Fruit> q = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); //m은 상자의 가로칸 수(열)
        n = sc.nextInt(); //n은 상자의 세로칸 수(행)

        board = new int[n][m];
        days = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j]==1) q.offer(new Fruit(i, j));
            }
        }
        BFS();

        boolean flag = true;
         for(int i=0; i<n; i++){
             for(int j=0; j<m; j++){
                 if(board[i][j]==0) flag = false;
             }
         }
         if(flag){
             for(int i=0; i<n; i++){
                 for(int j=0; j<m; j++){
                     answer = Math.max(answer, board[i][j]);
                 }
             }
             System.out.println(answer-1);
         } else System.out.println(-1);
    }

    public static void BFS(){
        while(!q.isEmpty()){
            Fruit fruit = q.poll();
            for (int i=0; i<4; i++) {
                int nx = fruit.x + dx[i];
                int ny = fruit.y + dy[i];
                if (nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(board[nx][ny] == -1) continue;
                if (board[nx][ny] == 0) {
                    board[nx][ny]=1;
                    q.offer(new Fruit(nx, ny));
                    board[nx][ny] = board[fruit.x][fruit.y] + 1;
                }
            }
        }
    }
}
