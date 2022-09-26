package leeseolhui.binary_search;

/**
 * baekjoont 2343 - 기타레슨
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code15 {
    public static int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x:arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            } else sum+=x;
        }
        return cnt;
    }
    public static int solution(int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // lt=9
        int rt = Arrays.stream(arr).sum(); // rt=45

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=m){
                answer = mid;
                rt = mid-1;
            } else lt=mid+1;
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

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(m, arr);
        sb.append(result);

        System.out.println(sb);
        br.close();
    }
}
