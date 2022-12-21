package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code20 {
    public static int n, total;
    public static int min;
    public static int[] kind;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        kind = new int[n];
        for(int i=0; i<n; i++){
            kind[i] = sc.nextInt();
        }
        min = Integer.MAX_VALUE;
        total = sc.nextInt();

        DFS(0,0);
        System.out.println(min);
    }

    public static void DFS(int sum, int each){
        if(sum>total) return;
        if(each>=min) return;
        if(sum==total){
            min = Math.min(min, each);
        } else{
            for(int i=n-1; i>=0; i--){
                DFS(sum+kind[i], each+1);
            }
        }
    }
}
