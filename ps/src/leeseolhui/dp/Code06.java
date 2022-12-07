package leeseolhui.dp;

//평범한 배낭

import java.util.Scanner;

public class Code06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight = sc.nextInt();

        int[] cache = new int[weight+1];

        for(int i=0; i<n; i++){
            int w = sc.nextInt(); //담는 물건의 무게
            int v = sc.nextInt(); //담는 물건의 가치
            for(int j=weight; j>=w; j--){
                cache[j] = Math.max(cache[j], cache[j-w]+v);
            }
        }
        System.out.println(cache[weight]);
    }
}
