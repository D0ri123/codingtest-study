package leeseolhui.baekjoon.level07;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prev = 0; // 직전 대각선 누적합
        int cnt = 1; // 해당 대각선 개수

        while(true){
            if(a <= prev + cnt){
                if(cnt % 2 == 1){ //해당 대각선 개수가 홀수일 경우
                    System.out.print((cnt - (a - prev - 1)) + "/" + (a - prev));
                    break;
                }
                else{ //해당 대각선 개수가 짝수일 경우
                    System.out.print((a-prev) + "/" + (cnt - (a - prev - 1)));
                    break;
                }
            }else{
                prev += cnt;
                cnt++;
            }
        }
    }
}
