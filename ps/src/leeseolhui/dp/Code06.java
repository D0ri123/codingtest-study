package leeseolhui.dp;

//평범한 배낭

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Things implements Comparable<Things>{
    int w;
    int v;

    public Things(int w, int v){
        this.w = w;
        this.v = v;
    }

    @Override
    public int compareTo(Things o){ //무게를 기준으로 오름차순
       return this.w - o.w;
    }
}

public class Code06 {
    public static void main(String[] args){
        ArrayList<Things> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight = sc.nextInt();

        for(int i=0; i<n; i++){
            int w = sc.nextInt();
            int v = sc.nextInt();
            list.add(new Things(w, v));
        }
        System.out.println(solution(list, weight));
    }

    public static int solution(ArrayList<Things> list, int limit){
        Collections.sort(list);
        int[] value = new int[limit+1];

        for(int i=0; i<list.size(); i++){
            for(int j=value.length-1; j>=list.get(i).w; j--){
                value[j] = Math.max(value[j],value[j-list.get(i).w] + list.get(i).v);
            }
        }
        return value[limit];
    }
}
