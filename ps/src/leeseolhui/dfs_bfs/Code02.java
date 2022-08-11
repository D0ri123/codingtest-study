package leeseolhui.dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Code02 {
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int x){
        visited[x] = true;
        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y]){
                visited[y] = true;
                dfs(y);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //컴퓨터의 수
        int m = sc.nextInt(); //쌍으로 연결된 컴퓨터의 수

        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        int result = 0;
        visited = new boolean[n+1];
        dfs(1);
        for(boolean b : visited){
            if(b) result++;
        }
        System.out.println(result-1);
    }
}
