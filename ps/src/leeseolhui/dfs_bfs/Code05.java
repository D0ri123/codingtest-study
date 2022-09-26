package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code05 {
    public static int m,n,k;
    static int[][] graph;

    public static boolean dfs(int x, int y){
        if(x<=-1 || x>=n || y<=-1 || y>=m) {
            return false;
        }
        if(graph[x][y]==1){
            graph[x][y] = 0;
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int result = 0;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            sc.nextLine();

            graph = new int[n][m];
            for(int j=1; j<=k; j++){
                graph[sc.nextInt()][sc.nextInt()] = 1;
            }

            for(int a=0; a<n; a++){
                for(int b=0; b<m; b++){
                    if(dfs(a, b))
                        result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
