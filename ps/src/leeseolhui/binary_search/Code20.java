package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * baekjoon 3079 - 입국심사
 */

public class Code20 {
    public static long cnt(int[] arr, long time, int m){
        long sum = 0;
        for(int a : arr){
            long val = time/a;
            if(sum>=m) break;
            sum+=val;
        }
        return sum;
    }
    public static long solution(int[] arr, int m){
        long lt = 0;
        long rt = (long) Arrays.stream(arr).max().getAsInt() * m;
        long answer = 0;
        while(lt<=rt){
            long mid = (lt+rt)/2;
            if(cnt(arr, mid, m) >= m){
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] checking = new int[n];
        for(int i=0; i<n; i++){
            checking[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(checking);

        sb.append(solution(checking, m));
        System.out.println(sb);
    }
}
