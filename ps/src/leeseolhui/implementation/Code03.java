package leeseolhui.implementation;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String star = "*";
            System.out.println(star.repeat(n-i));
        }
    }
}
