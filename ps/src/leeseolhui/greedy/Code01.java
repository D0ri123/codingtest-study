package leeseolhui.greedy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Code01 {
    public static int smallest(int[] arr){ //가장 작은 원소의 인덱스를 찾아주는 메서드이다.
        int min = arr[0];
        int index = 0;
        for(int i=1; i<=arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int biggest(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int i=1; i<=arr.length; i++){
            if(max <arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] remove(int[] a, int index){
        if(a==null || index<0 || index>=a.length) return a;
        return IntStream.range(0,a.length)
                .filter(i -> i != index)
                .map(i -> a[i])
                .toArray();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); //{1,1,1,6,0}
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt(); //{2,7,8,3,1}
        }




    }
}
