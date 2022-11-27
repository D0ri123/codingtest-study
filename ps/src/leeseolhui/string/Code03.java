package leeseolhui.string;

//회문 문자열

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }

    public static String solution(String word){
        String sb = new StringBuilder(word).reverse().toString();

        if(sb.equalsIgnoreCase(word))
            return "YES";
        return "NO";
    }
}
