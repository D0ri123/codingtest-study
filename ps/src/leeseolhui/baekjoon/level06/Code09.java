package leeseolhui.baekjoon.level06;

import java.util.Scanner;

public class Code09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cro[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = sc.nextLine();

        for(int i=0; i<cro.length; i++){
            if(input.contains(cro[i]))
                input = input.replace(cro[i], "!");
        }
        System.out.println(input.length());
    }
}
