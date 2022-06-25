package leeseolhui.baekjoon.level04;

import java.util.Scanner;

public class code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc. nextInt();

        int result = a * b * c;
        String res = Integer.toString(result);//int형 숫자를 문자열로 변환
        String[] arr = res.split("");
        int[] arr1 = new int[res.length()];
        int[] num = new int[10];

        for(int i=0; i<arr1.length; i++){
            arr1[i] = Integer.parseInt(arr[i]); //parseInt메소드를 통하여 arr[i]를 int형으로 변환
        }

        for(int j=0; j<=9; j++){
            for(int k=0; k<arr.length; k++){
                if(arr1[k] == j){
                    num[j]++;
                }
            }
            System.out.println(num[j]);
        }
    }
}
