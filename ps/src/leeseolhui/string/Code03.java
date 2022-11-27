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
        int length = word.length();
        String lowerCaseWord = word.toLowerCase();
        for(int index=0; index<length/2; index++){
            if(lowerCaseWord.charAt(index) != lowerCaseWord.charAt((length-1)-index))
                return "NO";
        }
        return "YES";
    }
}
