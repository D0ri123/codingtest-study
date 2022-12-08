package leeseolhui.baekjoon.level22;

import java.util.Arrays;
import java.util.Scanner;

public class Code02 {

    public static int counting(int[] arr, int target){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(target == arr[i])
                sum = sum +1;
        }
        return sum;
    }

    public static int search(int[] arr, int target, int start, int end){
        if(start>end) return 0;
        int mid = (start+end)/2;
        if(arr[mid] == target) {
            return counting(arr, target);
        }
        else if(arr[mid] > target) return search(arr, target, start, mid-1);
        else return search(arr, target, mid+1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] person = new int[n];
        for(int i=0; i<n; i++){
            person[i] = sc.nextInt();
        }
        Arrays.sort(person);

        int m = sc.nextInt();
        int[] card = new int[m];
        for(int i=0; i<m; i++){
            card[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            int result = search(person, card[i], 0, n-1);
            System.out.print(result + " ");
        }
    }
}
