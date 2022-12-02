package leeseolhui.dp;

//최대 부분 증가수열

import java.util.Arrays;
import java.util.Scanner;

public class Code03 {
    static int[] result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[] arr){
        result = new int[n];
        result[0] = 1;

        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j] && result[j] > max) {
                    max = result[j];
                }
                result[i] = max+1;
            }
        }

        int maxLen = Arrays.stream(result).max().getAsInt();
        return maxLen;
    }
}