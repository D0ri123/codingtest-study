package leeseolhui.baekjoon.level22;

import java.util.Arrays;
import java.util.Scanner;

public class Code01 {

    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) return 0;
        int mid = (start+end)/2;
        if(target == arr[mid]) return 1;
        else if(target > arr[mid]) return binarySearch(arr, target, mid+1, end);
        else return binarySearch(arr, target, start, mid-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        int m = sc.nextInt();
        int[] numbers = new int[m];
        for(int i=0; i<m; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i< numbers.length; i++){
            int result = binarySearch(num, numbers[i], 0, n-1);
            System.out.println(result);
        }
    }
}
