package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Code11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] input = str.split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        String str2 = br.readLine();
        String[] num = str2.split(" ");
        Integer[] score = new Integer[n];
        for(int i=0; i<n; i++){
            score[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(score, Collections.reverseOrder());
        System.out.println(score[k-1]);
    }
}
