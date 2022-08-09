package leeseolhui.baekjoon.level01;

import java.util.Scanner;

public class Code13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        final int[] set = {1,1,2,2,2,8};

        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
            sb.append(set[i]-arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
