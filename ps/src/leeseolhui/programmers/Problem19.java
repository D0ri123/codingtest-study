package leeseolhui.programmers;

//섬 연결하기

import java.util.Arrays;
import java.util.Comparator;

public class Problem19 {
    public static int[] parent;
    public static void main(String[] args){
        Problem19 pro = new Problem19();
        int n = 5;
        int[][] costs = new int[][] {{0, 1, 5}, {1, 2, 3}, {2, 3, 3}, {3, 1, 2}, {3, 0, 4}, {2, 4, 6}, {4, 0, 7}};

        pro.initSetting(n);
        System.out.println(pro.solution(n, costs));
    }

    public void initSetting(int n){
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
    }

    public int solution(int n, int[][] costs){ //한 행에 [섬의 번호, 섬의 번호, 연결 비용]
        int answer = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2]-o2[2];
            }
        });

        for(int i=0; i<costs.length; i++){
            if(!union(costs[i][0], costs[i][1]))
                answer += costs[i][2];
        }
        return answer;
    }

    public static boolean union(int u, int v){
        u = find(u);
        v = find(v);
        if(u==v) return true;
        else {
            parent[u] = v;
            return false;
        }
    }

    public static int find(int u){
        if(u == parent[u]) return u;
        return parent[u] = find(parent[u]);
    }
}
