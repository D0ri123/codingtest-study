package leeseolhui.baekjoon.level11;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code02 {
    public static void main(String[] args) throws IOException {
//        //계수 정렬을 사용한 다른 사람의 풀이
//        int[] arr = new int[2000001];
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(bf.readLine());
//        for (int i = 0; i < N; i++) {
//            arr[Integer.parseInt(bf.readLine()) + 1000000 ] = 1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                sb.append(i - 1000000).append('\n');
//            }
//        }
//        System.out.println(sb);


        //Collections.sort()를 사용한 경우
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(bf.readLine());
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            arrayList.add(Integer.parseInt(bf.readLine()));
//        }
//
//        Collections.sort(arrayList);
//
//        for (Integer integer : arrayList) {
//            bw.write(integer + "\n");
//        }
//        bw.flush();
//        bw.close();


        //내가 한 풀이(계수 정렬 사용 - 시간초과)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] result = new int[2000001];

        for(int i=0; i<n; i++){
            result[Integer.parseInt(bf.readLine())+1000000]=1;
        }

        for(int i=0; i<result.length; i++){
            if(result[i]==1)
                System.out.println(i-1000000);
        }
    }
}

