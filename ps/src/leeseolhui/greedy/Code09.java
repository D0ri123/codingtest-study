package leeseolhui.greedy;

//친구인가?

import java.util.Scanner;

public class Code09 {
    public static int[] parent;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        for(int i=1; i<=m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = find(a);
        int fb = find(b);

        if(fa == fb)
            System.out.println("YES");
        else
        System.out.println("NO");
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a==b) return;
        parent[a] = b;
    }

    public static int find(int a){
        if(a == parent[a]) return a;
        return parent[a] = find(parent[a]);
    }

}
