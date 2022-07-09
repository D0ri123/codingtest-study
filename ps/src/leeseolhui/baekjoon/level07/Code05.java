package leeseolhui.baekjoon.level07;

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int x=0;
        int y=0;
        for(int i=0; i<test; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            if(n % h != 0){
                x = (n/h) + 1;
                y = n%h;
            } else{
                x = n/h;
                y = h;
            }
            System.out.printf("%d%02d%n",y,x);
        }

    }
}
