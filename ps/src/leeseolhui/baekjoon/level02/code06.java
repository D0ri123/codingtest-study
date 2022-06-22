package leeseolhui.baekjoon.level02;

import java.util.Scanner;

public class code06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        if(time >= 60){
            h = h + (time/60);
            m = m + (time%60);
            if(m >= 60){
                m = m-60;
                h++;
            }
        }else{
            m = m + time;
            if(m >=60){
                m=m-60;
                h++;
            }
        }
        if(h>=24){
            h=h-24;
        }
        System.out.println(h + " " + m);
    }
}
