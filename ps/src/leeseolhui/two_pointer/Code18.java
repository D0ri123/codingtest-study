package leeseolhui.two_pointer;

/**
 * baekjoon 7795 - 먹을 것인가 먹힐 것인가
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code18 {
    public static int solution(int[] a, int[] b){
        int cnt = 0;
        int min = Arrays.stream(b).min().getAsInt();
        for(int lt=0; lt<a.length; lt++){
            if(a[lt]>min){
                for(int rt=0; rt<b.length; rt++){
                    if(a[lt]>b[rt]) cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a_len = Integer.parseInt(st.nextToken());
            int b_len = Integer.parseInt(st.nextToken());

            int[] a = new int[a_len];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<a_len; j++){
                a[j] = Integer.parseInt(st.nextToken());
            }

            int[] b = new int[b_len];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b_len; j++){
                b[j] = Integer.parseInt(st.nextToken());
            }

            int result = solution(a, b);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
