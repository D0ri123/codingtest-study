package leeseolhui.greedy;

import java.util.*;

class Lecture implements Comparable<Lecture>{
    int m;
    int d;
    public Lecture(int m, int d){
        this.m = m;
        this.d = d;
    }
    @Override
    public int compareTo(Lecture o) {
        if(this.d == o.d)
            return o.m - this.m;
        return o.d - this.d;
    }
}

public class Code08 {
    public static int n, max = Integer.MIN_VALUE;
    public static ArrayList<Lecture> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            int d = sc.nextInt();
            list.add(new Lecture(m, d));
            if(d>max) max = d;
        }
        Collections.sort(list);
        System.out.println(solution());
    }

    public static int solution(){
        int revenue = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(list.get(j).d < i) break;
                else pQ.offer(list.get(j).m);
            }
            if(!pQ.isEmpty()) {
                revenue += pQ.poll();
            }
        }
        return revenue;
    }
}
