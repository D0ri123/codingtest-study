package leeseolhui.string;

// 문자열 압축

import java.util.Scanner;

public class Code07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }

    public static String solution(String word){
        StringBuilder sb = new StringBuilder();

        word += " ";
        int count = 1;
        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i+1))
                count++;
            else{
                sb.append(word.charAt(i));
                if(count>1) sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
