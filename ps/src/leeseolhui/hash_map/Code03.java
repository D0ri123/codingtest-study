package leeseolhui.hash_map;

/**
 * 매출액의 종류
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Code03 {
    public static String solution(int n, int k, int[] sell){
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){
            map.put(sell[i], map.getOrDefault(sell[i], 0)+1);
        }

        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(sell[rt], map.getOrDefault(sell[rt], 0)+1);
            sb.append(map.size()).append(" ");
            map.put(sell[lt], map.get(sell[lt])-1);
            if(map.get(sell[lt])==0) map.remove(sell[lt]);
            lt++;
        }

        String answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] sell = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            sell[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, k, sell));
    }
}
