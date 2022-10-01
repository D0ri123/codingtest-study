package leeseolhui.two_pointer;

/**
 * baekjoon 1337 - 올바른 배열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code20 {
    public static int solution(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int lt=0;
        int max = Integer.MIN_VALUE;
        while(lt<=arr.length-1) {
            for (int rt=lt; rt<arr.length; rt++) {
                if (arr[rt] <= arr[lt] + 4) {
                    result.add(arr[rt]);
                } else break;
            }
            max = Math.max(max, result.size());
            result.clear();
            lt++;
        }
        return 5-max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int res = solution(arr);
        System.out.println(res);
    }
}
