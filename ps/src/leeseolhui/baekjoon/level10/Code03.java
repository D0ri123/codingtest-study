package leeseolhui.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] person = new int[n][2];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            person[i][0] = Integer.parseInt(arr[0]);
            person[i][1] = Integer.parseInt(arr[1]);
        }

        for(int i=0; i<n; i++){
            int rank = 1;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(person[i][0] < person[j][0] && person[i][1] < person[j][1]) rank++;
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}
