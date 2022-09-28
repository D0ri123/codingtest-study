package leeseolhui.two_pointer;

/**
 * baekjoon 2018 - 수들의 합5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum=0, cnt=0;
        int lt=1;
        for(int rt=1; rt<=n; rt++){
            sum += rt;
            if(sum>n){
                while(sum>=n){
                    sum -= lt++;
                    if(sum==n) cnt++;
                }
            }
            else if(sum==n) cnt++;
        }
        System.out.println(cnt);
    }
}
