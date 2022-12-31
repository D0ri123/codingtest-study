package leeseolhui.greedy;

//원더랜드(Union&Find, 최소스패닝트리)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Info implements Comparable<Info>{
    int city;
    int connected;
    int cost;

    public Info(int city, int connected, int cost){
        this.city = city;
        this.connected = connected;
        this.cost = cost;
    }

    @Override
    public int compareTo(Info o){
        return this.cost - o.cost;
    }
}

public class Code10 {
    public static ArrayList<Info> list = new ArrayList<>();
    public static int[] parent;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); //도시의 개수(노드), 9
        int e = sc.nextInt(); //도로의 개수(간선), 12

        parent = new int[v+1];
        for(int i=1; i<=v; i++){
            parent[i] = i;
        }

        for(int i=0; i<e; i++){
            int a = sc.nextInt(); //a번 도시
            int b = sc.nextInt(); //b번 도시
            int c = sc.nextInt(); //유지비용 c로 연결됨
            list.add(new Info(a,b,c));
        }
        Collections.sort(list);

        System.out.println(solution());
    }

    public static int solution(){
        int answer = 0;
        for(Info info : list){
            if(!union(info.city, info.connected)){
                answer += info.cost;
            }
        }
        return answer;
    }

    public static boolean union(int u, int v){
        u = find(u); v = find(v);
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
