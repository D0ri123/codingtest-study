package leeseolhui.dp;

//가장 높은 탑 쌓기

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
    public int s, h, w;

    public Brick(int s, int h, int w){
        this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Brick o){
        return o.s - this.s;
    }
}

public class Code04 {
    public static int[] dy;
    public static void main(String[] args){
        ArrayList<Brick> bricks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n];

        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            bricks.add(new Brick(s,h,w));
        }
        System.out.println(solution(bricks));
    }

    public static int solution(ArrayList<Brick> bricks){
        int answer;
        Collections.sort(bricks);
        dy[0] = bricks.get(0).h;
        answer = dy[0];

        for(int i=1; i<bricks.size(); i++){
            int maxHeight = 0;
            for(int j=i-1; j>=0; j--){
                if(bricks.get(i).w < bricks.get(j).w && maxHeight < dy[j])
                    maxHeight = dy[j];
            }
            dy[i] = maxHeight + bricks.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}