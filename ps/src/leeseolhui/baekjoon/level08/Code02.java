package leeseolhui.baekjoon.level08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code02 {

    public static boolean prime(int n){
        if(n<2) return false;

        for(int i=2; i<n; i++){
            if(n%i ==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> minArr = new ArrayList<Integer>();

        for(int i=m; i<=n; i++){
            if(prime(i)){
                sum+=i;
                minArr.add(i);
            }
        }

        if(minArr.size()==0){
            System.out.println(-1);
        }else{
            int min = Collections.min(minArr);
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
