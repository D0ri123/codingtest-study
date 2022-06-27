package leeseolhui.baekjoon.level04;

import java.util.Scanner;

public class code07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ex = sc.nextInt();

        for(int i=0; i<ex; i++){
            double sum = 0;
            double count=0;

            int n = sc.nextInt();
            double[] arr = new double[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextDouble();
                sum = sum + arr[j];
            }
            double mean = sum / n;

            for(int k=0; k<n; k++){
                if(arr[k] > mean) count++;
            }

            String result = String.format("%.3f",count/n * 100);
            System.out.println(result + "%");
        }

    }
}
