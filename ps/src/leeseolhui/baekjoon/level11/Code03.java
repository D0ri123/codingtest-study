package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] result = new int[10001];

        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(bf.readLine());
            result[num]++;
        }

        for(int i=0; i<result.length; i++){
            if(result[i] != 0){
                for(int j=1; j<=result[i]; j++){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
