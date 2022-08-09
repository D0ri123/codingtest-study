package leeseolhui.baekjoon.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Code03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(strings[0]);//26
        int m = Integer.parseInt(strings[1]);//5

        HashMap<Integer, String> dict1 = new HashMap<Integer, String>(n);
        HashMap<String, Integer> dict2 = new HashMap<String, Integer>(n);

        for(int i=1; i<=n; i++) {
            String st = br.readLine();
            dict1.put(i, st);
            dict2.put(st, i);
        }

        for(int i=0; i<m; i++){
            String temp = br.readLine();
            if(temp.charAt(0)<='Z' && temp.charAt(0)>='A'){
                sb.append(dict2.get(temp) + "\n");
            } else {
                sb.append(dict1.get(Integer.parseInt(temp)) + "\n");
            }
        }
        System.out.println(sb);
    }
}
