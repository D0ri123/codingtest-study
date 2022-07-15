package leeseolhui.baekjoon.level08;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int count = 0;
        boolean b;


        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
            b=true;
            if(num[i] <= 1)
                b=false;
            else{
                for(int j=2; j<num[i]; j++) {
                   int a = num[i]%j;
                   if(a == 0) {
                       b=false;
                       break;
                   }
               }
                if(b) count++;
            }
        }
        System.out.println(count);
    }
}
