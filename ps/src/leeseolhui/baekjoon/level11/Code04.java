package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code04 {
    public static void mean(int[] arr){
        double sum = 0;
        double result = 0;
        for(int a:arr){
            sum += a;
        }
        result = Math.round(sum/arr.length);
        System.out.println((int)Math.ceil(result));
    }

    public static void medi(int[] arr){
        int i = arr.length/2;
        Arrays.sort(arr);
        System.out.println(arr[i]);
    }

    public static void many(int[] arr){
        int[] fin = new int[8001];
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            fin[arr[i]+4000]++;
        }

        for(int i=0; i<fin.length; i++) {
            if(fin[i]!=0 && max<fin[i]) {
                max = fin[i];
            }
        }

        for(int i=0; i<fin.length; i++){
            int x=i;
            if(max==fin[i]){
                x-=4000;
                result.add(x);
            }
        }
        Collections.sort(result);
        if(result.size()==1)
            System.out.println(result.get(0));
        else
            System.out.println(result.get(1));
    }

    public static void range(int[] arr){
        ArrayList<Integer> fin = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            fin.add(i,arr[i]);
        }
        int max = Collections.max(fin);
        int min = Collections.min(fin);
        System.out.println(max - min);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        mean(arr);
        medi(arr);
        many(arr);
        range(arr);
    }
}
