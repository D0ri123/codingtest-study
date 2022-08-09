package leeseolhui.baekjoon.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] input = str.split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<String> listening = new HashSet<>();
        Set<String> seeing = new HashSet<>();
        Set<String> result = new TreeSet<>();

        for(int i=0; i<n; i++){
            listening.add(br.readLine());
        }
        for(int i=0; i<m; i++){
            seeing.add(br.readLine());
        }

        Iterator it = listening.iterator();
        int count = 0;
        while(it.hasNext()){
            Object obj = it.next();
            if(seeing.contains(obj)){
                count++;
                result.add(obj.toString());
            }
        }

        System.out.println(count);
        Iterator it1 = result.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
