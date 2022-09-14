package leeseolhui.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * baekjoon 2003
 */

public class Code01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 입력받는 숫자의 개수
        int m = Integer.parseInt(st.nextToken()); // target_sum

        int[] list = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<list.length; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for(int i=0; i<list.length; i++){ // i는 8까지
            int target_sum = 0;
            int start = i;
            target_sum += list[start];
            for(int j=i; j<list.length; j++){ // j는 9까지
                int end = j;
                if(i==j){
                    if(target_sum == m){
                        cnt++;
                    }
                } else{
                    target_sum += list[end];
                    if(target_sum == m){
                        cnt++;
                    }
                    if(target_sum>m){
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
