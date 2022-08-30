package leeseolhui.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * baekjoon 1026
 */

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);//b는 오름차순으로 정렬
        Arrays.sort(a, Collections.reverseOrder());

        int sum=0;
        for(int i=0; i<n; i++){
            sum += (a[i]*b[i]);
        }
        System.out.println(sum);
    }
}
