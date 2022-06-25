package leeseolhui.baekjoon.level04;

import java.util.Arrays;
import java.util.Scanner;

public class code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] arr2 = new int[arr.length];

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);
        int max = arr2[8];
        for(int j=0; j<arr2.length; j++){
            if(max == arr[j]){
                System.out.println(arr2[8]);
                System.out.println(j+1);
            }
        }

    }
}
