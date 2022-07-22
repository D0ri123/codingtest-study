package leeseolhui.baekjoon.level08;

import java.util.Scanner;

public class Code04 {

    public static boolean isPrime(int n){
            if(n<2) return false;
            for(int j=2; j<=Math.sqrt(n); j++){
                if(n%j==0)
                    return false;
            }
            return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean b;

        for(int i=m; i<=n; i++){
           b = isPrime(i);
           if(b==true){
               System.out.println(i);
           }
        }
    }
}
