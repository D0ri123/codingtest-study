package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            String[] str = s.split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1]==o2[1]){
                return Integer.compare(o1[0],o2[0]);
            }
            else{
                return Integer.compare(o1[1],o2[1]);
            }
        });


        for(int i=0; i<n; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
