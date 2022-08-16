package leeseolhui.dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Code07 {
    public static int n,m;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visited;
    public static int cnt = 0;

    public static void dfs(int x){
        visited[x] = true;
        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점의 개수
        m = sc.nextInt(); // 간선의 개수
        visited = new boolean[n];
        sc.nextLine();

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=1; i<=m; i++){ //노드끼리 양방향으로 연결해주기 위해서
           int a = sc.nextInt();
           int b = sc.nextInt();
           sc.nextLine();
           graph.get(a-1).add(b-1);
           graph.get(b-1).add(a-1);
        }

        for(int i=0; i< visited.length; i++){
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
