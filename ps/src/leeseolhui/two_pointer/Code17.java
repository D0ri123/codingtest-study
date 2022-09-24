package leeseolhui.two_pointer;

/**
 * baekjoon 2230 - 수 고르기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code17 {
    public static int solution(int m, int[] arr){
        int min = Integer.MAX_VALUE;
        int lt=0;
        for(int rt=0; rt<arr.length; rt++){
            int res = arr[rt] - arr[lt];
            if(res>=m){
                min = Math.min(min, res);
                lt++;
                rt=lt;
            }
        }
        return min;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine()); //{1,5,3}
        }

        Arrays.sort(arr);

        int result = solution(m, arr);
        sb.append(result);
        System.out.println(sb);
    }
}
