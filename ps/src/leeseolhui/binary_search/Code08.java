package leeseolhui.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 삽입정렬
 */

public class Code08 {
    public static int[] solution(int n, int[] arr){
        for(int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp){
                    arr[j+1] = arr[j];
                }else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int a:solution(n, arr)){
            sb.append(a).append(" ");
        }

        System.out.println(sb);

    }
}
