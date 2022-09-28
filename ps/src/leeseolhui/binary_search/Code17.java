package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * baekjoon 2110 - 공유기 설치
 */

public class Code17 {
    public static int cnt(int[] arr, int dist){
        int ep = arr[0];
        int wifi = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                wifi++;
                ep = arr[i];
            }
        }
        return wifi;
    }

    public static int solution(int[] arr, int n, int c){
        int lt = 1;
        int rt = arr[n-1];
        int answer = 0;

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(cnt(arr, mid)>=c){
                answer = mid;
                lt = mid+1;
            }else rt = mid-1;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int result = solution(arr, n, c);
        sb.append(result);

        System.out.println(sb);
        br.close();
    }
}
