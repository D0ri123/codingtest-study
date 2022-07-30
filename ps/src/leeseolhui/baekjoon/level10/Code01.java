package leeseolhui.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Code01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine(); // 5 21
        StringTokenizer st = new StringTokenizer(input, " ");
        int[] arr = new int[st.countTokens()];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken()); //arr={5,21}
        }

        int[] num = new int[arr[0]];
        String numbers = br.readLine();
        StringTokenizer st1 = new StringTokenizer(numbers, " ");
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(st1.nextToken());
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<num.length; i++){
            for(int k=i+1; k<num.length; k++){
                for(int j=k+1; j< num.length; j++){
                    int a = num[i];
                    int b = num[j];
                    int c = num[k];
                    if(a+b+c <= arr[1])
                        result.add(a+b+c);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.get(result.size()-1));
    }
}
