package leeseolhui.dfs_bfs;

// 피자 배달 거리(DFS 활용)

import java.util.ArrayList;
import java.util.Scanner;

class Dis{
    public int x, y;
    public Dis(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Code27 {
    public static int n, m;
    public static int min = Integer.MAX_VALUE;
    public static ArrayList<Dis> house, pizza;
    public static Dis[] selected;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        house = new ArrayList<>();
        pizza = new ArrayList<>();
        selected = new Dis[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp = sc.nextInt();
                if(tmp==1) house.add(new Dis(i, j));
                else if(tmp==2) pizza.add(new Dis(i, j));
            }
        }
        DFS(0,0);
        System.out.println(min);
    }

    public static void DFS(int L, int start){
        if(L==m){
            min = Math.min(min, distCalc(selected));
        }else{
            for(int i=start; i<pizza.size(); i++){
                selected[L] = pizza.get(i);
                DFS(L+1, start+1);
            }
        }
    }

    public static int distCalc(Dis[] selected){
        int sum = 0;
        for(Dis h : house){
            int dis = Integer.MAX_VALUE;
            for(int j=0; j<selected.length; j++){
                dis = Math.min(dis,(Math.abs(h.x - selected[j].x) + Math.abs(h.y - selected[j].y)));
            }
            sum += dis;
        }
        return sum;
    }
}