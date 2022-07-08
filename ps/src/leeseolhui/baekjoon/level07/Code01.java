package leeseolhui.baekjoon.level07;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b<c){
            int res = (a/(c-b));
            System.out.println(res + 1);
        }else
            System.out.println(-1);
    }
}
