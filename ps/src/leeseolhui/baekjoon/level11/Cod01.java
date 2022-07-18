package leeseolhui.baekjoon.level11;

import java.util.Arrays;
import java.util.Scanner;

public class Cod01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
