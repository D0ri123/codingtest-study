package leeseolhui.two_pointer;

/**
 * baekjoon 2531 - 회전 초밥
 */

import java.io.*;
import java.util.StringTokenizer;

public class Code16 {
    public static int solution( int k, int c, int[] sushi, int[] ate) {
        int cnt = 0, max;

        for (int i = 0; i < k; i++){
            if(ate[sushi[i]]==0) cnt++;
            ate[sushi[i]]++;
        }
        max = cnt;

        for(int i=1; i<sushi.length; i++){
            if(max<=cnt){
                if(ate[c]==0) max = cnt+1;
                else max = cnt;
            }

            ate[sushi[i-1]]--;
            if(ate[sushi[i-1]]==0) cnt--;

            if(ate[sushi[(i+k-1)% sushi.length]]==0) cnt++;
            ate[sushi[(i+k-1)%sushi.length]]++;
    }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sushi = new int[n];
        int[] ate = new int[d+1];
        for(int i=0; i<n; i++){
            sushi[i] = Integer.parseInt(br.readLine());
        }

        int result = solution(k,c,sushi,ate);
        sb.append(result);

        System.out.println(sb);
        br.close();
    }
}
