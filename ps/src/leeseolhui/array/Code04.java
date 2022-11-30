package leeseolhui.array;

//피보나치 수열

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    public static void solution(int n){
        StringBuilder sb = new StringBuilder();
        int[] pibo = new int[n];
        pibo[0] = 1;
        pibo[1] = 1;
        sb.append(pibo[0]).append(" ").append(pibo[1]).append(" ");

        int i=2;
        while(i<n){
            pibo[i] = pibo[i-1] + pibo[i-2];
            sb.append(pibo[i]).append(" ");
            i++;
        }
        System.out.println(sb);
    }
}
