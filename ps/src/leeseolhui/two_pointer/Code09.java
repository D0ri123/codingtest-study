package leeseolhui.two_pointer;

/**
 * baekjoon 1644 - 소수의 연속합
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Code09 {
    public static boolean isPrime(int n){
        int i=2;
        while(i*i <= n){
            if((n%i)==0) return false;
            i++;
        }
        return true;
    }
    public static int solution(int n){
        ArrayList<Integer> primeNum = new ArrayList<>();
        int cnt = 0;
        int sum = 0;
        int lt = 0;

        for(int rt=2; rt<=n; rt++){
            if(isPrime(rt)) {
                sum+=rt;
                primeNum.add(rt);
                if(sum == n) cnt++;
                while(sum>n){
                    sum -= primeNum.get(lt++);
                    if(sum==n) cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
