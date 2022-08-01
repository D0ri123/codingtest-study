package leeseolhui.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Code02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int length = Integer.toString(n).length();
        int a = n - (9 * length);
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        if(a<0){
            a = 0;
        }

        for (int i = a; i < n; i++) {
            String num = String.valueOf(i);
            String[] digits = num.split("(?<=.)");
            int sum = 0;
            for(int j=0; j<digits.length; j++)
                sum += Integer.parseInt(digits[j]);
            result = i + sum;
            if(result == n) {
                arr.add(i);
            }
        }
        if(arr.size()==0) System.out.println(0);
        else {
            Collections.sort(arr);
            System.out.println(arr.get(0));
        }
    }
}
