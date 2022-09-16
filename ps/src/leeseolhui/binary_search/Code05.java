package leeseolhui.binary_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * baekjoon 2776 - 암기왕
 */

public class Code05 {
    public static int[] note1;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       int test = sc.nextInt();

       int n=0;
       while(n != test) {
           int num1 = sc.nextInt();
           note1 = new int[num1];
           for (int j = 0; j < num1; j++) {
               note1[j] = sc.nextInt();
           }

           Arrays.sort(note1);

           int num2 = sc.nextInt();

           for(int j=0; j<num2; j++) {
               int result = Arrays.binarySearch(note1, sc.nextInt());
               if (result < 0)
                   sb.append(0).append("\n");
               else
                   sb.append(1).append("\n");
           }
           n++;
       }
        System.out.println(sb);
    }
}

