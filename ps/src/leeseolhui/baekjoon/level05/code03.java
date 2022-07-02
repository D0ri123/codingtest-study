package leeseolhui.baekjoon.level05;

import java.util.Scanner;

public class code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int num = Integer.parseInt(input);
        int res = 0;
        int len = input.length();

        if(len<=2){
            res = num;
        }else{
            res += 99;
            for(int i=100; i<=num; i++){
                int hun = i / 100;
                int ten = (i%100) / 10;
                int one = i % 10;
                if(hun - ten == ten - one) res += 1;
            }
        }
        System.out.println(res);
    }
}
