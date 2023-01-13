package leeseolhui.greedy;

//원더랜드(PriorityQueue/프림, 최소스패닝트리)

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Info implements Comparable<Info>{
    int connected;
    int cost;

    public Info(int connected, int cost){
        this.connected = connected;
        this.cost = cost;
    }

    @Override
    public int compareTo(Info o){
        return this.cost - o.cost;
    }
}

public class Code10 {
    public static ArrayList<ArrayList<Info>> list = new ArrayList<>();
    public static int[] check;
    public static PriorityQueue<Info> pq = new PriorityQueue<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        check = new int[v+1];
        for(int i=0; i<v+1; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.get(a).add(new Info(b, c));
            list.get(b).add(new Info(a, c));
        }
        pq.add(new Info(1,0));
        System.out.println(solution());
    }

    public static int solution(){
        int answer = 0;
        while(!pq.isEmpty()){
            Info info = pq.poll();
            if(check[info.connected]==0) {
                answer += info.cost;
                check[info.connected]=1;
                for (Info ele : list.get(info.connected)) {
                    if(check[ele.connected]==0) pq.offer(ele);
                }
            }
        }
        return answer;
    }
}
