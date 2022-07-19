package leeseolhui.baekjoon.level18;

import java.util.Arrays;
import java.util.Scanner;

public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];
        int length = 0;
        int result = 0;

        for(int i=0; i<n; i++){
            coin[i] = sc.nextInt();
            if(coin[i] <= k) length++;
        }

        int[] ava = Arrays.copyOf(coin, length);

        for(int i=ava.length-1; i>=0; i--){
            int a = k;
            k %= ava[i];
            result += a/ava[i];
            if(k == 0){
                System.out.println(result);
                break;
            }
        }
    }
}
