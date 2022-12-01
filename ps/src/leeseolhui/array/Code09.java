package leeseolhui.array;

//격자판 최대합

import java.util.Scanner;

public class Code09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] table = new int[n][n];
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                table[i][j] = sc.nextInt();
            }
        }

        int max = Math.max(columnAndRowSum(table), diagonalSum(table));
        System.out.println(max);
    }

    public static int columnAndRowSum(int[][] table){ //열 합
        int max = Integer.MIN_VALUE;
        for(int i=0; i<table.length; i++){
            int sum1 = 0, sum2 = 0;
            for(int j=0; j< table.length; j++){
                sum1 += table[i][j];
                sum2 += table[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }
        return max;
    }

    public static int diagonalSum(int[][] table) { //대각선 합
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i< table.length; i++){
            sum1 += table[i][i];
            sum2 += table[i][table.length-1-i];
        }
        return Math.max(sum1, sum2);
    }
}
