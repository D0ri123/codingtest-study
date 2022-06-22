package leeseolhui.baekjoon.level02;

import java.util.Arrays;
import java.util.Scanner;

public class code07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int num = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if(arr[0] == arr[2]){
            num = 10000 + (arr[2] * 1000);
        }else{
            if(arr[0] == arr[1]){
                num = 1000 + (arr[0] * 100);
            }else if(arr[2] == arr[1]){
                num = 1000 + (arr[2] * 100);
            }else if(arr[0] != arr[1]){
                num = arr[2] * 100;
            }
        }

        System.out.println(num);
    }
}
