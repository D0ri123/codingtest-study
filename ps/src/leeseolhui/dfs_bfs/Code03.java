package leeseolhui.dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code03 {
    public static int n;
    public static int ele=0;
    public static int[][] apart = new int[25][25];
    public static ArrayList<Integer> block = new ArrayList<>();

    public static boolean dfs(int x, int y){
        if(x<=-1 || x>=n || y<=-1 || y>=n)
            return false;
        if(apart[x][y] == 1){
            ele++;
            apart[x][y] = 0;
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
        n = sc.nextInt(); //7
        sc.nextLine();

        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<n; j++){
                apart[i][j] = str.charAt(j)-'0';
            }
        }

        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ele = 0;
                if(dfs(i,j)){
                    result+=1;
                    block.add(ele);
                }
            }
        }
        Collections.sort(block);
        System.out.println(result);
        for(int a: block){
            System.out.println(a);
        }
    }
}
