package leeseolhui.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class example_03_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int sum = 0;
        int [] a = new int[n];
        for(int j=0; j<n; j++){
            a[j] = sc.nextInt();
        }

        Arrays.sort(a);
        int b = a[n-1];
        int c = a[n-2];

        if(b!=c){
            while(m>=k){
                sum = sum + (b*k) + c;
                m = m-k-1;
            }
            sum = sum + (b*m);
        }else {
            sum = sum + (b*m);
        }
        System.out.println(sum);
    }
}
