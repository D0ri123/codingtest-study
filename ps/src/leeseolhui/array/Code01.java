package leeseolhui.array;

// 큰 수 출력하기

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution(arr);
    }

    public static void solution(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]).append(" ");

        for(int i=1; i<array.length; i++){
            if(array[i]>array[i-1])
                sb.append(array[i]).append(" ");
        }
        System.out.println(sb);
    }
}
