package leeseolhui.two_pointer;

/**
 * baekjoon 11728 - 배열 합치기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Code10 {
    public static ArrayList<Integer> solution(int n, int m, int[] arrA, int[] arrB){
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0;
        int b = 0;
        while(a<n && b<m){
            if(arrA[a]<arrB[b]) result.add(arrA[a++]);
            else result.add(arrB[b++]);
        }
        while(a<n){
            result.add(arrA[a++]);
        }

        while(b<m){
            result.add(arrB[b++]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] input = str.split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arrA = new int[n];
        int[] arrB = new int[m];

        String strA = br.readLine();
        String[] inputA = strA.split(" ");

        for(int i=0; i<n; i++){
            arrA[i] = Integer.parseInt(inputA[i]);
        }

        String strB = br.readLine();
        String[] inputB = strB.split(" ");
        for(int i=0; i<m; i++){ //배열 B
            arrB[i] = Integer.parseInt(inputB[i]);
        }

       for(int a: solution(n,m,arrA, arrB)){
           sb.append(a).append(" ");
       }

        System.out.println(sb);
        br.close(); //br.close도 꼭 명시해주기. runtime에 영향을 끼친다.
    }
}
