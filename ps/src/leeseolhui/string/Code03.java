package leeseolhui.string;

//회문 문자열

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        solution(word);
    }

    public static void solution(String word){
        System.out.println(oddChecker(word));
    }

    public static String oddChecker(String word){
        int length = word.length();
        int count = 0;
        String lowerCaseWord = word.toLowerCase();
        for(int index=0; index<length/2; index++){
            if(lowerCaseWord.charAt(index) == lowerCaseWord.charAt((length-1)-index))
                count++;
        }

        if(count == length/2)
            return "YES";
        return "NO";
    }
}
