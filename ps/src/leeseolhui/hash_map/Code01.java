package leeseolhui.hash_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 학급 회장
 */

public class Code01 {
    public static String solution(String[] arr, int n){
        int a=1,b=1,c=1,d=1,e=1;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(arr[i].equals("A")) map.put("A", a++);
            else if(arr[i].equals("B")) map.put("B", b++);
            else if(arr[i].equals("C")) map.put("C", c++);
            else if(arr[i].equals("D")) map.put("D", d++);
            else map.put("E", e++);
        }

        String[] strings = {"A", "B", "C", "D", "E"};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<5; i++){
            max = Math.max(max, map.get(strings[i]));
        }

        String ans = "";
        for(String str:map.keySet()) {
            if(max==map.get(str))
                ans = str;
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split("");

        sb.append(solution(arr, n));
        System.out.println(sb);
    }
}
