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

        int count = 1;
        int i=1;
        while(word.length()>0){
            char alphabet = word.charAt(0);
            if(alphabet == word.charAt(i)) {
                i++;
                count++;
            }
            else{
                sb.append(alphabet).append(count);
                word = word.substring(i);
                count = 1;
            }
        }

        return sb.toString();
    }
}
