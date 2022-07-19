package leeseolhui.baekjoon.level18;

import java.util.Arrays;
import java.util.Scanner;

public class Code05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        int[] dis = new int[city-1];
        int[] price = new int[city];
        int min = 0;

        for(int i=0; i<dis.length; i++){
            dis[i] = sc.nextInt();
        }
        for(int i=0; i<price.length; i++){
            price[i] = sc.nextInt();
        }

        int[] price1 = Arrays.copyOfRange(price, 0, dis.length);

        min += dis[0] * price1[0];
        for(int i=1; i<dis.length; i++){
            if(price1[i-1] >= price1[i])
                min += dis[i] * price1[i];
            else
                min += dis[i] * price1[i-1];
        }
        System.out.println(min);
    }
}
