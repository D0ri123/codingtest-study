package leeseolhui.binary_search;

/**
 * 장난꾸러기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code11 {
    public static void solution(int n,int[] arr1, int[] arr2){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(arr1[i]!=arr2[i]) sb.append(i+1).append(" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] students = new int[n];
        int[] result = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ; i++){
            students[i] = Integer.parseInt(st.nextToken());
            result[i] = students[i];
        }

        Arrays.sort(students);

        solution(n,students,result);
    }
}
