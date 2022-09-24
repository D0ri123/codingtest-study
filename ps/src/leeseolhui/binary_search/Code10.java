package leeseolhui.binary_search;

/**
 * 중복 확인
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code10 {
    public static String solution(int n, int[] arr){
        String answer = "U";
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1])
                return "D";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        sb.append(solution(n,arr));
        System.out.println(sb);
        br.close();
    }
}
