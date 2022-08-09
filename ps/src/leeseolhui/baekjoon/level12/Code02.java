package leeseolhui.baekjoon.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> S = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        int count = 0;

        String[] num = str.split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);


        for(int i=0; i<n; i++){
            S.add(br.readLine());
        }

        for(int i=0; i<m; i++){
            map.put(i,br.readLine());
        }

        Iterator<String> it = map.values().iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(S.contains(obj))
                count++;
        }
        System.out.println(count);
    }
}
