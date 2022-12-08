package leeseolhui.binary_search;

/**
 * 부분수열의 합2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code23 {

    public static int serialSum(int lt, int rt, int[] arr){
        int sum = 0;
        for(int i=lt; i<=rt; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int solution(int[] arr1, int[] arr2){
        int answer = 0;
        int p_lt=0, p_rt=0;
        int m_lt=0, m_rt=0;
        while(p_rt<arr1.length && m_rt<arr2.length){
            if(arr1[p_rt]!=arr2[m_rt]);

        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] plus = new int[100000];
        int[] minus = new int[100000];

        int p_index=0, m_index=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a>=0) plus[p_index++] = a;
            else minus[m_index++] = a;
        }

        Arrays.sort(plus);
        Arrays.sort(minus);
    }
}
