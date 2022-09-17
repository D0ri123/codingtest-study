package leeseolhui.two_pointer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 배열 합치기
 */

public class Code03 {
    public static ArrayList<Integer> answer(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]) ans.add(arr1[p1++]);
            else ans.add(arr2[p2++]);
        }

        while(p1<n) ans.add(arr1[p1++]);
        while(p2<m) ans.add(arr2[p2++]);
        return ans;
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

        for(int a : answer(n,m,arr1,arr2)) System.out.print(a + " ");

    }
}
