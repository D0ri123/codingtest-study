package leeseolhui.two_pointer;
/**
 * 최대 매출 구하기(Window sliding)
 */

import java.util.Scanner;

public class Code05 {

    public static int solution(int k, int[] arr){
        int sum=0;

        // 배열에서 k개만큼 더한 값으로 초기값 설정
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int max = sum;

        for(int i=k; i<arr.length; i++){
            sum += arr[i];
            sum -= arr[i-k];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] sell = new int[n];
        for(int i=0; i<n; i++){
            sell[i] = sc.nextInt();
        }
        System.out.println(solution(k, sell));
    }
}
