package leeseolhui.string;

//유효한 팰린드롬

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        solution(word);
    }

    public static void solution(String word){
        String match = "[^a-zA-Z]";
        word = word.replaceAll(match, "");

        System.out.println(checker(word));
    }

    public static String checker(String word){
        int len = word.length();
        int count = 0;
        for(int i=0; i< len/2; i++){
            String wordLowerCase = word.toLowerCase();
            if(wordLowerCase.charAt(i) == wordLowerCase.charAt(len-1-i))
                count++;
        }

        if(count == len/2)
            return "YES";
        return "NO";
    }
}
