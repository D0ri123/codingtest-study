package leeseolhui.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class example_03_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
//                System.out.print(arr[i][j] + " ");
            }
//            System.out.println(); -> 2차원 배열 출력 완성
        }

        int[] arr2 = new int[m];
        for(int k=0; k<m; k++){
            arr2[k] = arr[n-1][k];
        }
        Arrays.sort(arr2);
        System.out.println(arr2[0]);
    }
}
