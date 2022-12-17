package leeseolhui.dfs_bfs;

import java.util.Scanner;

public class Code17 {
    public static int totalSum = 0;
    public static int n;
    public static String answer = "NO";
    public static boolean flag = false;
    public static int[] arr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum){
        if(flag) return;
        if(L==n){
            if(totalSum - sum == sum) {
                flag = true;
                answer = "YES";
            }
        }else{
            DFS(L+1, sum + arr[L]);
            DFS(L+1, sum);
        }
    }
}
