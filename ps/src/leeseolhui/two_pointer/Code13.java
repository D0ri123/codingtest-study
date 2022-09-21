package leeseolhui.two_pointer;

/**
 * baekjoon 3273 - 두 수의 합, (meet-in-the-middle 알고리즘)
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code13 {
    public static int solution(int n, int k, int[] arr){
        int lt = 0, rt = n-1;
        int cnt = 0;
        int sum = 0;
        while(lt<rt){
            sum = arr[lt] + arr[rt];
            if(sum==k) cnt++;
            if(sum<=k) lt++;
            else rt--;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int result = solution(n,k,arr);

        bw.write(result + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
