package leeseolhui.baekjoon.level06;

import java.util.Scanner;

public class Code07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.nextLine();
        b = b.trim();

        String str1 = "";
        String str2 = "";

        char[] arr1 = a.toCharArray(); // arr1 = [7, 3, 4]
        char[] arr2 = b.toCharArray(); // arr2 = [8, 9, 3]

        for(int i=2; i>=0; i--){
            str1 = str1 + arr1[i]; // str1 = 437
            str2 = str2 + arr2[i]; // str2 = 398
        }

        if(Integer.parseInt(str1) > Integer.parseInt(str2)){
            System.out.println(str1);
        } else{
            System.out.println(str2);
        }
    }
}
