package leeseolhui.two_pointer;

/**
 * 연속부분수열
 */

import java.util.Scanner;

public class Code06 {
    public static int sum(int[] arr, int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int solution(int[] arr, int n, int m){
        int count = 0;
        int start = 0;
        int end = 0;
        while(end < n){
            if(sum(arr, start, end) < m) end++;
            else if(sum(arr, start, end)>m){
                start++;
            }
            else{
                count++;
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, n, m));
    }
}
