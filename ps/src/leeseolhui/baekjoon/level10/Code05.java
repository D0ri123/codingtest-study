package leeseolhui.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int number = 666;
        int result = 1;
        while(result != n){
            number++;
            if(String.valueOf(number).contains("666"))
                result++;
        }
        System.out.println(number);
    }
}
