package leeseolhui.baekjoon.level08;

import java.util.Scanner;

public class Code06 {
    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void partition(int test){
        int a=test-2;
        int b=2;
        int result1=0;
        int result2=0;

        while(a>=b){
            if(!isPrime(a) || !isPrime(b)){
                a--;
                b++;
            }else if(isPrime(a) && isPrime(b)){
                result1 = a;
                result2 = b;
                a--;
                b++;
            }
        }
        if(result1 > result2)
            System.out.println(result2 + " " + result1);
        else
            System.out.println(result1 + " " + result2);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            partition(arr[i]);
        }
    }
}
