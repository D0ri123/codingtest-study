package leeseolhui.baekjoon.level12;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Code01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set man = new TreeSet();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            man.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i=0; i<arr2.length; i++){
            if(man.contains(arr2[i]))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}
