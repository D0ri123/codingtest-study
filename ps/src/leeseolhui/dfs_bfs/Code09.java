package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code09 {
    public static String[][] graph_g;
    public static String[][] graph_s;
    public static int n;
    public static boolean dfs_general(int x, int y, String color) {
        if (x <= -1 || x >= n || y <= -1 || y >= n) return false;
        if (graph_g[x][y].equals(color)) {
            graph_g[x][y] = "0";
            dfs_general(x - 1, y, color);
            dfs_general(x, y - 1, color);
            dfs_general(x + 1, y, color);
            dfs_general(x, y + 1, color);
            return true;
        }
        return false;
    }
    public static boolean dfs_special(int x, int y, String color){
        if (x <= -1 || x >= n || y <= -1 || y >= n) return false;
        if(graph_s[x][y].equals("G")) graph_s[x][y] = "R";
        if (graph_s[x][y].equals(color)) {
            graph_s[x][y] = "0";
            dfs_special(x - 1, y, color);
            dfs_special(x, y - 1, color);
            dfs_special(x + 1, y, color);
            dfs_special(x, y + 1, color);
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        graph_g = new String[n][n];
        graph_s = new String[n][n];
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            String[] strs = str.split("");
            for(int j=0; j<n; j++){
                graph_g[i][j] = strs[j];
                graph_s[i][j] = strs[j];
            }
        }

        int r=0, g=0, b=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if (dfs_general(i, j, "R"))
                    r++;
                else if (dfs_general(i, j, "G"))
                    g++;
                else if (dfs_general(i, j, "B"))
                    b++;
            }
        }
        int count_general = r+g+b;

        int rr=0, bb=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dfs_special(i,j,"R"))
                    rr++;
                else if(dfs_special(i,j,"B"))
                    bb++;
            }
        }
        int count_special = rr+bb;
        System.out.println(count_general + " " + count_special);
    }
}
