package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code19 {
    public static int n, m, max;
    public static int[] score, time;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        max = Integer.MIN_VALUE;
        score = new int[n];
        time = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        DFS(0,0,0);
        System.out.println(max);
    }

    public static void DFS(int L, int point, int limit){
        if(L==n){
            if(limit<=m)
                max = Math.max(max, point);
        } else{
            DFS(L+1, point+score[L], limit+time[L]);
            DFS(L+1, point, limit);
        }
    }
}

