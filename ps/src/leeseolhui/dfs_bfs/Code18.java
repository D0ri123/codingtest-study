package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code18 {
    public static int[] dogs;
    public static int n, c, sum, max;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        sum = 0;
        max = Integer.MIN_VALUE;

        dogs = new int[n];
        for(int i=0; i<n; i++){
            dogs[i] = sc.nextInt();
        }

        DFS(0,0);
        System.out.println(max);
    }

    public static void DFS(int L, int weight){
        if(L==n){
            if(weight<=c)
                max = Math.max(max, weight);
        }else{
            DFS(L+1, weight+dogs[L]);
            DFS(L+1, weight);
        }
    }
}
