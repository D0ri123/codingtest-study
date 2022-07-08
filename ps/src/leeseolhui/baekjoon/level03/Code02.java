package leeseolhui.baekjoon.level03;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i=0; i<test; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
