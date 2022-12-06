package leeseolhui.dp;

//동전교환(냅색 알고리즘)

import java.util.Arrays;
import java.util.Scanner;

public class Code05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] coin = new int[n];
        for(int i=0; i<n; i++){
            coin[i] = sc.nextInt();
        }

        int price = sc.nextInt();
        System.out.println(solution(coin, price));
    }

    public static int solution(int[] coin, int price){
        int[] cache = new int[price+1];
        Arrays.fill(cache,0);

        for(int i=0; i< cache.length; i++){
            cache[i] = i/coin[0];
        }

        for(int i=1; i<coin.length; i++){
            for(int j=coin[i]; j<cache.length; j++){
                int each = cache[j-coin[i]] + 1;
                cache[j] = Math.min(cache[j], each);
            }
        }
        return cache[price];
    }
}
