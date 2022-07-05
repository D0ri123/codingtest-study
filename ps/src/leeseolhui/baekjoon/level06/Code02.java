package leeseolhui.baekjoon.level06;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int sum = 0;

        int n = sc.nextInt();
        String num = sc.next();
        String[] arr = num.split("");

        for(int i=0; i<arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            sum += a;
        }

        System.out.println(sum);
    }
}
