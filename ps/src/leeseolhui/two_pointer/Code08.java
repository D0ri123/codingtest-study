package leeseolhui.two_pointer;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 */

public class Code08 {
    public static int solution(int k, int n, int[] arr){
        int cnt = 0;
        int max = -1;
        int lt = 0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt += 1;
            if(cnt>k){
                while(cnt!=k){
                    if(arr[lt++]==0)
                        cnt-=1;
                }
            }
            max = Math.max(max, rt-lt+1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(k,n,arr));
    }
}
