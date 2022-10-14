package leeseolhui.hash_map;

/**
 * 모든 아나그램 찾기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Code04 {
    public static int solution(String a, String b){
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        int answer = 0;

        for(char x: b.toCharArray())
            bm.put(x, bm.getOrDefault(x,0)+1);

        int len = b.length()-1;
        for(int i=0; i<len; i++)
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);

        int lt=0;
        for(int rt=len; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine(); //bacaAacba
        String b = br.readLine(); //abc

        int ans = solution(a, b);
        System.out.println(ans);
    }
}
