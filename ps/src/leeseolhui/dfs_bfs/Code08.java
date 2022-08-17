package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code08 {
    public static int[][] test;
    public static int w,h;
    public static boolean dfs(int x, int y){
        if(x<=-1 || x>=h || y<=-1 || y>=w) return false;
        if(test[x][y]==1){
            test[x][y]=0;
            dfs(x-1, y);
            dfs(x,y-1);
            dfs(x+1, y);
            dfs(x, y+1);
            dfs(x-1,y-1);
            dfs(x-1, y+1);
            dfs(x+1, y-1);
            dfs(x+1, y+1);
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int cnt = 0;
            w = sc.nextInt(); //지도의 너비,열
            h = sc.nextInt(); //지도의 높이,행
            sc.nextLine();
            if(w==0 || h ==0) break;

            test = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    test[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(dfs(i,j))
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
