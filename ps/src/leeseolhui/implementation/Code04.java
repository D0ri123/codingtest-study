package leeseolhui.implementation;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        String blank = " ";
        for(int i=0; i<n; i++){
            System.out.println(blank.repeat(i) + star.repeat(n-i));
        }
    }
}
