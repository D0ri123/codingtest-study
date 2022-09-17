package leeseolhui.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통원소 찾기
 */

public class Code04 {
    public static ArrayList<Integer> answer(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr1); // two-pointers 알고리즘은 반드시 오름차순을 시켜줘야한다. {1,2,3,5,9}
        Arrays.sort(arr2); // {2,3,5,7,8}

        int p1=0, p2=0;

        while(p1<n && p2<m){
            if(arr1[p1] < arr2[p2]) p1++;
            else if(arr1[p1] > arr2[p2]) p2++;
            else result.add(arr1[p1++]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        for(int a:answer(n,m,arr1,arr2)) {
            System.out.print(a + " ");
        }

    }
}
