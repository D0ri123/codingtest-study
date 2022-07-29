package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int a:sorted){
            if(!map.containsKey(a))
                map.put(a, idx++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i:arr){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
