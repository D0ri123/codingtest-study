package leeseolhui.baekjoon.level04;

import java.util.Scanner;

public class code06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int j=0; j<n; j++){
            int count = 0;
            int result = 0; // 각 문자열의 케이스를 계산하기 위해서, 시작 초기에 count와 result의 값으 0으로 초기화함
            String[] arr1 = arr[j].split("");
            int[] arr2 = new int[arr1.length];
                for(int k=0; k<arr1.length; k++){
                    if(arr1[k].equals("O")) {
                        count++;
                        arr2[k] = count;
                        result = result + arr2[k];
                    } else{
                        count = 0;
                        arr2[k] = count;
                        result = result + count;
                    }
                }
            System.out.println(result);
        }
    }
}
