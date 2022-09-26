package leeseolhui.binary_search;

/**
 * 이분 검색
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code13 {
    public static int binSearch(int m, int[] arr, int start, int end){
        int result = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==m){
                result = mid+1;
                break;
            }
            if(arr[mid]>m) end = mid-1;
            else start = mid+1;
        }
       return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        sb.append(binSearch(m,arr,0,n-1));
        System.out.println(sb);
    }
}
