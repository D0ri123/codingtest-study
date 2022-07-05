package leeseolhui.baekjoon.level06;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String num = "";
        char[] arr = null;

        for (int i = 0; i < test; i++) {
            num = sc.next();
            arr = sc.next().toCharArray();

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < Integer.parseInt(num); k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
