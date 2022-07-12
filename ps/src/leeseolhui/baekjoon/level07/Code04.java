package leeseolhui.baekjoon.level07;

import java.io.*;
import java.util.StringTokenizer;

public class Code04 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int day = (h-b) / (a-b);

        if((h-b) % (a-b) != 0){
            day++;
        }
        System.out.println(day);
    }
}

//        while(init < h){ 내가 짠 코드이지만, 시간초과가 되어 통과하지 못함
//            day++;
//            if(init + a >= h) break;
//            else{
//                init = init + a - b;
//            }
//        }