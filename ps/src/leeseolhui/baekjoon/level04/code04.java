package leeseolhui.baekjoon.level04;

import java.util.HashSet;
import java.util.Scanner;

public class code04 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[10];
     HashSet<Integer> hs = new HashSet<Integer>();

     for(int i=0; i<arr.length; i++) {
         arr[i] = sc.nextInt();
         arr[i] = arr[i] % 42;
     }

     for(int j=0; j<arr.length; j++){
         hs.add(arr[j]);
     }

     System.out.println(hs.size());
    }
}
