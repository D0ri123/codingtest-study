package leeseolhui.dfs_bfs;

import java.util.*;

public class Code01 {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean[] visited;
    public static int n,m,v;

    public static void dfs(int x){  //dfs 깊이우선 탐색 구현
        visited[x] = true;
        System.out.print(x + " ");
        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y])
                dfs(y);
        }
    }

    public static void bfs(int start){ //bfs 너비우선 탐색 구현
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
            for(int i=0; i<graph.get(x).size(); i++) {
               int y = graph.get(x).get(i);
               if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        visited = new boolean[n+1];

        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){ //입력된 간선의 개수만큼 등록해준다.
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            sc.nextLine();
            graph.get(node1).add(node2); //일반적인 방향이 아니라 간선이기 때문에 양방향으로 둘다 모두 추가해줘야 함
            graph.get(node2).add(node1);
        }

        for(int i=0; i<graph.size(); i++){
            Collections.sort(graph.get(i));
        }

        visited = new boolean[n+1];
        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);
    }
}