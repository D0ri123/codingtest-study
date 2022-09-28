package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 마구간 정하기(결정 알고리즘)
 */

public class Code16 {
    public static int count(int[] arr, int distance){
        int ep = arr[0];
        int horse = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=distance){
                horse++;
                ep = arr[i];
            }
        }
        return horse;
    }
    public static int solution(int[] arr, int n, int c){
        int lt = 1;
        int rt = arr[n-1];
        int answer = 0;

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)>=c){
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
        int n = Integer.parseInt(st.nextToken()); //n개의 마구간
        int c = Integer.parseInt(st.nextToken()); //c마리의 말

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        sb.append(solution(arr,n,c));
        System.out.println(sb);

        br.close();
    }
}
