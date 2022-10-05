package leeseolhui.hash_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 학급 회장
 */

public class Code01 {
    public static char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x: s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        sb.append(solution(n, str));
        System.out.println(sb);
    }
}
