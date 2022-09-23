package leeseolhui.two_pointer;
/**
 * baekjoon 1940 - 주몽
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code15 {
    public static int solution(int m, int[] source){
        int lt=0, rt=source.length-1;
        int cnt = 0;
        while(lt<rt){
            int sum = source[lt] + source[rt];
            if(sum < m){
                lt++;
            }else if(sum >= m){
                if(sum==m){
                    cnt++;
                }
                rt--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int[] source = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            source[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(source); // {1,2,3,4,5,7}
        int result = solution(m, source);
        sb.append(result);
        System.out.println(sb);

        br.close();
    }
}
