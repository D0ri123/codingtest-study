package leeseolhui.baekjoon.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); //구매한 총 가격
        int n = Integer.parseInt(br.readLine()); //구매한 물건 종류 수
        int[] price = new int[n];
        int[] ae = new int[n];
        int total = 0;

        for(int i=0; i<n; i++){
            String str = br.readLine();
            String[] tag = str.split(" ");
            price[i] = Integer.parseInt(tag[0]);
            ae[i] = Integer.parseInt(tag[1]);
            total += price[i]*ae[i];
        }

        if(total == x)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
