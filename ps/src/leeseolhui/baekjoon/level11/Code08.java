package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Code08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = bf.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length() - s2.length();
                }
            }
        });

        for(int i=0; i<arr.length-1; i++){
            if(!arr[i].equals(arr[i+1])){
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[n-1]);
    }
}
