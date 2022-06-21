package leeseolhui.level01;

import java.util.Scanner;

public class code09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //472
        int b = sc.nextInt(); //385

        int fir = b / 100; //3
        int one = a * (fir * 100);
        b = b - (fir * 100);

        int sec = b / 10;
        int two = a * (sec * 10);
        b = b - (sec * 10);

        int three = a * b;

        System.out.println(a * b);
        System.out.println(a * sec);
        System.out.println(a * fir);
        System.out.println(one + two + three);
    }
}
