package leeseolhui.baekjoon.level12;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] sang = new int[20000001];

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            sang[a+10000000]++;
        }

        int m = sc.nextInt();
        int[] origin = new int[m];
        for(int i=0; i<m; i++){
            origin[i] = sc.nextInt();
        }

        for(int a:origin){
            sb.append(sang[a+10000000]).append(" ");
        }
        System.out.println(sb);
    }
}
