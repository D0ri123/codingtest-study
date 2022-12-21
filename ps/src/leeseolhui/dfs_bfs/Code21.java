package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(combi(n,r));
    }

    public static int combi(int n, int r){
        if(n==r){
            return 1;
        } else if(r==n-1||r==1){
            return n;
        } else{
            return combi(n-1, r-1) + combi(n-1, r);
        }
    }
}
