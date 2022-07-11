package leeseolhui.implementation;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Example_04_02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for(int h=0; h<n+1; h++){
            for(int m=0; m<60; m++){
                for(int s=0; s<60; s++){
                    String sec = Integer.toString(s);
                    String min = Integer.toString(m);
                    String hr = Integer.toString(h);
                    if(sec.contains("3") || min.contains("3") || hr.contains("3")) count++;
                }
            }
        }
        System.out.println(count);
    }
}
