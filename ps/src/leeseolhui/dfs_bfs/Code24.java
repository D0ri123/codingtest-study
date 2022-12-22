package leeseolhui.dfs_bfs;

//미로의 최단거리 통로

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Location{
    int x;
    int y;
    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Code24 {
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};
    public static int[][] board = new int[8][8];
    public static int[][] check = new int[8][8];
    public static int answer = -1;
    public static Queue<Location> q = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<8; i++){
            for(int j=1; j<8; j++){
                board[i][j] = sc.nextInt();
            }
        }

        check[1][1] = 1;
        q.offer(new Location(1,1));
        BFS();
        System.out.println(answer);
    }

    public static void BFS(){
        while(!q.isEmpty()){
            Location location = q.poll();
            for(int i=0; i<4; i++){
                int nx = location.x + dx[i];
                int ny = location.y + dy[i];
                if(nx<1 || ny<1 || nx>7 || ny>7) continue;
                if(nx==7 && ny==7) {
                    answer = board[location.x][location.y]+1;
                    return;
                }
                if(board[nx][ny]==1)
                    continue;
                if(check[nx][ny]==0){
                    check[nx][ny] = 1;
                    board[nx][ny] = board[location.x][location.y]+1;
                    q.offer(new Location(nx, ny));
                }
            }
        }
    }
}
