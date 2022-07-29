package leeseolhui.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Code05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> result = new ArrayList<Integer>();
        String s = bf.readLine();

        String[] arr = s.split("");
        for(String a:arr){
            result.add(Integer.parseInt(a));
        }
        Collections.sort(result,Collections.reverseOrder());
        for(int i=0; i< result.size(); i++){
            System.out.print(result.get(i));
        }
    }
}
