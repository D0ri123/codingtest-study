package leeseolhui.binary_search;

/**
 * baekjoon 16401 - 과자 나눠주기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code22 {
    public static boolean cnt(int[] arr, int len, int m){
        int sum = 0;
        boolean ans = false;
        for(int a:arr){
            sum += (a/=len);
            if(sum>=m) {
                ans = true;
                break;
            }
        }
        return ans;
    }
    public static int solution(int[] arr, int n, int m){
        int lt = 1;
        int rt = arr[n-1];
        int result = 0;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(cnt(arr, mid, m)) {
                result = mid;
                lt = mid+1;
            }else rt = mid-1;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cookie = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            cookie[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cookie);

        int res = solution(cookie, n, m);
        System.out.println(res);
    }
}
