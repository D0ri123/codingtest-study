package leeseolhui.baekjoon.level06;

import java.util.Arrays;
import java.util.Scanner;

public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'a';
            if(arr[ch] == -1) arr[ch] = i;
        }

        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
