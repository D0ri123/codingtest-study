package leeseolhui.dfs_bfs;

//섬나라 아일랜드

import java.util.Scanner;

public class Code26 {
    public static int[][] island;
    public static boolean[][] check;
    public static int[] dx = {-1,-1,0,1,1,1,0,-1};
    public static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static int n, count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        island = new int[n][n];
        check = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                island[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(island[i][j] == 1) {
                    count++;
                    check[i][j] = true;
                    DFS(i,j);
                }
            }
        }
        System.out.println(count);
    }

    public static void DFS(int x, int y){
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
            if(check[nx][ny]) continue;
            if(island[nx][ny]==1) {
                if(!check[nx][ny]) {
                    check[nx][ny] = true;
                    island[nx][ny] = 0;
                    DFS(nx, ny);
                }
            }
        }
    }
}
