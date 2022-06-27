package leeseolhui.baekjoon.level04;

import java.util.Arrays;
import java.util.Scanner;

public class code05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;

        int n = sc.nextInt();
        double[] score = new double[n];

        for(int i=0; i<score.length; i++){
            score[i] = sc.nextDouble();
        }

        Arrays.sort(score);
        double max = score[n-1];

        for(int j=0; j<score.length; j++){
            score[j] = score[j]/max * 100;
            total = total + score[j];
        }

        System.out.println(total/n);

    }
}
