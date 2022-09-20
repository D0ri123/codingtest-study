package leeseolhui.two_pointer;

/**
 * baekjoon 2559 -  수열
 */

import java.io.*;
import java.util.StringTokenizer;

public class Code12 {
    public static int solution(int n, int k, int[] arr) {
        int lt=0, cnt=0, temp=0;
        int max = Integer.MIN_VALUE;
        for(int rt=0; rt<n; rt++){
            temp += arr[rt];
            cnt++;
            if(cnt==k){
                max = Math.max(max, temp);
                temp -= arr[lt++];
                cnt--;
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n,k,arr));

        br.close();
    }
}
