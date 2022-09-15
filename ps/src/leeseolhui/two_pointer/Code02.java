package leeseolhui.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * baekjoon 1806
 */

public class Code02{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //입력받는 숫자의 개수
        int s = Integer.parseInt(st.nextToken()); //target_sum

        int[] list = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<list.length; i++){
            int num = Integer.parseInt(st.nextToken());
            list[i] = num; // list에 숫자들이 입력된다.
        }

        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int maxSum = list[end];

        while(end<n && start<n) {
            if(maxSum >= s){
                minLen = Math.min(minLen, end-start+1);
                int startNum = list[start++];
                maxSum -= startNum;
                continue;
            }

            if(start>end)
                break;

            if(end==n-1)
                break;
            int num = list[++end];
            maxSum += num;
        }
        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}

