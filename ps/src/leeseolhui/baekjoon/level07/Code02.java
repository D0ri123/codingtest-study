package leeseolhui.baekjoon.level07;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int init = 1;

        for(int i=1; ; i++){
            if(n==1){
                System.out.println(1);
                break;
            }else if(n <= init + (6*i)){
                System.out.println(i+1);
                break;
            }
            init = init + (6*i);
        }
    }
}
