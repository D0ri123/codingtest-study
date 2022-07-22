package leeseolhui.baekjoon.level08;

import java.util.Scanner;

public class Code05 {
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int count=0;
           int n=sc.nextInt();
            if(n!=0){
                for(int i=n+1; i<=2*n; i++){
                    if(isPrime(i)==true){
                        count++;
                    }
                }
                System.out.println(count);
            }
            else break;
        }
    }
}
