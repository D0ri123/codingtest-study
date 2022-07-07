package leeseolhui.baekjoon.level06;

import java.util.Scanner;

public class Code08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        char[] number = num.toCharArray();
        int[] result = new int[number.length];
        int sum = 0;

        for(int i=0; i<number.length; i++){
            switch(number[i]){
                case 'A': case 'B': case 'C':
                    result[i] = 3;
                    break;
                case 'D': case 'E': case 'F':
                    result[i] = 4;
                    break;
                case 'G': case 'H': case 'I':
                    result[i] = 5;
                    break;
                case 'J': case 'K': case 'L':
                    result[i] = 6;
                    break;
                case 'M': case 'N': case 'O':
                    result[i] = 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    result[i] = 8;
                    break;
                case 'T': case 'U': case 'V':
                    result[i] = 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    result[i] = 10;
                    break;
            }
            sum = sum + result[i];
        }
        System.out.println(sum);
    }
}
