package leeseolhui.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Code20 {
    public static int n, total, L;
    public static int[] kind, visited;
    public static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //동전의 종류
        kind = new int[n];
        for(int i=0; i<n; i++){
            kind[i] = sc.nextInt(); //동전의 종류
            q.offer(kind[i]);
        }
        total = sc.nextInt(); //거슬러 줄 금액
        visited = new int[501];

        L=1;
        System.out.println(BFS());
    }

    public static int BFS(){
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++) {
                int price = q.poll();
                for(int number : kind) {
                    int change = price + number;
                    if(change == total) return L+1;
                    if (visited[change] == 0) {
                        visited[change] = 1;
                        q.offer(change);
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
