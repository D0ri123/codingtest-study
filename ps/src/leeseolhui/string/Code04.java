package leeseolhui.string;

//유효한 팰린드롬

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }

    public static String solution(String word){
        String match = "[^A-Z]";
        word = word.toUpperCase().replaceAll(match, "");
        String tmp = new StringBuilder(word).reverse().toString().toUpperCase();

        if(word.equals(tmp))
            return "YES";
        return "NO";
    }
}
